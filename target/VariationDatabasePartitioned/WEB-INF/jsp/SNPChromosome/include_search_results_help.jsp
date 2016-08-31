<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

      <h2><spring:message code="spring.data.jpa.variation.search_results.about"/></h2>
      <br /><br />
      
      <p>The NARF variation database contains Insertion Deletion (InDel) information from 8 lines.<p>
      <p>This information was attained from a large resequencing project described in <strong><a href="http://dnaresearch.oxfordjournals.org/content/early/2015/04/28/dnares.dsv005.full" style="color:#000000;" target="_blank">&quot;Functional classification of 15 million SNPs detected from diverse chicken populations&quot;</a></strong>.</p> 
      <p>This database was designed to make this data easily accessible for researchers and to help with experimental designs pertaining to the NARF bred chicken lines.</p>      

      <ul>
        <li><strong><a href="http://dnaresearch.oxfordjournals.org/content/early/2015/04/28/dnares.dsv005.full" style="color:#000000;" target="_blank">&quot;Functional classification of 15 million SNPs detected from diverse chicken populations&quot;</a></strong>,<br/>
      AA Gheyas, C Boschiero, L Eory, H Ralph, R Kuo, JA Woolliams and DW Burt, <br />
      <strong>DNA Research</strong> <em>Vol.22</em>, <em>No.3</em>, <em>pp.205--217</em>, 2015.</li>
        <li><strong><a href="http://bmcgenomics.biomedcentral.com/articles/10.1186/s12864-015-1711-1" style="color:#000000;" target="_blank">&quot;Detection and characterization of novel short insertion and deletion polymorphisms from chicken genome&quot;</a></strong>,<br/>
      C Boschiero, AA Gheyas, HK Ralph, L Eory, B Paton, R Kuo, J Fulton, R Preisinger, P Kaiser and DW Burt,<br />
      <strong>BMC Genomics</strong> <em>Vol.16</em>, <em>No.1</em>, <em>pp.1--17</em>, 2015.</li>
      </ul>
      <hr>


<h4>The Results Columns</h4>
      <br />

<a id="chromosomeIdentifier"></a>
<h5>1. "ChrId."</h5>
      <p>Chromosome Identifier</p>
      <p>There are <strong>33</strong> Chromosomes: <strong>1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 32, LGE22C19W28_E50C23, LGE64, W</strong> and <strong>Z</strong>.</p>
      <br />

<a id="position"></a>
<h5>2. "Pos."</h5>
      <p>Position</p>
      <p>The <em>Co-ordinate</em> of the SNP.</p>
      <br />

<a id="referenceAllele"></a>
<h5>3. "Ref."</h5>
      <p>The Reference SNP Allele.</p>
      <br />

<a id="alternativeAllele"></a>
<h5>4. "Alt."</h5>
      <p>The Alternative SNP Allele.</p>
      <br />

<a id="region"></a>
<h5>5. "Region."</h5>
      <p>Region.</p>
      <br />

<a id="ensemblGeneName"></a>
<h5>6. "Ensembl Gene"</h5>
      <p>Ensembl Gene Name.</p>
      <br />

<a id="ensemblTranscript"></a>
<h5>7. "Ensembl Transcript"</h5>
      <p>Ensembl Transcript.</p>
      <dl>
        <dt>NA</dt><dd><!-- ? --></dd>
        <dt>nonsynonymous SNV</dt><dd><!-- ? --></dd>
        <dt>synonymous SNV</dt><dd><!-- ? --></dd>
        <dt>stopgain SNV</dt><dd><!-- ? --></dd>
        <dt>stoploss SNV</dt><dd><!-- ? --></dd>
      </dl>
      <br />

<a id="ensemblCodingPredictions"></a>
<h5>8. "Ensembl Coding Predictions"</h5>
      <p>Ensembl Coding Predictions.</p>
      <br />

<a id="strainX"></a>
<h5>9. "Strain X"</h5>
      <p>For Strain X, this is the Allele.</p>
      <br />

<a id="strainXFixed"></a>
<h5>10. "Fixed?" - </h5>
      <p>For Strain X, this takes one of the following 4 values:</p>
      <dl>
        <dt>Ref.</dt><dd>The Allele for this SNP is <strong>ALWAYS</strong> the Reference Allele</dd>
        <dt>Not Fixed</dt><dd>The Allele for this SNP is <strong>SOMETIMES</strong> the Reference Allele, and <strong>SOMETIMES</strong> it is the Reference Allele</dd>
        <dt>Fixed</dt><dd>The Allele for this SNP is <strong>ALWAYS</strong> the Alternative Allele</dd>
        <dt>N/A</dt><dd>Not Available</dd>
      </dl>
      <br />

<a id="strainXRatio"></a>
<h5>11. "Ratio"</h5>
      <p>For Strain X, this the Allele.</p>
      <br />

<a id="strainXRatio"></a>
<h5>12. "Alternative Count"</h5>
      <p>For Strain X, this is the count of the number of occurences of the Alternative Allele.</p>
      <br />

<a id="strainXRatio"></a>
<h5>13. "Reference Count"</h5>
      <p>For Strain X, this is the count of the number of occurences of the Reference Allele.</p>
      <br />

<a id="aminoAcidSubsInfo"></a>
<h5>14. "Amino Acid Subs. Info."</h5>
      <p>Amino Acid Substitution Information.</p>
      <br />

<a id="predictionCategory"></a>
<h5>15. "Prediction Cat."</h5>
      <p>Prediction Category.</p>
      <dl>
        <dt>blank</dt><dd><!-- ? --></dd>
        <dt>TOLERATED</dt><dd><!-- ? --></dd>
        <dt>DELETERIOUS</dt><dd><!-- ? --></dd>
      </dl>
      <br />

<a id="proveanScore"></a>
<h5>16. "PROVEAN Score"</h5>

      <br />
      <p>PROVEAN Score.</p>
      <br />

      <p><strong>PROVEAN</strong> (Protein Variation Effect Analyzer) score is a metric that predicts the damaging effects of variants such as SNPs, in-frame InDels, and block substitutions on protein functions.
      It is an alignment-based score (also called Delta alignment score) that measures the change in sequence similarity of a query sequence to a protein sequence homolog before and after the introduction of an amino acid variation to the query sequence. 
      Although estimated scores are considered to be correlated with the deleteriousness of the variants, a cut-off point is used for declaring variants as “Intolerant” in evolutionary terms. 
      For predicting the effects of the variants in this database, PROVEAN was run with the default parameters on the NCBI non-redundant protein database. 
      Delta score of -2.5 was used as the threshold below which any variant was considered “Intolerant” or “Deleterious”. </p>

      <br />
      
      <p>Further information on <strong>PROVEAN</strong> can be found in the paper referenced below:</p>
      
      <p><strong><a href="http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0046688" style="color:#000000;" target="_blank">&quot;Predicting the functional effect of amino acid substitutions and indels&quot;</a></strong>,<br/>
      Y Choi, GE Sims, S Murphy, JR Miller and AP Chan, <br />
      <strong>Plos ONE</strong> <em>Vol.7</em>, <em>No.10</em>, <em>pp.1--13</em>, 2012.</p>

      <br />
      
      
<a id="siftScore"></a>
<h5>17. "SIFT Score"</h5>
      <br />
      <p>SIFT Score.</p>
      <br />

<a id="siftConsScore"></a>
<h5>18. "SIFT Conservation Score"</h5>
      <br />
      <p>SIFT Conservation Score.</p>
      <br />

<a id="proteinAlignNum"></a>
<h5>19. "Protein Alignment Num."</h5>
      <br />
      <p>Protein Alignment Number.</p>
      <br />

<a id="totNumSeqAligned"></a>
<h5>20. "Total Num. of Sequence Aligned"</h5>
      <br />
      <p>Total Number of Sequence Aligned.</p>
      <br />

      <hr>
        
      <h5>Contact Us</h5>
        <a href="../mailto:narf@roslin.ed.ac.uk" class="red">narf@roslin.ed.ac.uk</a>

        