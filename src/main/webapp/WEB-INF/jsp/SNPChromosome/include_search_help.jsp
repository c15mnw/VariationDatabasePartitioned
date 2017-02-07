<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <h2><spring:message code="spring.data.jpa.variation.search.about"/></h2>
    <br />
    <br />
    <p>The NARF variation database contains single nucleotide polymorphism (SNP) information from the 8 inbred lines.<p>
    <p>This information was attained from a large resequencing project described in <strong><a href="http://dnaresearch.oxfordjournals.org/content/early/2015/04/28/dnares.dsv005.full" style="color:#000000;" target="_blank">&quot;Functional classification of 15 million SNPs detected from diverse chicken populations&quot;</a></strong>.</p> 
    <p>This database was designed to make this data easily accessible for researchers and to help with experimental designs pertaining to the NARF bred chicken lines.</p>      
    <br />
    <p><strong><a href="http://dnaresearch.oxfordjournals.org/content/early/2015/04/28/dnares.dsv005.full" style="color:#000000;" target="_blank">&quot;Functional classification of 15 million SNPs detected from diverse chicken populations&quot;</a></strong>,<br/>
      AA Gheyas, C Boschiero, L Eory, H Ralph, R Kuo, JA Woolliams and DW Burt, <br />
    <strong>DNA Research</strong> <em>Vol.22</em>, <em>No.3</em>, <em>pp.205--217</em>, 2015.</p>
    <br />
    <p><strong><a href="http://bmcgenomics.biomedcentral.com/articles/10.1186/s12864-015-1711-1" style="color:#000000;" target="_blank">&quot;Detection and characterization of novel short insertion and deletion polymorphisms from chicken genome&quot;</a></strong>,<br/>
      C Boschiero, AAGheyas, HK Ralph, L Eory, B Paton, R Kuo, J Fulton, R Preisinger, P Kaiser and DW Burt,<br />
    <strong>BMC Genomics</strong> <em>Vol.16</em>, <em>No.1</em>, <em>pp.1--17</em>, 2015.</p>
    <br />

    <hr>

    <h2>The Search Page</h2>
    <br />
    <p>The search page allows researchers to find SNP’s between two lines within specific genomic locations.</p> 
    <p>You can define the genomic region by entering coordinates or entering gene names.</p>
    <p>All searches are based on comparing two lines so you must choose a reference line and a comparison line. Results will be given for genomic loci where the two lines have differing alleles.</p>
    <br />
      
    <hr>

    <a id="searchEnsemblGeneName"></a>
    <h4>SEARCH By Gene Name WITH Upstream AND Downstream Ranges</h4>
    <br />
    <p>To search for SNP’s within an Ensembl predicted gene use the “A Gene Name” search on the left side.</p>
    <p>Enter the Ensembl ID for your gene of interest. You can also choose to extend the region to include upstream and/or downstream regions of the gene.</p>  
    <p>If no upstream or downstream region is selected then the default is 0 for both.</p>
    <br />
    <p>The <em>Additional Upstream Range</em> must be a <strong>NUMBER</strong>; and is <strong>OPTIONAL</strong>.</p>
    <p>The <em>Additional Downstream Range</em> must be a <strong>NUMBER</strong>; and is <strong>OPTIONAL</strong>.</p>
    <p>The <em>Additional Upstream Range</em> <strong>AND</strong> <em>Additional Downstream Range</em> must <strong>NOT BE GREATER THAN</strong> <strong>10,000 Base Pairs each</strong>.</p>
    <p>If a <em>Chromosome</em> with <em>Start (LOW) Co-ordinate</em> and <em>End (HIGH) Co-ordinate</em> is not supplied, then an <em>Ensembl Gene Name</em> <strong>MUST BE SUPPLIED</strong>.</p>
    <br />

    <hr>

    <a id="searchCoordindates"></a>
    <h4>SEARCH By Chromosome Id WITH Genomic Location</h4>
    <br />
    <p>To search for SNP’s with a specified genomic coordinates use the &quot;A Chromosome Id WITH Genomic Location&quot; fields in the middle.</p> 
    <p>Select a chromosome from the drop down list and enter a start and end coordinate. The start coordinate must be a lower number than the end coordinate.</p>
    <p>If an <em>Ensembl Gene Name</em> is not supplied, then a <em>Chromosome</em> with <em>Start (LOW) Co-ordinate</em> and <em>End (HIGH) Co-ordinate</em> <strong>MUST BE SUPPLIED</strong>.</p>
    <br />
    <p>There are <strong>32</strong> Chromosomes to choose from:<br /><strong>1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 32, LGE22C19W28_E50C23, LGE64, W</strong> and <strong>Z</strong>.</p>
    <p>The <em>Start (LOW) Co-ordinate</em> must be a <strong>NUMBER</strong>, and <strong>MUST BE LOWER</strong> than the <em>End Co-ordinate</em>.</p>
    <p>The <em>End (HIGH) Co-ordinate</em> must be a <strong>NUMBER</strong>, and <strong>MUST BE HIGHER</strong> than the <em>Start Co-ordinate</em>.</p>
    <p>The Co-ordinate Range, between the supplied Start and End Co-ordinates, <strong>MUST NOT BE GREATER THAN 1,000,000 Base Pairs</strong>.</p>
    <br />

    <hr>

    <h4>Mandatory Search Fields</h4>
    <br />

    <a id="referenceAllele"></a>
    <h5>Reference Allele</h5>
    <br />
    <p>The reference strain is the first Chicken strain that you want to include in your SNP comparison search.</p> 
    <p>The allele from this strain will be labelled as the reference allele in the output.</p>
    <br />
    <p>There are <strong>7</strong> Strains to choose from as a <em>Reference Allele</em>:<br /> <strong>Inbred Line 7, Partial Inbred Line P, Inbred Line W, Partial Inbred Line N, Inbred Line 15I, Partial Inbred Line 0, Inbred Line 6</strong> and <strong>Inbred Line C</strong>.</p>
    <p>The Strain selected for the <em>Reference Allele</em> <strong>MUST NOT BE EQUAL TO</strong> the Strain selected for the <em>Alternative Allele</em>; and is <strong>MANDATORY</strong>.</p>
    <br />
    <p><strong>NOTA BENE:</strong> The <em>Reference Allele</em> <strong>MAY</strong> also be the <em>Reference Genome</em> itself.</p>
    <br />

    <a id="alternativeAllele"></a>
    <h5>Alternative Allele</h5>
    <br />
    <p>The alternative strain is the second Chicken strain that you want to include in your SNP comparison search.</p> 
    <p>The allele from this strain will be labelled as the alternative allele in the output.</p>      
    <br />
    <p>There are <strong>7</strong> Strains to choose from as an <em>Alternative Allele</em>:<br /> <strong>Inbred Line 7, Partial Inbred Line P, Inbred Line W, Partial Inbred Line N, Inbred Line 15I, Partial Inbred Line 0, Inbred Line 6</strong> and <strong>Inbred Line C</strong>.</p>
    <p>The Strain selected for the <em>Alternative Allele</em> <strong>MUST NOT BE EQUAL TO</strong> the Strain selected for the <em>Reference Allele</em>; and is <strong>MANDATORY</strong>.</p>
    <br />

    <hr>

    <h4>5 Optional Search Filters</h4>
    <br />

    <a id="siftScore"></a>
    <h5>1. SIFT Score</h5>
    <br />
    <br />
    <p>The <em>SIFT Score</em> must be a <strong>NUMBER</strong>; and is <strong>OPTIONAL</strong>.</p>
    <br />

    <a id="proveanScore"></a>
    <h5>2. PROVEAN Score</h5>
    <br />
    <p><strong>PROVEAN</strong> (Protein Variation Effect Analyzer) score is a metric that predicts the damaging effects of variants such as SNPs, in-frame InDels, and block substitutions on protein functions.</p>
    <p>It is an alignment-based score (also called Delta alignment score) that measures the change in sequence similarity of a query sequence to a protein sequence homolog before and after the introduction of an amino acid variation to the query sequence.</p> 
    <p>Although estimated scores are considered to be correlated with the deleteriousness of the variants, a cut-off point is used for declaring variants as “Intolerant” in evolutionary terms.</p> 
    <p>For predicting the effects of the variants in this database, PROVEAN was run with the default parameters on the NCBI non-redundant protein database.</p> 
    <p>Delta score of -2.5 was used as the threshold below which any variant was considered “Intolerant” or “Deleterious”.</p>
    <br />
    <p>Further information on <strong>PROVEAN</strong> can be found in the paper referenced below:</p>
    <br />
    <p><strong><a href="http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0046688" style="color:#000000;" target="_blank">&quot;Predicting the functional effect of amino acid substitutions and indels&quot;</a></strong>,<br/>
      Choi Y, Sims GE, Murphy S, Miller JR. and Chan AP, <br />
    <strong>Plos ONE</strong> <em>Vol.7</em>, <em>No.10</em>, <em>pp.1--13</em>, 2012.</p>
    <br />
    <p>The <em>PROVEAN Score</em> must be a <strong>NUMBER</strong>; and is <strong>OPTIONAL</strong>.</p>
    <br />

    <a id="siftConsScore"></a>
    <h5>3. SIFT Conservation Score</h5>
    <br />
    <br />
    <p>The <em>SIFT Conservation Score</em> must be a <strong>NUMBER</strong>; and is <strong>OPTIONAL</strong>.</p>
    <br />

    <a id="proteinAlignNum"></a>
    <h5>4. Protein Alignment Number</h5>
    <br />
    <br />
    <p>The <em>Protein Alignment Number</em> must be a <strong>NUMBER</strong>; and is <strong>OPTIONAL</strong>.</p>
    <br />
      
    <a id="totNumSeqAligned"></a>
    <h5>5. Total Number of Sequence Aligned</h5>
    <br />
    <br />
    <p>The <em>Total Number of Sequence Aligned</em> must be a <strong>NUMBER</strong>; and is <strong>OPTIONAL</strong>.</p>
    <br />

    <hr>

    <a id="searchUploadFile"></a>
    <h4>SEARCH By Uploading a File of multiple Search Requests</h4>
    <br />
    <p>It is possible to submit a text file of multiple Search requests.</p>
    <p>Each Search request <strong>MUST</strong> consist of <strong>5 TAB Separated</strong> text Strings, in the following order.</p>  
    <br />
    <p><strong>1</strong>. <em>Chromosome</em><br />[ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 32, LGE22C19W28_E50C23, LGE64, W or Z ]</p>
    <p><strong>2</strong>. <em>Start (LOW) Co-ordinate</em><br />[ A Number ]</p>
    <p><strong>3</strong>. <em>End (HIGH) Co-ordinate</em><br />[ A Number ].</p>
    <p><strong>4</strong>. <em>Reference Allele</em><br />[ REFERENCE, 7, P, W, N, 15I, ZERO, 6 or C ]</p>
    <p><strong>5</strong>. <em>Alternative Allele</em><br />[ REFERENCE, 7, P, W, N, 15I, ZERO, 6 or C ]</p>
  
    <br />
    <p><em>NOTA BENE:</em> <strong>ANY</strong> invalid Search request will invalidate <strong>ALL</strong> requests in the uploaded file, and <strong>NO</strong> search will be performed.</p>

    <hr>
        
    <h5>Contact Us</h5>
    <a href="mailto:narf@roslin.ed.ac.uk" class="red">narf@roslin.ed.ac.uk</a>
    