package com.roslin.mwicks.spring.variation.controller.snpchromosome;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;

import java.util.Iterator;
import java.util.List;

import java.io.File;
import java.io.InputStream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.roslin.mwicks.utility.FileUtil;

import com.roslin.mwicks.spring.variation.dto.web.objects.snpchromosome.DTODownloadSNPChromosome;
import com.roslin.mwicks.spring.variation.dto.web.objects.snpchromosome.DTOSearchSNPChromosome;

import com.roslin.mwicks.spring.variation.exception.ensemblgene.ExceptionEnsemblGeneDownStreamNotNumeric;
import com.roslin.mwicks.spring.variation.exception.ensemblgene.ExceptionEnsemblGeneDownStreamSearchRangeGreaterThanTenThousand;
import com.roslin.mwicks.spring.variation.exception.ensemblgene.ExceptionEnsemblGeneMultiplesFound;
import com.roslin.mwicks.spring.variation.exception.ensemblgene.ExceptionEnsemblGeneNotFound;
import com.roslin.mwicks.spring.variation.exception.ensemblgene.ExceptionEnsemblGeneSearchRangeLessThanZero;
import com.roslin.mwicks.spring.variation.exception.ensemblgene.ExceptionEnsemblGeneUpStreamNotNumeric;
import com.roslin.mwicks.spring.variation.exception.ensemblgene.ExceptionEnsemblGeneUpStreamSearchRangeGreaterThanTenThousand;

import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeHighCoordinateNotSupplied;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeLowCoordinateNotSupplied;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeAlternativeAlleleNotSupplied;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeHighCoordinateNotNumeric;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeLowCoordinateNotNumeric;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeNotSelected;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeReferenceAlleleNotSupplied;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeSearchFilterProteinAlignNumberValueNotNumeric;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeSearchFilterProveanScoreValueNotNumeric;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeSearchFilterSiftConservationScoreValueNotNumeric;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeSearchFilterSiftScoreValueNotNumeric;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeSearchFilterTotalNumberSeqAlignedValueNotNumeric;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeSearchRangeGreaterThanOneMillion;
import com.roslin.mwicks.spring.variation.exception.snpchromosome.ExceptionSNPChromosomeSelectedWithGeneName;

import com.roslin.mwicks.spring.variation.model.other.CSVResponseSNPChromosome;
import com.roslin.mwicks.spring.variation.model.other.PageSNPChromosome;

import com.roslin.mwicks.spring.variation.model.snpchromosome.SNPChromosome;
import com.roslin.mwicks.spring.variation.routines.ConvertFiletoDTOSearchSNPChromosomeList;
import com.roslin.mwicks.spring.variation.serviceinterface.ensemblgene.ServiceEnsemblGene;

import com.roslin.mwicks.spring.variation.serviceinterface.snpchromosome.ServiceSNPChromosome;


/**
 * @author Mike Wicks
 */
@Controller
@SessionAttributes("DTOSearchSNPChromosome")
public class ControllerSNPChromosome extends AbstractController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ControllerSNPChromosome.class);
    
    protected static final String FEEDBACK_MESSAGE_KEY_UPLOAD_RESULTS_SUCCESS = "feedback.message.upload.results.success";
    
    protected static final String ERROR_MESSAGE_KEY_UPLOAD_RESULTS_EMPTY = "error.message.upload.results.empty";

    protected static final String FEEDBACK_MESSAGE_KEY_SEARCH_RESULTS_SINGLE = "feedback.message.search.results.single";
    protected static final String FEEDBACK_MESSAGE_KEY_SEARCH_RESULTS_MULTIPLE = "feedback.message.search.results.multiple";

    protected static final String ERROR_MESSAGE_SEARCH_GENE_NAME_MULTIPLE = "error.message.search.gene.multiple";
    protected static final String ERROR_MESSAGE_SEARCH_GENE_NAME_UNKNOWN = "error.message.search.gene.unknown";
    
    protected static final String ERROR_MESSAGE_SEARCH_NOT_NUMERIC_UP_STREAM = "error.message.search.notnumeric.upstream";
    protected static final String ERROR_MESSAGE_SEARCH_NOT_NUMERIC_DOWN_STREAM = "error.message.search.notnumeric.downstream";

    protected static final String ERROR_MESSAGE_SEARCH_RANGE_NEGATIVE = "error.message.search.range.negative";
    protected static final String ERROR_MESSAGE_SEARCH_UPSTREAM_TEN_THOUSAND_BASE_PAIRS = "error.message.search.upstream.outsiderange.tenthousand";
    protected static final String ERROR_MESSAGE_SEARCH_DOWNSTREAM_TEN_THOUSAND_BASE_PAIRS = "error.message.search.downstream.outsiderange.tenthousand";
    protected static final String ERROR_MESSAGE_SEARCH_ONE_MILLION_BASE_PAIRS = "error.message.search.outsiderange.onemillion";
    
    protected static final String ERROR_MESSAGE_SEARCH_OUTSIDE_RANGE_LOW_POSITION_GE_HIGH_POSITION = "error.message.search.outsiderange.lowPositionGEHighPosition";
    
    protected static final String ERROR_MESSAGE_SEARCH_NOT_NUMERIC_LOW_POSITION = "error.message.search.notnumeric.lowPosition";
    protected static final String ERROR_MESSAGE_SEARCH_NOT_NUMERIC_HIGH_POSITION = "error.message.search.notnumeric.highPosition";
    
    protected static final String ERROR_MESSAGE_SEARCH_NOT_SUPPLIED_LOW_POSITION = "error.message.search.notsupplied.lowPosition";
    protected static final String ERROR_MESSAGE_SEARCH_NOT_SUPPLIED_HIGH_POSITION = "error.message.search.notsupplied.highPosition";

    protected static final String ERROR_MESSAGE_SEARCH_NOTCHOSEN_CHROMOSOME_NOT_SELECTED = "error.message.search.notchosen.chromosome";
    protected static final String ERROR_MESSAGE_SEARCH_NOTCHOSEN_REFERENCE_NOT_SELECTED = "error.message.search.notchosen.referenceStrain";
    protected static final String ERROR_MESSAGE_SEARCH_NOTCHOSEN_ALTERNATIVE_NOT_SELECTED = "error.message.search.notchosen.alternativeStrain";
    protected static final String ERROR_MESSAGE_SEARCH_EQUALS_REFERENCE_EQUALS_ALTERNATIVE = "error.message.search.equals.referenceStrainEQalternativeStrain";
    protected static final String ERROR_MESSAGE_SEARCH_CHOSEN_CHROMOSOME_AND_GENENAME = "error.message.search.notchosen.chromosomeANDgenename";
    
    protected static final String ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_SIFT_SCORE = "error.message.search.filter.notnumeric.searchFilterSiftScore";
    protected static final String ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_SIFT_CONSERVATION_SCORE = "error.message.search.filter.notnumeric.searchFilterSiftConservationScore";
    protected static final String ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_PROTEIN_ALIGN_NUMBER = "error.message.search.filter.notnumeric.searchFilterProteinAlignNumber";
    protected static final String ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_TOTAL_NUMBER_SEQ_ALIGNED = "error.message.search.filter.notnumeric.searchFilterTotalNumberSeqAligned";
    protected static final String ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_PROVEAN_SCORE = "error.message.search.filter.notnumeric.searchFilterProveanScore";

    protected static final String ERROR_MESSAGE_SEARCH_GENE_NAME_MULTIPLE_FILE = "error.message.search.gene.multiple.file";
    protected static final String ERROR_MESSAGE_SEARCH_GENE_NAME_UNKNOWN_FILE = "error.message.search.gene.unknown.file";
    
    protected static final String ERROR_MESSAGE_SEARCH_NOT_NUMERIC_UP_STREAM_FILE = "error.message.search.notnumeric.upstream.file";
    protected static final String ERROR_MESSAGE_SEARCH_NOT_NUMERIC_DOWN_STREAM_FILE = "error.message.search.notnumeric.downstream.file";

    protected static final String ERROR_MESSAGE_SEARCH_RANGE_NEGATIVE_FILE = "error.message.search.range.negative.file";
    protected static final String ERROR_MESSAGE_SEARCH_UPSTREAM_TEN_THOUSAND_BASE_PAIRS_FILE = "error.message.search.upstream.outsiderange.tenthousand.file";
    protected static final String ERROR_MESSAGE_SEARCH_DOWNSTREAM_TEN_THOUSAND_BASE_PAIRS_FILE = "error.message.search.downstream.outsiderange.tenthousand.file";
    protected static final String ERROR_MESSAGE_SEARCH_ONE_MILLION_BASE_PAIRS_FILE = "error.message.search.outsiderange.onemillion.file";
    
    protected static final String ERROR_MESSAGE_SEARCH_OUTSIDE_RANGE_LOW_POSITION_GE_HIGH_POSITION_FILE = "error.message.search.outsiderange.lowPositionGEHighPosition.file";
    
    protected static final String ERROR_MESSAGE_SEARCH_NOT_NUMERIC_LOW_POSITION_FILE = "error.message.search.notnumeric.lowPosition.file";
    protected static final String ERROR_MESSAGE_SEARCH_NOT_NUMERIC_HIGH_POSITION_FILE = "error.message.search.notnumeric.highPosition.file";
    
    protected static final String ERROR_MESSAGE_SEARCH_NOT_SUPPLIED_LOW_POSITION_FILE = "error.message.search.notsupplied.lowPosition.file";
    protected static final String ERROR_MESSAGE_SEARCH_NOT_SUPPLIED_HIGH_POSITION_FILE = "error.message.search.notsupplied.highPosition.file";

    protected static final String ERROR_MESSAGE_SEARCH_NOTCHOSEN_CHROMOSOME_NOT_SELECTED_FILE = "error.message.search.notchosen.chromosome.file";
    protected static final String ERROR_MESSAGE_SEARCH_NOTCHOSEN_REFERENCE_NOT_SELECTED_FILE = "error.message.search.notchosen.referenceStrain.file";
    protected static final String ERROR_MESSAGE_SEARCH_NOTCHOSEN_ALTERNATIVE_NOT_SELECTED_FILE = "error.message.search.notchosen.alternativeStrain.file";
    protected static final String ERROR_MESSAGE_SEARCH_EQUALS_REFERENCE_EQUALS_ALTERNATIVE_FILE = "error.message.search.equals.referenceStrainEQalternativeStrain.file";
    protected static final String ERROR_MESSAGE_SEARCH_CHOSEN_CHROMOSOME_AND_GENENAME_FILE = "error.message.search.notchosen.chromosomeANDgenename.file";

    protected static final String ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_SIFT_SCORE_FILE = "error.message.search.filter.notnumeric.searchFilterSiftScore.file";
    protected static final String ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_SIFT_CONSERVATION_SCORE_FILE = "error.message.search.filter.notnumeric.searchFilterSiftConservationScore.file";
    protected static final String ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_PROTEIN_ALIGN_NUMBER_FILE = "error.message.search.filter.notnumeric.searchFilterProteinAlignNumber.file";
    protected static final String ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_TOTAL_NUMBER_SEQ_ALIGNED_FILE = "error.message.search.filter.notnumeric.searchFilterTotalNumberSeqAligned.file";
    protected static final String ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_PROVEAN_SCORE_FILE = "error.message.search.filter.notnumeric.searchFilterProveanScore.file";

    protected static final String MODEL_ATTIRUTE_SNPCHROMOSOME = "SNPChromosome";
    protected static final String MODEL_ATTRIBUTE_SNPCHROMOSOMES = "SNPChromosomes";
    
    protected static final String MODEL_ATTRIBUTE_SEARCHCRITERIA = "dtoSearch";
    protected static final String MODEL_ATTRIBUTE_DOWNLOADCRITERIA = "dtoDownload";

    protected static final String SNPCHROMOSOME_UPLOAD_VIEW = "SNPChromosome/page_upload";
    protected static final String SNPCHROMOSOME_SEARCH_VIEW = "SNPChromosome/page_search";
    protected static final String SNPCHROMOSOME_SEARCH_VIEW_HELP = "SNPChromosome/page_search_help";
    protected static final String SNPCHROMOSOME_SEARCH_RESULT_VIEW = "SNPChromosome/page_search_results";
    protected static final String SNPCHROMOSOME_SEARCH_RESULT_VIEW_HELP = "SNPChromosome/page_search_results_help";
    
    protected static final String REQUEST_MAPPING_LIST = "/";
    
    protected static final String REQUEST_ROOT_MAPPING = "/";

    protected static final String REQUEST_UPLOAD_MAPPING = "/upload";
    protected static final String REQUEST_DOWNLOAD_MAPPING = "/download";

    protected static final String REQUEST_SEARCH_MAPPING = "/search";
    protected static final String REQUEST_SEARCH_RESULT_MAPPING = "/results";

    protected static final String REQUEST_SEARCH_HELP_MAPPING = "/search_help";
    protected static final String REQUEST_SEARCH_RESULT_HELP_MAPPING = "/search_results_help";

    protected static final String REQUEST_PARAM_SEARCH_UPLOAD_FILE = "searchUploadFile";

    protected static final String REQUEST_PARAM_CHROMOSOME = "chr";
    protected static final String REQUEST_PARAM_LOW_RANGE = "low";
    protected static final String REQUEST_PARAM_HIGH_RANGE = "high";
    protected static final String REQUEST_PARAM_REFERENCE_STRAIN = "ref";
    protected static final String REQUEST_PARAM_ALTERNATIVE_STRAIN = "alt";

    protected static final String NONE = "NONE";
    
    private static String UPLOADED_FOLDER = "/tmp/";

    private static final String MSGLEVEL = "*";

	
    @Resource
    private MessageSource messageSource;
    
    @Resource
    private ServiceSNPChromosome servicesnpchromosome;

    @Resource
    private ServiceEnsemblGene serviceensemblgene;
    
    
    // --------------------------------------------------------------------------------------------
    // HTTP GET Requests --------------------------------------------------------------------------
    // --------------------------------------------------------------------------------------------
    
    /**
     * Processes requests for the Search Help page.
     * @param model
     * @return The name of the Search Help view.
     * @method GET
     */
    @RequestMapping(value = REQUEST_SEARCH_HELP_MAPPING, method = RequestMethod.GET)
    public String showSearchHelp(
    	Model model
    	) {
    	
        LOGGER.debug("Rendering SNPChromosome Search Help page");

        return SNPCHROMOSOME_SEARCH_VIEW_HELP;
    }

    
    /**
     * Processes requests for the Search Results Help page.
     * @param model
     * @return The name of the Search Results Help view.
     * @method GET
     */
    @RequestMapping(value = REQUEST_SEARCH_RESULT_HELP_MAPPING, method = RequestMethod.GET)
    public String showSearchResultsHelp(
    	Model model
    	) {
    	
        LOGGER.debug("Rendering SNPChromosome Search Help page");

        return SNPCHROMOSOME_SEARCH_RESULT_VIEW_HELP;
    }

    
    /**
     * Processes requests to home (Search) page .
     * @param model
     * @return The name of the SNPInsertionDeletion Search (form) view.
     * @method GET
     */
    @RequestMapping(value = { REQUEST_ROOT_MAPPING, REQUEST_SEARCH_MAPPING }, method = RequestMethod.GET)
    public String searchGet(
        @ModelAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA) DTOSearchSNPChromosome dtoSearch, 
    	Model model
    	) {
    	
        LOGGER.debug("Rendering SNPChromosome Search page");

        model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
        
        return SNPCHROMOSOME_SEARCH_VIEW;
    }

    
    /**
     * Processes requests for the Upload page.
     * @param model
     * @return The name of the Upload view.
     * @method GET
     */
    @RequestMapping(value = REQUEST_UPLOAD_MAPPING, method = RequestMethod.GET)
    public String uploadGet( 
    		@ModelAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA) DTOSearchSNPChromosome dtoSearch, 
        	Model model
    		) {

        LOGGER.debug("Rendering SNPChromosome Upload page");

        return SNPCHROMOSOME_UPLOAD_VIEW;
    }

    
    /**
     * Processes requests to home page which lists all available SNPChromosome.
     * @param model
     * @param chr, Chromosome 
     * @param low, Low Search Coordinate
     * @param high, High Search Coordinate
     * @param ref, Reference Allele
     * @param alt, Alternative Allele
     * @return The name of the SNPChromosome list view.
     * @method GET
     */
	@RequestMapping(value = REQUEST_SEARCH_RESULT_MAPPING, method = RequestMethod.GET)
	public String getSearchedSNPChromosomePage( 
			@RequestParam(value = REQUEST_PARAM_CHROMOSOME, required = true) String chr, 
			@RequestParam(value = REQUEST_PARAM_LOW_RANGE, required = true) String low,
	    	@RequestParam(value = REQUEST_PARAM_HIGH_RANGE, required = true) String high,
	    	@RequestParam(value = REQUEST_PARAM_REFERENCE_STRAIN, required = true) String ref,
	    	@RequestParam(value = REQUEST_PARAM_ALTERNATIVE_STRAIN, required = true) String alt,
	    	@ModelAttribute(MODEL_ATTRIBUTE_DOWNLOADCRITERIA) DTODownloadSNPChromosome dtoDownload,
	    	Model model, 
	    	RedirectAttributes attributes ) {

		DTOSearchSNPChromosome dtoSearch = new DTOSearchSNPChromosome(1, low, high, ref, alt, chr); 

    	String successMsg = "";
    	
        PageSNPChromosome pagesnpchromosome = null;

    	try {
    		
			successMsg = dtoSearch.isDTOSearchSNPChromosomeValid(serviceensemblgene);
		} 
        catch (ExceptionSNPChromosomeSelectedWithGeneName e) {
        	
        	LOGGER.debug("ERROR: Search Chromosome Supplied AND Ensembl Gene Name Supplied !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_CHOSEN_CHROMOSOME_AND_GENENAME);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
        }
        catch (ExceptionSNPChromosomeNotSelected e) {
        	
        	LOGGER.debug("ERROR: The Search Chromosome has NOT been chosen !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOTCHOSEN_CHROMOSOME_NOT_SELECTED);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
        }
        catch (ExceptionSNPChromosomeSearchFilterProteinAlignNumberValueNotNumeric e) {
        	
        	LOGGER.debug("ERROR: The Search Filter Protein Alignment Number is NOT Numeric !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_PROTEIN_ALIGN_NUMBER);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
        }
        catch (ExceptionSNPChromosomeSearchFilterProveanScoreValueNotNumeric e) {
        	
        	LOGGER.debug("ERROR: The Search Filter PROVEAN Score is NOT Numeric !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_PROVEAN_SCORE);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
        }
        catch (ExceptionSNPChromosomeSearchFilterSiftConservationScoreValueNotNumeric e) {
        	
        	LOGGER.debug("ERROR: The Search Filter SIFT Conservation Score is NOT Numeric !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_SIFT_CONSERVATION_SCORE);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
        }
        catch (ExceptionSNPChromosomeSearchFilterSiftScoreValueNotNumeric e) {
        	
        	LOGGER.debug("ERROR: The Search Filter SIFT Score is NOT Numeric !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_SIFT_SCORE);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
        }
        catch (ExceptionSNPChromosomeSearchFilterTotalNumberSeqAlignedValueNotNumeric e) {
        	
        	LOGGER.debug("ERROR: The Search Filter Total Number of Sequence Aligned is NOT Numeric !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_TOTAL_NUMBER_SEQ_ALIGNED);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
        }
        catch (ExceptionEnsemblGeneSearchRangeLessThanZero e) {
        	
        	LOGGER.debug("ERROR: Search Range is LESS THAN Zero !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_RANGE_NEGATIVE);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
        }
        catch (ExceptionEnsemblGeneUpStreamSearchRangeGreaterThanTenThousand e) {
        	
        	LOGGER.debug("ERROR: Up Stream Search Range is GREATER THAN Ten Thousand Base Pairs !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_UPSTREAM_TEN_THOUSAND_BASE_PAIRS);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
        }
        catch (ExceptionEnsemblGeneDownStreamSearchRangeGreaterThanTenThousand e) {
        	
        	LOGGER.debug("ERROR: Down Stream Search Range is GREATER THAN Ten Thousand Base Pairs !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_DOWNSTREAM_TEN_THOUSAND_BASE_PAIRS);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
        }
        catch (ExceptionEnsemblGeneUpStreamNotNumeric e) {
        	
        	LOGGER.debug("ERROR: Search Upstream Range is NOT Numeric !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOT_NUMERIC_UP_STREAM);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
        }
        catch (ExceptionEnsemblGeneDownStreamNotNumeric e) {
        	
        	LOGGER.debug("ERROR: Search Downstream Range is NOT Numeric !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOT_NUMERIC_DOWN_STREAM);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
        }
        catch (ExceptionEnsemblGeneMultiplesFound e) {
        	
        	LOGGER.debug("ERROR: Multiple Genes Found !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_GENE_NAME_MULTIPLE);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
        }
        catch (ExceptionEnsemblGeneNotFound e) {
        	
        	LOGGER.debug("ERROR: Requested Gene does NOT Exist !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_GENE_NAME_UNKNOWN);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
        }
        catch (ExceptionSNPChromosomeSearchRangeGreaterThanOneMillion e) {
        	
        	LOGGER.debug("ERROR: Search Range is GREATER THAN One Million Base Pairs !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_ONE_MILLION_BASE_PAIRS);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
        }
        catch (ExceptionSNPChromosomeLowCoordinateNotNumeric e) {
        	
        	LOGGER.debug("ERROR: Search Low Co-ordinate is NOT Numeric !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOT_NUMERIC_LOW_POSITION);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
        }
        catch (ExceptionSNPChromosomeHighCoordinateNotNumeric e) {
        	
        	LOGGER.debug("ERROR: Search High Co-ordinate is NOT Numeric !!!");
        	addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOT_NUMERIC_HIGH_POSITION);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
        }
        catch (ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate e) {
        	
        	LOGGER.debug("ERROR: Search Low Co-ordinate is GREATER THAN Search High Co-ordinate !!!");
        	addErrorMessage(model, ERROR_MESSAGE_SEARCH_OUTSIDE_RANGE_LOW_POSITION_GE_HIGH_POSITION);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
        }
        catch (ExceptionSNPChromosomeReferenceAlleleNotSupplied e) {
        	
        	LOGGER.debug("ERROR: Reference Allele Not Supplied !!!");
        	addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOTCHOSEN_REFERENCE_NOT_SELECTED);
        	model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
        	
            return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
        }
        catch (ExceptionSNPChromosomeAlternativeAlleleNotSupplied e) {
        	
        	LOGGER.debug("ERROR: Alternative Allele Not Supplied !!!");
        	addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOTCHOSEN_ALTERNATIVE_NOT_SELECTED);
        	model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
        	
            return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
        }
        catch (ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele e) {
        	
        	LOGGER.debug("ERROR: Reference Allele EQUALS Alternative Allele !!!");
        	addErrorMessage(model, ERROR_MESSAGE_SEARCH_EQUALS_REFERENCE_EQUALS_ALTERNATIVE);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
        } 
    	catch (ExceptionSNPChromosomeHighCoordinateNotSupplied e) {
    		
        	LOGGER.debug("ERROR: Search High Co-ordinate is NOT Supplied !!!");
        	addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOT_SUPPLIED_HIGH_POSITION);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
		} 
    	catch (ExceptionSNPChromosomeLowCoordinateNotSupplied e) {
    		
        	LOGGER.debug("ERROR: Search Low Co-ordinate is NOT Supplied !!!");
        	addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOT_SUPPLIED_LOW_POSITION);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
    	}
    	catch (Exception e) {

    		e.printStackTrace();
    	}
    	
        pagesnpchromosome = servicesnpchromosome.search(dtoSearch, 1, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsString());

        if ( pagesnpchromosome.size() == 0) {
        	
            LOGGER.debug("EMPTY SNPChromosomes !!! ");
            model.addAttribute("feedbackMessage", addFeedbackMessageAsString(FEEDBACK_MESSAGE_KEY_SEARCH_RESULTS_MULTIPLE, 0, successMsg));
        }
        else {
        	
            if ( pagesnpchromosome.getTotalElements() == 1 ) {
            	
                model.addAttribute("feedbackMessage", addFeedbackMessageAsString(FEEDBACK_MESSAGE_KEY_SEARCH_RESULTS_SINGLE, pagesnpchromosome.getTotalElements(), successMsg));
            }
            else {
            	
                model.addAttribute("feedbackMessage", addFeedbackMessageAsString(FEEDBACK_MESSAGE_KEY_SEARCH_RESULTS_MULTIPLE, pagesnpchromosome.getTotalElements(), successMsg));
            }
            
        	//pagesnpchromosome
            int current = pagesnpchromosome.getPageNumber();
            int begin = Math.max(1, current - 5);
            int end = Math.min(begin + 10, pagesnpchromosome.getTotalPages());
            int totalPages = pagesnpchromosome.getTotalPages();

            model.addAttribute("SNPChromosome", pagesnpchromosome);
            model.addAttribute("beginIndex", begin);
            model.addAttribute("endIndex", end);
            model.addAttribute("currentIndex", current);
            model.addAttribute("totalPages", totalPages);
            
            dtoDownload = new DTODownloadSNPChromosome(
            		"", 
            		"",
            		dtoSearch.getSearchLowRange(),
            		dtoSearch.getSearchHighRange(),
            		dtoSearch.getSearchReference(),
            		dtoSearch.getSearchAlternative(),
            		dtoSearch.getSearchChromosome(),
            		dtoSearch.getSearchFilterSiftScoreValue(),
            		dtoSearch.getSearchFilterSiftConservationScoreValue(),
            		dtoSearch.getSearchFilterProteinAlignNumberValue(),
            		dtoSearch.getSearchFilterTotalNumberSeqAlignedValue(),
            		dtoSearch.getSearchFilterProveanScoreValue(),
            		dtoSearch.getSearchFilterSiftScore(),
            		dtoSearch.getSearchFilterSiftConservationScore(),
            		dtoSearch.getSearchFilterProteinAlignNumber(),
            		dtoSearch.getSearchFilterTotalNumberSeqAligned(),
            		dtoSearch.getSearchFilterProveanScore(),
            		dtoSearch.getSearchSortField(),
            		dtoSearch.getSearchSortDirection(),
            		dtoSearch.getSearchRegion(),
            		dtoSearch.getSearchPredictionCategory(),
            		dtoSearch.getSearchEnsemblTranscript(),
            		dtoSearch.getSearchUploadFileName(),
            		dtoSearch.getSearchUploadFile()
            		);
            
            model.addAttribute(MODEL_ATTRIBUTE_DOWNLOADCRITERIA, dtoDownload);
        }

        return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
    }

	
    // --------------------------------------------------------------------------------------------
    // HTTP POST Requests -------------------------------------------------------------------------
    // --------------------------------------------------------------------------------------------

    /**
     * Processes requests from the Upload.
     * @param model
     * @return The name of the SNPChromosome Results, list  view.
     * @method POST
     */
    @RequestMapping(value = REQUEST_UPLOAD_MAPPING, method = RequestMethod.POST)
    public String uploadPost(
    		@RequestParam(REQUEST_PARAM_SEARCH_UPLOAD_FILE) MultipartFile file,
            @ModelAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA) DTOSearchSNPChromosome dtoSearch, 
            RedirectAttributes redirectAttributes, 
            Model model
            ) {

        LOGGER.debug("Processing SNPChromosome Upload page");

        if ( file.isEmpty() ) {

            LOGGER.debug("Empty File input field !!!");
        	addErrorMessage(model, ERROR_MESSAGE_KEY_UPLOAD_RESULTS_EMPTY);

            return SNPCHROMOSOME_SEARCH_VIEW;
        }

        try {

            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
            Files.write(path, bytes);
            
            File tmpFile = path.toFile();
            InputStream csvInput = FileUtil.readStream(tmpFile);

            int totalRequestCount = 0;
    		
            List<DTOSearchSNPChromosome> dtosearchsnpchromosomeList = ConvertFiletoDTOSearchSNPChromosomeList.run( csvInput, totalRequestCount, MSGLEVEL, MSGLEVEL );

	        Iterator<DTOSearchSNPChromosome> iteratorDTOSearchSNPChromosome = dtosearchsnpchromosomeList.iterator();

	        PageSNPChromosome pagesnpchromosomeTotal = new PageSNPChromosome();
	        
	        pagesnpchromosomeTotal.setPageNumber(1);
	        pagesnpchromosomeTotal.setTotalElements(0);
	        pagesnpchromosomeTotal.setTotalPages(1);
	        
	    	String successMsg = "";
	    	
	     	while ( iteratorDTOSearchSNPChromosome.hasNext() ) {
	    		
	    		DTOSearchSNPChromosome dtosearchsnpchromosome = iteratorDTOSearchSNPChromosome.next();
	    		
	            try {
	            	
	    			successMsg = dtosearchsnpchromosome.isDTOSearchSNPChromosomeValid( serviceensemblgene );

	            }
	            catch (ExceptionSNPChromosomeSelectedWithGeneName e) {
	            	
	            	LOGGER.debug("ERROR: Search Chromosome Supplied AND Ensembl Gene Name Supplied !!!");
	                addErrorMessage(model, ERROR_MESSAGE_SEARCH_CHOSEN_CHROMOSOME_AND_GENENAME_FILE);
	                model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
	                
	                return SNPCHROMOSOME_SEARCH_VIEW;
	            }
	            catch (ExceptionSNPChromosomeNotSelected e) {
	            	
	            	LOGGER.debug("ERROR: The Search Chromosome has NOT been chosen !!!");
	                addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOTCHOSEN_CHROMOSOME_NOT_SELECTED_FILE);
	                model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
	                
	                return SNPCHROMOSOME_SEARCH_VIEW;
	            }
	            catch (ExceptionSNPChromosomeSearchFilterProteinAlignNumberValueNotNumeric e) {
	            	
	            	LOGGER.debug("ERROR: The Search Filter Protein Alignment Number is NOT Numeric !!!");
	                addErrorMessage(model, ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_PROTEIN_ALIGN_NUMBER_FILE);
	                model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
	                
	                return SNPCHROMOSOME_SEARCH_VIEW;
	            }
	            catch (ExceptionSNPChromosomeSearchFilterProveanScoreValueNotNumeric e) {
	            	
	            	LOGGER.debug("ERROR: The Search Filter PROVEAN Score is NOT Numeric !!!");
	                addErrorMessage(model, ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_PROVEAN_SCORE_FILE);
	                model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
	                
	                return SNPCHROMOSOME_SEARCH_VIEW;
	            }
	            catch (ExceptionSNPChromosomeSearchFilterSiftConservationScoreValueNotNumeric e) {
	            	
	            	LOGGER.debug("ERROR: The Search Filter SIFT Conservation Score is NOT Numeric !!!");
	                addErrorMessage(model, ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_SIFT_CONSERVATION_SCORE_FILE);
	                model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
	                
	                return SNPCHROMOSOME_SEARCH_VIEW;
	            }
	            catch (ExceptionSNPChromosomeSearchFilterSiftScoreValueNotNumeric e) {
	            	
	            	LOGGER.debug("ERROR: The Search Filter SIFT Score is NOT Numeric !!!");
	                addErrorMessage(model, ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_SIFT_SCORE_FILE);
	                model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
	                
	                return SNPCHROMOSOME_SEARCH_VIEW;
	            }
	            catch (ExceptionSNPChromosomeSearchFilterTotalNumberSeqAlignedValueNotNumeric e) {
	            	
	            	LOGGER.debug("ERROR: The Search Filter Total Number of Sequence Aligned is NOT Numeric !!!");
	                addErrorMessage(model, ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_TOTAL_NUMBER_SEQ_ALIGNED_FILE);
	                model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
	                
	                return SNPCHROMOSOME_SEARCH_VIEW;
	            }
	            catch (ExceptionEnsemblGeneSearchRangeLessThanZero e) {
	            	
	            	LOGGER.debug("ERROR: Search Range is LESS THAN Zero !!!");
	                addErrorMessage(model, ERROR_MESSAGE_SEARCH_RANGE_NEGATIVE_FILE);
	                model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
	                
	                return SNPCHROMOSOME_SEARCH_VIEW;
	            }
	            catch (ExceptionEnsemblGeneUpStreamSearchRangeGreaterThanTenThousand e) {
	            	
	            	LOGGER.debug("ERROR: Up Stream Search Range is GREATER THAN Ten Thousand Base Pairs !!!");
	                addErrorMessage(model, ERROR_MESSAGE_SEARCH_UPSTREAM_TEN_THOUSAND_BASE_PAIRS_FILE);
	                model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
	                
	                return SNPCHROMOSOME_SEARCH_VIEW;
	            }
	            catch (ExceptionEnsemblGeneDownStreamSearchRangeGreaterThanTenThousand e) {
	            	
	            	LOGGER.debug("ERROR: Down Stream Search Range is GREATER THAN Ten Thousand Base Pairs !!!");
	                addErrorMessage(model, ERROR_MESSAGE_SEARCH_DOWNSTREAM_TEN_THOUSAND_BASE_PAIRS_FILE);
	                model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
	                
	                return SNPCHROMOSOME_SEARCH_VIEW;
	            }
	            catch (ExceptionEnsemblGeneUpStreamNotNumeric e) {
	            	
	            	LOGGER.debug("ERROR: Search Upstream Range is NOT Numeric !!!");
	                addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOT_NUMERIC_UP_STREAM_FILE);
	                model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
	                
	                return SNPCHROMOSOME_SEARCH_VIEW;
	            }
	            catch (ExceptionEnsemblGeneDownStreamNotNumeric e) {
	            	
	            	LOGGER.debug("ERROR: Search Downstream Range is NOT Numeric !!!");
	                addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOT_NUMERIC_DOWN_STREAM_FILE);
	                model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
	                
	                return SNPCHROMOSOME_SEARCH_VIEW;
	            }
	            catch (ExceptionEnsemblGeneMultiplesFound e) {
	            	
	            	LOGGER.debug("ERROR: Multiple Genes Found !!!");
	                addErrorMessage(model, ERROR_MESSAGE_SEARCH_GENE_NAME_MULTIPLE_FILE);
	                model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
	                
	                return SNPCHROMOSOME_SEARCH_VIEW;
	            }
	            catch (ExceptionEnsemblGeneNotFound e) {
	            	
	            	LOGGER.debug("ERROR: Requested Gene does NOT Exist !!!");
	                addErrorMessage(model, ERROR_MESSAGE_SEARCH_GENE_NAME_UNKNOWN_FILE);
	                model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
	                
	                return SNPCHROMOSOME_SEARCH_VIEW;
	            }
	            catch (ExceptionSNPChromosomeSearchRangeGreaterThanOneMillion e) {
	            	
	            	LOGGER.debug("ERROR: Search Range is GREATER THAN One Million Base Pairs !!!");
	                addErrorMessage(model, ERROR_MESSAGE_SEARCH_ONE_MILLION_BASE_PAIRS_FILE);
	                model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
	                
	                return SNPCHROMOSOME_SEARCH_VIEW;
	            }
	            catch (ExceptionSNPChromosomeLowCoordinateNotNumeric e) {
	            	
	            	LOGGER.debug("ERROR: Search Low Co-ordinate is NOT Numeric !!!");
	                addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOT_NUMERIC_LOW_POSITION_FILE);
	                model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
	                
	                return SNPCHROMOSOME_SEARCH_VIEW;
	            }
	            catch (ExceptionSNPChromosomeHighCoordinateNotNumeric e) {
	            	
	            	LOGGER.debug("ERROR: Search High Co-ordinate is NOT Numeric !!!");
	            	addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOT_NUMERIC_HIGH_POSITION_FILE);
	                model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
	                
	                return SNPCHROMOSOME_SEARCH_VIEW;
	            }
	            catch (ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate e) {
	            	
	            	LOGGER.debug("ERROR: Search Low Co-ordinate is GREATER THAN Search High Co-ordinate !!!");
	            	addErrorMessage(model, ERROR_MESSAGE_SEARCH_OUTSIDE_RANGE_LOW_POSITION_GE_HIGH_POSITION_FILE);
	                model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
	                
	                return SNPCHROMOSOME_SEARCH_VIEW;
	            }
	            catch (ExceptionSNPChromosomeReferenceAlleleNotSupplied e) {
	            	
	            	LOGGER.debug("ERROR: Reference Allele Not Supplied !!!");
	            	addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOTCHOSEN_REFERENCE_NOT_SELECTED_FILE);
	            	model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
	            	
	                return SNPCHROMOSOME_SEARCH_VIEW;
	            }
	            catch (ExceptionSNPChromosomeAlternativeAlleleNotSupplied e) {
	            	
	            	LOGGER.debug("ERROR: Alternative Allele Not Supplied !!!");
	            	addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOTCHOSEN_ALTERNATIVE_NOT_SELECTED_FILE);
	            	model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
	            	
	                return SNPCHROMOSOME_SEARCH_VIEW;
	            }
	            catch (ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele e) {
	            	
	            	LOGGER.debug("ERROR: Reference Allele EQUALS Alternative Allele !!!");
	            	addErrorMessage(model, ERROR_MESSAGE_SEARCH_EQUALS_REFERENCE_EQUALS_ALTERNATIVE_FILE);
	                model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
	                
	                return SNPCHROMOSOME_SEARCH_VIEW;
	            } 
	        	catch (ExceptionSNPChromosomeHighCoordinateNotSupplied e) {
	        		
	            	LOGGER.debug("ERROR: Search High Co-ordinate is NOT Supplied !!!");
	            	addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOT_SUPPLIED_HIGH_POSITION_FILE);
	                model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
	                
	                return SNPCHROMOSOME_SEARCH_VIEW;
	        	} 
	        	catch (ExceptionSNPChromosomeLowCoordinateNotSupplied e) {
	        		
	            	LOGGER.debug("ERROR: Search Low Co-ordinate is NOT Supplied !!!");
	            	addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOT_SUPPLIED_LOW_POSITION_FILE);
	                model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
	                
	                return SNPCHROMOSOME_SEARCH_VIEW;
	        	}

        		PageSNPChromosome pagesnpchromosomeRequest = servicesnpchromosome.search(dtosearchsnpchromosome, 1, dtosearchsnpchromosome.getSearchSortFieldAsString(), dtosearchsnpchromosome.getSearchSortDirectionAsString());

	            if ( pagesnpchromosomeRequest.size() != 0 ) {
	            	
            		Iterator<SNPChromosome> iteratorSNPChromosome = pagesnpchromosomeRequest.iterator();

        	     	while ( iteratorSNPChromosome.hasNext() ) {
        	    		
        	     		SNPChromosome snpchromosome = iteratorSNPChromosome.next();

        	    		if ( !pagesnpchromosomeTotal.contains( snpchromosome )) {
        	    			
        	    			pagesnpchromosomeTotal.incrementTotalElements();
        	    			
        	            	pagesnpchromosomeTotal.add( snpchromosome );
        	    		}
        	     	}
	            }
	     	}

	     	successMsg = " from the File \"" + file.getOriginalFilename() + "\"";
	     	
	     	dtoSearch.setSearchUploadFileName( path.toString() );
	     	dtoSearch.setSearchUploadFile( file );
	     			
	     	if ( pagesnpchromosomeTotal.size() == 0 ) {
            	
                LOGGER.debug("EMPTY SNPChromosomes !!! ");
            	addFeedbackMessage( model, FEEDBACK_MESSAGE_KEY_SEARCH_RESULTS_MULTIPLE, 0, successMsg );
                model.addAttribute( MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch );

                return SNPCHROMOSOME_SEARCH_VIEW;
            }
            else {

                int current = pagesnpchromosomeTotal.getPageNumber();
                int begin = Math.max(1, current - 5);
                int end = Math.min(begin + 10, pagesnpchromosomeTotal.getTotalPages());
                int totalPages = pagesnpchromosomeTotal.getTotalPages();

                model.addAttribute("SNPChromosome", pagesnpchromosomeTotal);
                model.addAttribute("beginIndex", begin);
                model.addAttribute("endIndex", end);
                model.addAttribute("currentIndex", current);
                model.addAttribute("totalPages", totalPages);
                
            	DTODownloadSNPChromosome dtoDownload = new DTODownloadSNPChromosome( 
            			dtoSearch.getSearchDownStream(),
            	        dtoSearch.getSearchUpStream(),
            			dtoSearch.getSearchLowRange(), 
            			dtoSearch.getSearchHighRange(), 
            			dtoSearch.getSearchReference(), 
            			dtoSearch.getSearchAlternative(), 
            	        dtoSearch.getSearchChromosome(),
            			dtoSearch.getSearchFilterSiftScoreValue(), 
            			dtoSearch.getSearchFilterSiftConservationScoreValue(), 
            			dtoSearch.getSearchFilterProteinAlignNumberValue(), 
            			dtoSearch.getSearchFilterTotalNumberSeqAlignedValue(), 
            			dtoSearch.getSearchFilterProveanScoreValue(), 
            			dtoSearch.getSearchFilterSiftScore(), 
            			dtoSearch.getSearchFilterSiftConservationScore(), 
            			dtoSearch.getSearchFilterProteinAlignNumber(), 
            			dtoSearch.getSearchFilterTotalNumberSeqAligned(), 
            			dtoSearch.getSearchFilterProveanScore(), 
            			dtoSearch.getSearchSortField(), 
            			dtoSearch.getSearchSortDirection(), 
            	        dtoSearch.getSearchRegion(),
            	        dtoSearch.getSearchPredictionCategory(),
            	        dtoSearch.getSearchEnsemblTranscript(),
            	        dtoSearch.getSearchUploadFileName(),
            	        dtoSearch.getSearchUploadFile()
            	);

                model.addAttribute(MODEL_ATTRIBUTE_DOWNLOADCRITERIA, dtoDownload);

                if ( pagesnpchromosomeTotal.getTotalElements() == 1 ) {
                	
                    model.addAttribute( "feedbackMessage", addFeedbackMessageAsString( FEEDBACK_MESSAGE_KEY_SEARCH_RESULTS_SINGLE, pagesnpchromosomeTotal.getTotalElements(), successMsg ) );
                }
                else {
                	
                    model.addAttribute( "feedbackMessage", addFeedbackMessageAsString( FEEDBACK_MESSAGE_KEY_SEARCH_RESULTS_MULTIPLE, pagesnpchromosomeTotal.getTotalElements(), successMsg ) );
                }
                
                return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
            }

        }
    	catch (Exception e) {

    		e.printStackTrace();
    	}

        return SNPCHROMOSOME_SEARCH_VIEW;
    }

    
    /**
     * Processes requests from the home (Search) page which lists all available DTOSearchSNPChromosome.
     * @param model
     * @return The name of the SNPInsertionDeletion Results, list  view.
     * @method POST
     */
	@RequestMapping(value = REQUEST_SEARCH_MAPPING, method = RequestMethod.POST)
    public String searchPost(
    	@ModelAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA) DTOSearchSNPChromosome dtoSearch, 
    	Model model, 
    	RedirectAttributes attributes
    	) {
    	
        LOGGER.debug("Searching SNPChromosomes with search criteria: " + dtoSearch);
        
    	int firstPage = 1;
        
    	String successMsg = "";
    	
        PageSNPChromosome pagesnpchromosome = null;

    	try {
    		
			successMsg = dtoSearch.isDTOSearchSNPChromosomeValid(serviceensemblgene);
		} 
        catch (ExceptionSNPChromosomeSelectedWithGeneName e) {
        	
        	LOGGER.debug("ERROR: Search Chromosome Supplied AND Ensembl Gene Name Supplied !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_CHOSEN_CHROMOSOME_AND_GENENAME);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_VIEW;
        }
        catch (ExceptionSNPChromosomeNotSelected e) {
        	
        	LOGGER.debug("ERROR: The Search Chromosome has NOT been chosen !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOTCHOSEN_CHROMOSOME_NOT_SELECTED);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_VIEW;
        }
        catch (ExceptionSNPChromosomeSearchFilterProteinAlignNumberValueNotNumeric e) {
        	
        	LOGGER.debug("ERROR: The Search Filter Protein Alignment Number is NOT Numeric !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_PROTEIN_ALIGN_NUMBER);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_VIEW;
        }
        catch (ExceptionSNPChromosomeSearchFilterProveanScoreValueNotNumeric e) {
        	
        	LOGGER.debug("ERROR: The Search Filter PROVEAN Score is NOT Numeric !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_PROVEAN_SCORE);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_VIEW;
        }
        catch (ExceptionSNPChromosomeSearchFilterSiftConservationScoreValueNotNumeric e) {
        	
        	LOGGER.debug("ERROR: The Search Filter SIFT Conservation Score is NOT Numeric !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_SIFT_CONSERVATION_SCORE);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_VIEW;
        }
        catch (ExceptionSNPChromosomeSearchFilterSiftScoreValueNotNumeric e) {
        	
        	LOGGER.debug("ERROR: The Search Filter SIFT Score is NOT Numeric !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_SIFT_SCORE);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_VIEW;
        }
        catch (ExceptionSNPChromosomeSearchFilterTotalNumberSeqAlignedValueNotNumeric e) {
        	
        	LOGGER.debug("ERROR: The Search Filter Total Number of Sequence Aligned is NOT Numeric !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_FILTER_NOT_NUMERIC_TOTAL_NUMBER_SEQ_ALIGNED);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_VIEW;
        }
        catch (ExceptionEnsemblGeneSearchRangeLessThanZero e) {
        	
        	LOGGER.debug("ERROR: Search Range is LESS THAN Zero !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_RANGE_NEGATIVE);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_VIEW;
        }
        catch (ExceptionEnsemblGeneUpStreamSearchRangeGreaterThanTenThousand e) {
        	
        	LOGGER.debug("ERROR: Up Stream Search Range is GREATER THAN Ten Thousand Base Pairs !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_UPSTREAM_TEN_THOUSAND_BASE_PAIRS);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_VIEW;
        }
        catch (ExceptionEnsemblGeneDownStreamSearchRangeGreaterThanTenThousand e) {
        	
        	LOGGER.debug("ERROR: Down Stream Search Range is GREATER THAN Ten Thousand Base Pairs !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_DOWNSTREAM_TEN_THOUSAND_BASE_PAIRS);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_VIEW;
        }
        catch (ExceptionEnsemblGeneUpStreamNotNumeric e) {
        	
        	LOGGER.debug("ERROR: Search Upstream Range is NOT Numeric !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOT_NUMERIC_UP_STREAM);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_VIEW;
        }
        catch (ExceptionEnsemblGeneDownStreamNotNumeric e) {
        	
        	LOGGER.debug("ERROR: Search Downstream Range is NOT Numeric !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOT_NUMERIC_DOWN_STREAM);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_VIEW;
        }
        catch (ExceptionEnsemblGeneMultiplesFound e) {
        	
        	LOGGER.debug("ERROR: Multiple Genes Found !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_GENE_NAME_MULTIPLE);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_VIEW;
        }
        catch (ExceptionEnsemblGeneNotFound e) {
        	
        	LOGGER.debug("ERROR: Requested Gene does NOT Exist !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_GENE_NAME_UNKNOWN);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_VIEW;
        }
        catch (ExceptionSNPChromosomeSearchRangeGreaterThanOneMillion e) {
        	
        	LOGGER.debug("ERROR: Search Range is GREATER THAN One Million Base Pairs !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_ONE_MILLION_BASE_PAIRS);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_VIEW;
        }
        catch (ExceptionSNPChromosomeLowCoordinateNotNumeric e) {
        	
        	LOGGER.debug("ERROR: Search Low Co-ordinate is NOT Numeric !!!");
            addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOT_NUMERIC_LOW_POSITION);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_VIEW;
        }
        catch (ExceptionSNPChromosomeHighCoordinateNotNumeric e) {
        	
        	LOGGER.debug("ERROR: Search High Co-ordinate is NOT Numeric !!!");
        	addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOT_NUMERIC_HIGH_POSITION);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_VIEW;
        }
        catch (ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate e) {
        	
        	LOGGER.debug("ERROR: Search Low Co-ordinate is GREATER THAN Search High Co-ordinate !!!");
        	addErrorMessage(model, ERROR_MESSAGE_SEARCH_OUTSIDE_RANGE_LOW_POSITION_GE_HIGH_POSITION);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_VIEW;
        }
        catch (ExceptionSNPChromosomeReferenceAlleleNotSupplied e) {
        	
        	LOGGER.debug("ERROR: Reference Allele Not Supplied !!!");
        	addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOTCHOSEN_REFERENCE_NOT_SELECTED);
        	model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
        	
            return SNPCHROMOSOME_SEARCH_VIEW;
        }
        catch (ExceptionSNPChromosomeAlternativeAlleleNotSupplied e) {
        	
        	LOGGER.debug("ERROR: Alternative Allele Not Supplied !!!");
        	addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOTCHOSEN_ALTERNATIVE_NOT_SELECTED);
        	model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
        	
            return SNPCHROMOSOME_SEARCH_VIEW;
        }
        catch (ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele e) {
        	
        	LOGGER.debug("ERROR: Reference Allele EQUALS Alternative Allele !!!");
        	addErrorMessage(model, ERROR_MESSAGE_SEARCH_EQUALS_REFERENCE_EQUALS_ALTERNATIVE);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_VIEW;
        } 
    	catch (ExceptionSNPChromosomeHighCoordinateNotSupplied e) {
    		
        	LOGGER.debug("ERROR: Search High Co-ordinate is NOT Supplied !!!");
        	addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOT_SUPPLIED_HIGH_POSITION);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_VIEW;
		} 
    	catch (ExceptionSNPChromosomeLowCoordinateNotSupplied e) {
    		
        	LOGGER.debug("ERROR: Search Low Co-ordinate is NOT Supplied !!!");
        	addErrorMessage(model, ERROR_MESSAGE_SEARCH_NOT_SUPPLIED_LOW_POSITION);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);
            
            return SNPCHROMOSOME_SEARCH_VIEW;
    	}
    	catch (Exception e) {

    		e.printStackTrace();
    	}
    	
        pagesnpchromosome = servicesnpchromosome.search(dtoSearch, firstPage, dtoSearch.getSearchSortFieldAsString(), dtoSearch.getSearchSortDirectionAsString());

        if ( pagesnpchromosome.size() == 0 ) {
        	
            LOGGER.debug("EMPTY SNPChromosomes !!! ");
        	addFeedbackMessage(model, FEEDBACK_MESSAGE_KEY_SEARCH_RESULTS_MULTIPLE, 0, successMsg);
            model.addAttribute(MODEL_ATTRIBUTE_SEARCHCRITERIA, dtoSearch);

            return SNPCHROMOSOME_SEARCH_VIEW;
        }
        else {

            int current = pagesnpchromosome.getPageNumber();
            int begin = Math.max(1, current - 5);
            int end = Math.min(begin + 10, pagesnpchromosome.getTotalPages());
            int totalPages = pagesnpchromosome.getTotalPages();

            model.addAttribute("SNPChromosome", pagesnpchromosome);
            model.addAttribute("beginIndex", begin);
            model.addAttribute("endIndex", end);
            model.addAttribute("currentIndex", current);
            model.addAttribute("totalPages", totalPages);
            
        	DTODownloadSNPChromosome dtoDownload = new DTODownloadSNPChromosome( 
        			dtoSearch.getSearchDownStream(),
        	        dtoSearch.getSearchUpStream(),
        			dtoSearch.getSearchLowRange(), 
        			dtoSearch.getSearchHighRange(), 
        			dtoSearch.getSearchReference(), 
        			dtoSearch.getSearchAlternative(), 
        	        dtoSearch.getSearchChromosome(),
        			dtoSearch.getSearchFilterSiftScoreValue(), 
        			dtoSearch.getSearchFilterSiftConservationScoreValue(), 
        			dtoSearch.getSearchFilterProteinAlignNumberValue(), 
        			dtoSearch.getSearchFilterTotalNumberSeqAlignedValue(), 
        			dtoSearch.getSearchFilterProveanScoreValue(), 
        			dtoSearch.getSearchFilterSiftScore(), 
        			dtoSearch.getSearchFilterSiftConservationScore(), 
        			dtoSearch.getSearchFilterProteinAlignNumber(), 
        			dtoSearch.getSearchFilterTotalNumberSeqAligned(), 
        			dtoSearch.getSearchFilterProveanScore(), 
        			dtoSearch.getSearchSortField(), 
        			dtoSearch.getSearchSortDirection(), 
        	        dtoSearch.getSearchRegion(),
        	        dtoSearch.getSearchPredictionCategory(),
        	        dtoSearch.getSearchEnsemblTranscript(),
        	        dtoSearch.getSearchUploadFileName(),
        	        dtoSearch.getSearchUploadFile()
        	);

            model.addAttribute(MODEL_ATTRIBUTE_DOWNLOADCRITERIA, dtoDownload);

            if ( pagesnpchromosome.getTotalElements() == 1 ) {
            	
                model.addAttribute("feedbackMessage", addFeedbackMessageAsString(FEEDBACK_MESSAGE_KEY_SEARCH_RESULTS_SINGLE, pagesnpchromosome.getTotalElements(), successMsg));
            }
            else {
            	
                model.addAttribute("feedbackMessage", addFeedbackMessageAsString(FEEDBACK_MESSAGE_KEY_SEARCH_RESULTS_MULTIPLE, pagesnpchromosome.getTotalElements(), successMsg));
            }

            return SNPCHROMOSOME_SEARCH_RESULT_VIEW;
        }

    }


    /**
     * Processes requests to home page which lists all available SNPChromosome.
     * @param model
     * @return The requested Download File.
     * @method POST
     */
	@RequestMapping(value = REQUEST_DOWNLOAD_MAPPING, method = RequestMethod.POST)
    public @ResponseBody CSVResponseSNPChromosome download( DTODownloadSNPChromosome dtoDownload ) {
	
		LOGGER.debug("Downloading SNPChromosomes with search criteria: " + dtoDownload);
        
        CSVResponseSNPChromosome csvresponse = new CSVResponseSNPChromosome();
        
        csvresponse.setDTODownloadSNPChromosome(dtoDownload);
        
        try {

            if ( dtoDownload.getSearchUploadFileName().equals("") ) {
            	
                List<SNPChromosome> snpchromosomes = servicesnpchromosome.download(dtoDownload);
                
                if ( snpchromosomes == null ) {
                	
                    LOGGER.debug("EMPTY SNPChromosomes !!! ");
                }
                else {

                	csvresponse.addAll( snpchromosomes );
                }
            }
            else {
            	
                File tmpFile = new File( dtoDownload.getSearchUploadFileName() );
                InputStream csvInput = FileUtil.readStream(tmpFile);

        		int totalRequestCount = 0;
        		
                List<DTOSearchSNPChromosome> dtosearchsnpchromosomeList = ConvertFiletoDTOSearchSNPChromosomeList.run( csvInput, totalRequestCount, MSGLEVEL, MSGLEVEL );

                Iterator<DTOSearchSNPChromosome> iteratorDTOSearchSNPChromosome = dtosearchsnpchromosomeList.iterator();

                PageSNPChromosome pagesnpchromosomeTotal = new PageSNPChromosome();
                
                pagesnpchromosomeTotal.setPageNumber(1);
                pagesnpchromosomeTotal.setTotalElements(0);
                pagesnpchromosomeTotal.setTotalPages(1);
                
    	    	String successMsg = "";
    	    	
    	     	while ( iteratorDTOSearchSNPChromosome.hasNext() ) {
    	    		
    	    		DTOSearchSNPChromosome dtosearchsnpchromosome = iteratorDTOSearchSNPChromosome.next();
    	    		
    	            try {
    	            	
    	    			successMsg = dtosearchsnpchromosome.isDTOSearchSNPChromosomeValid( serviceensemblgene );

    	            }
    	            catch (ExceptionSNPChromosomeSelectedWithGeneName e) {
    	            	
    	            	LOGGER.debug("ERROR: Search Chromosome Supplied AND Ensembl Gene Name Supplied !!!");
    	        		e.printStackTrace();
    	            }
    	            catch (ExceptionSNPChromosomeNotSelected e) {
    	            	
    	            	LOGGER.debug("ERROR: The Search Chromosome has NOT been chosen !!!");
    	        		e.printStackTrace();
    	            }
    	            catch (ExceptionSNPChromosomeSearchFilterProteinAlignNumberValueNotNumeric e) {
    	            	
    	            	LOGGER.debug("ERROR: The Search Filter Protein Alignment Number is NOT Numeric !!!");
    	        		e.printStackTrace();
    	            }
    	            catch (ExceptionSNPChromosomeSearchFilterProveanScoreValueNotNumeric e) {
    	            	
    	            	LOGGER.debug("ERROR: The Search Filter PROVEAN Score is NOT Numeric !!!");
    	        		e.printStackTrace();
    	            }
    	            catch (ExceptionSNPChromosomeSearchFilterSiftConservationScoreValueNotNumeric e) {
    	            	
    	            	LOGGER.debug("ERROR: The Search Filter SIFT Conservation Score is NOT Numeric !!!");
    	        		e.printStackTrace();
    	            }
    	            catch (ExceptionSNPChromosomeSearchFilterSiftScoreValueNotNumeric e) {
    	            	
    	            	LOGGER.debug("ERROR: The Search Filter SIFT Score is NOT Numeric !!!");
    	        		e.printStackTrace();
    	            }
    	            catch (ExceptionSNPChromosomeSearchFilterTotalNumberSeqAlignedValueNotNumeric e) {
    	            	
    	            	LOGGER.debug("ERROR: The Search Filter Total Number of Sequence Aligned is NOT Numeric !!!");
    	        		e.printStackTrace();
    	            }
    	            catch (ExceptionEnsemblGeneSearchRangeLessThanZero e) {
    	            	
    	            	LOGGER.debug("ERROR: Search Range is LESS THAN Zero !!!");
    	        		e.printStackTrace();
    	            }
    	            catch (ExceptionEnsemblGeneUpStreamSearchRangeGreaterThanTenThousand e) {
    	            	
    	            	LOGGER.debug("ERROR: Up Stream Search Range is GREATER THAN Ten Thousand Base Pairs !!!");
    	        		e.printStackTrace();
    	            }
    	            catch (ExceptionEnsemblGeneDownStreamSearchRangeGreaterThanTenThousand e) {
    	            	
    	            	LOGGER.debug("ERROR: Down Stream Search Range is GREATER THAN Ten Thousand Base Pairs !!!");
    	        		e.printStackTrace();
    	            }
    	            catch (ExceptionEnsemblGeneUpStreamNotNumeric e) {
    	            	
    	            	LOGGER.debug("ERROR: Search Upstream Range is NOT Numeric !!!");
    	        		e.printStackTrace();
    	            }
    	            catch (ExceptionEnsemblGeneDownStreamNotNumeric e) {
    	            	
    	            	LOGGER.debug("ERROR: Search Downstream Range is NOT Numeric !!!");
    	        		e.printStackTrace();
    	            }
    	            catch (ExceptionEnsemblGeneMultiplesFound e) {
    	            	
    	            	LOGGER.debug("ERROR: Multiple Genes Found !!!");
    	        		e.printStackTrace();
    	            }
    	            catch (ExceptionEnsemblGeneNotFound e) {
    	            	
    	            	LOGGER.debug("ERROR: Requested Gene does NOT Exist !!!");
    	        		e.printStackTrace();
    	            }
    	            catch (ExceptionSNPChromosomeSearchRangeGreaterThanOneMillion e) {
    	            	
    	            	LOGGER.debug("ERROR: Search Range is GREATER THAN One Million Base Pairs !!!");
    	        		e.printStackTrace();
    	            }
    	            catch (ExceptionSNPChromosomeLowCoordinateNotNumeric e) {
    	            	
    	            	LOGGER.debug("ERROR: Search Low Co-ordinate is NOT Numeric !!!");
    	        		e.printStackTrace();
    	            }
    	            catch (ExceptionSNPChromosomeHighCoordinateNotNumeric e) {
    	            	
    	            	LOGGER.debug("ERROR: Search High Co-ordinate is NOT Numeric !!!");
    	        		e.printStackTrace();
    	            }
    	            catch (ExceptionSNPChromosomeLowCoordinateGreaterThanHighCoordinate e) {
    	            	
    	            	LOGGER.debug("ERROR: Search Low Co-ordinate is GREATER THAN Search High Co-ordinate !!!");
    	        		e.printStackTrace();
    	            }
    	            catch (ExceptionSNPChromosomeReferenceAlleleNotSupplied e) {
    	            	
    	            	LOGGER.debug("ERROR: Reference Allele Not Supplied !!!");
    	        		e.printStackTrace();
    	            }
    	            catch (ExceptionSNPChromosomeAlternativeAlleleNotSupplied e) {
    	            	
    	            	LOGGER.debug("ERROR: Alternative Allele Not Supplied !!!");
    	        		e.printStackTrace();
    	            }
    	            catch (ExceptionSNPChromosomeReferenceAlleleEqualsAlternativeAllele e) {
    	            	
    	            	LOGGER.debug("ERROR: Reference Allele EQUALS Alternative Allele !!!");
    	        		e.printStackTrace();
    	            } 
    	        	catch (ExceptionSNPChromosomeHighCoordinateNotSupplied e) {
    	        		
    	            	LOGGER.debug("ERROR: Search High Co-ordinate is NOT Supplied !!!");
    	        		e.printStackTrace();
    	        	} 
    	        	catch (ExceptionSNPChromosomeLowCoordinateNotSupplied e) {
    	        		
    	            	LOGGER.debug("ERROR: Search Low Co-ordinate is NOT Supplied !!!");
    	        		e.printStackTrace();
    	        	}

            		PageSNPChromosome pagesnpchromosomeRequest = servicesnpchromosome.search(dtosearchsnpchromosome, 1, dtosearchsnpchromosome.getSearchSortFieldAsString(), dtosearchsnpchromosome.getSearchSortDirectionAsString());

    	            if ( pagesnpchromosomeRequest.size() != 0 ) {
    	            	
                		Iterator<SNPChromosome> iteratorSNPChromosome = pagesnpchromosomeRequest.iterator();

            	     	while ( iteratorSNPChromosome.hasNext() ) {
            	    		
            	     		SNPChromosome snpchromosome = iteratorSNPChromosome.next();

            	    		if ( !pagesnpchromosomeTotal.contains( snpchromosome )) {
            	    			
            	    			pagesnpchromosomeTotal.incrementTotalElements();
            	    			
            	    			pagesnpchromosomeTotal.add( snpchromosome );
            	    		}
            	     	}
    	            }
    	     	}

    	     	csvresponse.addAll( pagesnpchromosomeTotal );
            }
        }
    	catch (Exception e) {

    		e.printStackTrace();
    	}
        
        return csvresponse;
    }

	
    // --------------------------------------------------------------------------------------------
    // TESTING ------------------------------------------------------------------------------------
    // --------------------------------------------------------------------------------------------

	/**
     * This setter method should only be used by unit tests
     * @param serviceSNPChromosome
     */
    protected void setServiceSNPChromosome(ServiceSNPChromosome servicesnpchromosome) {
        this.servicesnpchromosome = servicesnpchromosome;
    }
}