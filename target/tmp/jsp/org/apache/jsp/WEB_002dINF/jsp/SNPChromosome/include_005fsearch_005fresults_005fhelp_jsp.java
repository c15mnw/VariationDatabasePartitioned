package org.apache.jsp.WEB_002dINF.jsp.SNPChromosome;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class include_005fsearch_005fresults_005fhelp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_message_code_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_spring_message_code_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_spring_message_code_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <h2>");
      if (_jspx_meth_spring_message_0(_jspx_page_context))
        return;
      out.write("</h2>\n");
      out.write("    <br />\n");
      out.write("    <br />\n");
      out.write("    <p>The NARF variation database contains Insertion Deletion (InDel) information from 8 lines.<p>\n");
      out.write("    <p>This information was attained from a large resequencing project described in <strong><a href=\"http://dnaresearch.oxfordjournals.org/content/early/2015/04/28/dnares.dsv005.full\" style=\"color:#000000;\" target=\"_blank\">&quot;Functional classification of 15 million SNPs detected from diverse chicken populations&quot;</a></strong>.</p> \n");
      out.write("    <p>This database was designed to make this data easily accessible for researchers and to help with experimental designs pertaining to the NARF bred chicken lines.</p>      \n");
      out.write("    <ul>\n");
      out.write("    <li><strong><a href=\"http://dnaresearch.oxfordjournals.org/content/early/2015/04/28/dnares.dsv005.full\" style=\"color:#000000;\" target=\"_blank\">&quot;Functional classification of 15 million SNPs detected from diverse chicken populations&quot;</a></strong>,<br/>\n");
      out.write("      AA Gheyas, C Boschiero, L Eory, H Ralph, R Kuo, JA Woolliams and DW Burt, <br />\n");
      out.write("    <strong>DNA Research</strong> <em>Vol.22</em>, <em>No.3</em>, <em>pp.205--217</em>, 2015.</li>\n");
      out.write("    <li><strong><a href=\"http://bmcgenomics.biomedcentral.com/articles/10.1186/s12864-015-1711-1\" style=\"color:#000000;\" target=\"_blank\">&quot;Detection and characterization of novel short insertion and deletion polymorphisms from chicken genome&quot;</a></strong>,<br/>\n");
      out.write("      C Boschiero, AA Gheyas, HK Ralph, L Eory, B Paton, R Kuo, J Fulton, R Preisinger, P Kaiser and DW Burt,<br />\n");
      out.write("    <strong>BMC Genomics</strong> <em>Vol.16</em>, <em>No.1</em>, <em>pp.1--17</em>, 2015.</li>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("    <hr>\n");
      out.write("\n");
      out.write("    <h4>The Results Columns</h4>\n");
      out.write("    <br />\n");
      out.write("    <a id=\"chromosomeIdentifier\"></a>\n");
      out.write("    <h5>1. \"ChrId.\"</h5>\n");
      out.write("    <p>Chromosome Identifier</p>\n");
      out.write("    <p>There are <strong>33</strong> Chromosomes: <strong>1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 32, LGE22C19W28_E50C23, LGE64, W</strong> and <strong>Z</strong>.</p>\n");
      out.write("    <br />\n");
      out.write("    <a id=\"position\"></a>\n");
      out.write("    <h5>2. \"Pos.\"</h5>\n");
      out.write("    <p>Position</p>\n");
      out.write("    <p>The <em>Co-ordinate</em> of the SNP.</p>\n");
      out.write("    <br />\n");
      out.write("    <a id=\"referenceAllele\"></a>\n");
      out.write("    <h5>3. \"Ref.\"</h5>\n");
      out.write("    <p>The Reference SNP Allele.</p>\n");
      out.write("    <br />\n");
      out.write("    <a id=\"alternativeAllele\"></a>\n");
      out.write("    <h5>4. \"Alt.\"</h5>\n");
      out.write("    <p>The Alternative SNP Allele.</p>\n");
      out.write("    <br />\n");
      out.write("    <a id=\"region\"></a>\n");
      out.write("    <h5>5. \"Region.\"</h5>\n");
      out.write("    <p>Region.</p>\n");
      out.write("    <br />\n");
      out.write("    <a id=\"ensemblGeneName\"></a>\n");
      out.write("    <h5>6. \"Ensembl Gene\"</h5>\n");
      out.write("    <p>Ensembl Gene Name.</p>\n");
      out.write("    <br />\n");
      out.write("    <a id=\"ensemblTranscript\"></a>\n");
      out.write("    <h5>7. \"Ensembl Transcript\"</h5>\n");
      out.write("    <p>Ensembl Transcript.</p>\n");
      out.write("    <dl>\n");
      out.write("    <dt>NA</dt><dd><!-- ? --></dd>\n");
      out.write("    <dt>nonsynonymous SNV</dt><dd><!-- ? --></dd>\n");
      out.write("    <dt>synonymous SNV</dt><dd><!-- ? --></dd>\n");
      out.write("    <dt>stopgain SNV</dt><dd><!-- ? --></dd>\n");
      out.write("    <dt>stoploss SNV</dt><dd><!-- ? --></dd>\n");
      out.write("    </dl>\n");
      out.write("    <br />\n");
      out.write("    <a id=\"ensemblCodingPredictions\"></a>\n");
      out.write("    <h5>8. \"Ensembl Coding Predictions\"</h5>\n");
      out.write("    <p>Ensembl Coding Predictions.</p>\n");
      out.write("    <br />\n");
      out.write("    <a id=\"strainX\"></a>\n");
      out.write("    <h5>9. \"Strain X\"</h5>\n");
      out.write("    <p>For Strain X, this is the Allele.</p>\n");
      out.write("    <br />\n");
      out.write("    <a id=\"strainXFixed\"></a>\n");
      out.write("    <h5>10. \"Fixed?\" - </h5>\n");
      out.write("    <p>For Strain X, this takes one of the following 4 values:</p>\n");
      out.write("    <dl>\n");
      out.write("    <dt>Ref.</dt><dd>The Allele for this SNP is <strong>ALWAYS</strong> the Reference Allele</dd>\n");
      out.write("    <dt>Not Fixed</dt><dd>The Allele for this SNP is <strong>SOMETIMES</strong> the Reference Allele, and <strong>SOMETIMES</strong> it is the Reference Allele</dd>\n");
      out.write("    <dt>Fixed</dt><dd>The Allele for this SNP is <strong>ALWAYS</strong> the Alternative Allele</dd>\n");
      out.write("    <dt>N/A</dt><dd>Not Available</dd>\n");
      out.write("    </dl>\n");
      out.write("    <br />\n");
      out.write("    <a id=\"strainXRatio\"></a>\n");
      out.write("    <h5>11. \"Ratio\"</h5>\n");
      out.write("    <p>For Strain X, this the Allele.</p>\n");
      out.write("    <br />\n");
      out.write("    <a id=\"strainXRatio\"></a>\n");
      out.write("    <h5>12. \"Alternative Count\"</h5>\n");
      out.write("    <p>For Strain X, this is the count of the number of occurences of the Alternative Allele.</p>\n");
      out.write("    <br />\n");
      out.write("    <a id=\"strainXRatio\"></a>\n");
      out.write("    <h5>13. \"Reference Count\"</h5>\n");
      out.write("    <p>For Strain X, this is the count of the number of occurences of the Reference Allele.</p>\n");
      out.write("    <br />\n");
      out.write("    <a id=\"aminoAcidSubsInfo\"></a>\n");
      out.write("    <h5>14. \"Amino Acid Subs. Info.\"</h5>\n");
      out.write("    <p>Amino Acid Substitution Information.</p>\n");
      out.write("    <br />\n");
      out.write("    <a id=\"predictionCategory\"></a>\n");
      out.write("    <h5>15. \"Prediction Cat.\"</h5>\n");
      out.write("    <p>Prediction Category.</p>\n");
      out.write("    <dl>\n");
      out.write("    <dt>blank</dt><dd>No SIFT Score recorded for this SNP.</dd>\n");
      out.write("    <dt>TOLERATED</dt><dd>When SIFT score is greater than or equal to 0.05, the SNP is classified as \"Tolerated\"</dd>\n");
      out.write("    <dt>DELETERIOUS</dt><dd>When the SIFT score is less than 0.05, the SNP is marked \"Deleterious\"</dd>\n");
      out.write("    </dl>\n");
      out.write("    <br />\n");
      out.write("    <a id=\"proveanScore\"></a>\n");
      out.write("    <h5>16. \"PROVEAN Score\"</h5>\n");
      out.write("    <br />\n");
      out.write("    <p>PROVEAN Score.</p>\n");
      out.write("    <br />\n");
      out.write("    <p><strong>PROVEAN</strong> (Protein Variation Effect Analyzer) score is a metric that predicts the damaging effects of variants such as SNPs, in-frame InDels, and block substitutions on protein functions.\n");
      out.write("      It is an alignment-based score (also called Delta alignment score) that measures the change in sequence similarity of a query sequence to a protein sequence homolog before and after the introduction of an amino acid variation to the query sequence. \n");
      out.write("      Although estimated scores are considered to be correlated with the deleteriousness of the variants, a cut-off point is used for declaring variants as “Intolerant” in evolutionary terms. \n");
      out.write("      For predicting the effects of the variants in this database, PROVEAN was run with the default parameters on the NCBI non-redundant protein database. \n");
      out.write("      Delta score of -2.5 was used as the threshold below which any variant was considered “Intolerant” or “Deleterious”. </p>\n");
      out.write("    <br />\n");
      out.write("    <p>Further information on <strong>PROVEAN</strong> can be found in the paper referenced below:</p>\n");
      out.write("    <p><strong><a href=\"http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0046688\" style=\"color:#000000;\" target=\"_blank\">&quot;Predicting the functional effect of amino acid substitutions and indels&quot;</a></strong>,<br/>\n");
      out.write("      Y Choi, GE Sims, S Murphy, JR Miller and AP Chan, <br />\n");
      out.write("    <strong>Plos ONE</strong> <em>Vol.7</em>, <em>No.10</em>, <em>pp.1--13</em>, 2012.</p>\n");
      out.write("    <br />\n");
      out.write("    <a id=\"siftScore\"></a>\n");
      out.write("    <h5>17. \"SIFT Score\"</h5>\n");
      out.write("    <br />\n");
      out.write("    <p>SIFT Score.</p>\n");
      out.write("    <br />\n");
      out.write("    <a id=\"siftConsScore\"></a>\n");
      out.write("    <h5>18. \"SIFT Conservation Score\"</h5>\n");
      out.write("    <br />\n");
      out.write("    <p>SIFT Conservation Score.</p>\n");
      out.write("    <br />\n");
      out.write("    <a id=\"proteinAlignNum\"></a>\n");
      out.write("    <h5>19. \"Protein Alignment Num.\"</h5>\n");
      out.write("    <br />\n");
      out.write("    <p>Protein Alignment Number.</p>\n");
      out.write("    <br />\n");
      out.write("    <a id=\"totNumSeqAligned\"></a>\n");
      out.write("    <h5>20. \"Total Num. of Sequence Aligned\"</h5>\n");
      out.write("    <br />\n");
      out.write("    <p>Total Number of Sequence Aligned.</p>\n");
      out.write("    <br />\n");
      out.write("\n");
      out.write("    <hr>\n");
      out.write("        \n");
      out.write("    <h5>Contact Us</h5>\n");
      out.write("    <a href=\"mailto:narf@roslin.ed.ac.uk\" class=\"red\">narf@roslin.ed.ac.uk</a>\n");
      out.write("\n");
      out.write("        ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_spring_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_0 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_0.setParent(null);
    _jspx_th_spring_message_0.setCode("spring.data.jpa.variation.search_results.about");
    int[] _jspx_push_body_count_spring_message_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_0 = _jspx_th_spring_message_0.doStartTag();
      if (_jspx_th_spring_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_0.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_0);
    }
    return false;
  }
}
