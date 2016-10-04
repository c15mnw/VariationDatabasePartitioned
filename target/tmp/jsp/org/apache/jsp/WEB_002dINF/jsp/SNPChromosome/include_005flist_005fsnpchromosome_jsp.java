package org.apache.jsp.WEB_002dINF.jsp.SNPChromosome;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class include_005flist_005fsnpchromosome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_message_code_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_message_code_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_spring_message_code_nobody.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
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
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write('\n');
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${SNPChromosome != null && totalPages != 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("  <div class=\"row spacer\">\n");
        out.write("    <div class=\"span12\">\n");
        out.write(" \n");
        out.write("       <table id=\"snps\" class=\"display\" cellspacing=\"0\" width=\"100%\">\n");
        out.write("\n");
        out.write("        <thead>\n");
        out.write("\n");
        out.write("            <tr>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("              ");
        if (_jspx_meth_c_if_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_88((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_89((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_90((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_91((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_92((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_93((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_94((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("            </tr>\n");
        out.write("\n");
        out.write("        </thead>\n");
        out.write("\n");
        out.write("        <tfoot>\n");
        out.write("\n");
        out.write("            <tr>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_95((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_96((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_97((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_98((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_99((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_100((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_101((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_102((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("              ");
        if (_jspx_meth_c_if_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_26((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_27((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_28((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_29((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_30((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_31((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              \n");
        out.write("              ");
        if (_jspx_meth_c_if_32((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_183((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_184((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_185((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_186((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_187((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_188((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              <th>");
        if (_jspx_meth_spring_message_189((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("            </tr>\n");
        out.write("\n");
        out.write("        </tfoot>\n");
        out.write("\n");
        out.write("        <tbody>\n");
        out.write("        \n");
        out.write("          ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("          \n");
        out.write("        </tbody>\n");
        out.write("        \n");
        out.write("      </table>\n");
        out.write("    \n");
        out.write("       \n");
        out.write("    </div>\n");
        out.write("    <!-- close span12 -->\n");
        out.write("  </div>\n");
        out.write("  <!-- close row spacer -->\n");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_spring_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_0 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_0.setCode("snpchromosome.list.label.chromosomeId");
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

  private boolean _jspx_meth_spring_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_1 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_1.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_1.setCode("snpchromosome.list.label.position");
    int[] _jspx_push_body_count_spring_message_1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_1 = _jspx_th_spring_message_1.doStartTag();
      if (_jspx_th_spring_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_1.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_2 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_2.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_2.setCode("snpchromosome.list.label.reference");
    int[] _jspx_push_body_count_spring_message_2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_2 = _jspx_th_spring_message_2.doStartTag();
      if (_jspx_th_spring_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_2.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_2);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_3 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_3.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_3.setCode("snpchromosome.list.label.alternative");
    int[] _jspx_push_body_count_spring_message_3 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_3 = _jspx_th_spring_message_3.doStartTag();
      if (_jspx_th_spring_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_3.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_3);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_4 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_4.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_4.setCode("snpchromosome.list.label.region");
    int[] _jspx_push_body_count_spring_message_4 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_4 = _jspx_th_spring_message_4.doStartTag();
      if (_jspx_th_spring_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_4.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_4);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_5 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_5.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_5.setCode("snpchromosome.list.label.ensemblGene");
    int[] _jspx_push_body_count_spring_message_5 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_5 = _jspx_th_spring_message_5.doStartTag();
      if (_jspx_th_spring_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_5.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_5);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_6 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_6.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_6.setCode("snpchromosome.list.label.ensemblTranscript");
    int[] _jspx_push_body_count_spring_message_6 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_6 = _jspx_th_spring_message_6.doStartTag();
      if (_jspx_th_spring_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_6.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_6);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_7 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_7.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_7.setCode("snpchromosome.list.label.ensemblAnnotation");
    int[] _jspx_push_body_count_spring_message_7 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_7 = _jspx_th_spring_message_7.doStartTag();
      if (_jspx_th_spring_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_7.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_7);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadReference7()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_spring_message_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_8 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_8.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_spring_message_8.setCode("snpchromosome.list.label.strain7Allele");
    int[] _jspx_push_body_count_spring_message_8 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_8 = _jspx_th_spring_message_8.doStartTag();
      if (_jspx_th_spring_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_8.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_8);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_9 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_9.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_spring_message_9.setCode("snpchromosome.list.label.strain7AlleleFixed");
    int[] _jspx_push_body_count_spring_message_9 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_9 = _jspx_th_spring_message_9.doStartTag();
      if (_jspx_th_spring_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_9.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_9);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_10 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_10.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_spring_message_10.setCode("snpchromosome.list.label.strain7AlleleRatio");
    int[] _jspx_push_body_count_spring_message_10 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_10 = _jspx_th_spring_message_10.doStartTag();
      if (_jspx_th_spring_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_10[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_10.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_10.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_10);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_11 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_11.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_spring_message_11.setCode("snpchromosome.list.label.strain7AlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_11 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_11 = _jspx_th_spring_message_11.doStartTag();
      if (_jspx_th_spring_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_11[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_11.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_11.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_11);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_12 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_12.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_spring_message_12.setCode("snpchromosome.list.label.strain7AlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_12 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_12 = _jspx_th_spring_message_12.doStartTag();
      if (_jspx_th_spring_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_12[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_12.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_12.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_12);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadReferenceP()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_spring_message_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_13 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_13.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_spring_message_13.setCode("snpchromosome.list.label.strainPAllele");
    int[] _jspx_push_body_count_spring_message_13 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_13 = _jspx_th_spring_message_13.doStartTag();
      if (_jspx_th_spring_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_13[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_13.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_13.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_13);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_14 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_14.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_spring_message_14.setCode("snpchromosome.list.label.strainPAlleleFixed");
    int[] _jspx_push_body_count_spring_message_14 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_14 = _jspx_th_spring_message_14.doStartTag();
      if (_jspx_th_spring_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_14[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_14.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_14.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_14);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_15 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_15.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_spring_message_15.setCode("snpchromosome.list.label.strainPAlleleRatio");
    int[] _jspx_push_body_count_spring_message_15 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_15 = _jspx_th_spring_message_15.doStartTag();
      if (_jspx_th_spring_message_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_15[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_15.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_15.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_15);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_16 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_16.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_spring_message_16.setCode("snpchromosome.list.label.strainPAlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_16 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_16 = _jspx_th_spring_message_16.doStartTag();
      if (_jspx_th_spring_message_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_16[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_16.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_16.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_16);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_17 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_17.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_spring_message_17.setCode("snpchromosome.list.label.strainPAlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_17 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_17 = _jspx_th_spring_message_17.doStartTag();
      if (_jspx_th_spring_message_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_17[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_17.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_17.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_17);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadReferenceW()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_spring_message_18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_18 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_18.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_spring_message_18.setCode("snpchromosome.list.label.strainWAllele");
    int[] _jspx_push_body_count_spring_message_18 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_18 = _jspx_th_spring_message_18.doStartTag();
      if (_jspx_th_spring_message_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_18[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_18.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_18.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_18);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_19 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_19.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_spring_message_19.setCode("snpchromosome.list.label.strainWAlleleFixed");
    int[] _jspx_push_body_count_spring_message_19 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_19 = _jspx_th_spring_message_19.doStartTag();
      if (_jspx_th_spring_message_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_19[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_19.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_19.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_19);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_20 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_20.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_spring_message_20.setCode("snpchromosome.list.label.strainWAlleleRatio");
    int[] _jspx_push_body_count_spring_message_20 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_20 = _jspx_th_spring_message_20.doStartTag();
      if (_jspx_th_spring_message_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_20[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_20.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_20.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_20);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_21 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_21.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_spring_message_21.setCode("snpchromosome.list.label.strainWAlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_21 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_21 = _jspx_th_spring_message_21.doStartTag();
      if (_jspx_th_spring_message_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_21[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_21.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_21.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_21);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_22 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_22.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_spring_message_22.setCode("snpchromosome.list.label.strainWAlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_22 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_22 = _jspx_th_spring_message_22.doStartTag();
      if (_jspx_th_spring_message_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_22[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_22.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_22.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_22);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadReferenceN()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_26((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_27((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_spring_message_23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_23 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_23.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_spring_message_23.setCode("snpchromosome.list.label.strainNAllele");
    int[] _jspx_push_body_count_spring_message_23 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_23 = _jspx_th_spring_message_23.doStartTag();
      if (_jspx_th_spring_message_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_23[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_23.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_23.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_23);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_24 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_24.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_spring_message_24.setCode("snpchromosome.list.label.strainNAlleleFixed");
    int[] _jspx_push_body_count_spring_message_24 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_24 = _jspx_th_spring_message_24.doStartTag();
      if (_jspx_th_spring_message_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_24[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_24.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_24.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_24);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_25 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_25.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_spring_message_25.setCode("snpchromosome.list.label.strainNAlleleRatio");
    int[] _jspx_push_body_count_spring_message_25 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_25 = _jspx_th_spring_message_25.doStartTag();
      if (_jspx_th_spring_message_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_25[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_25.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_25.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_25);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_26 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_26.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_spring_message_26.setCode("snpchromosome.list.label.strainNAlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_26 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_26 = _jspx_th_spring_message_26.doStartTag();
      if (_jspx_th_spring_message_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_26[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_26.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_26.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_26);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_27(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_27 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_27.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_spring_message_27.setCode("snpchromosome.list.label.strainNAlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_27 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_27 = _jspx_th_spring_message_27.doStartTag();
      if (_jspx_th_spring_message_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_27[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_27.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_27.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_27);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadReference15I()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_28((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_29((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_30((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_31((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_32((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_spring_message_28(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_28 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_28.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_spring_message_28.setCode("snpchromosome.list.label.strain15IAllele");
    int[] _jspx_push_body_count_spring_message_28 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_28 = _jspx_th_spring_message_28.doStartTag();
      if (_jspx_th_spring_message_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_28[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_28.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_28.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_28);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_29(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_29 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_29.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_spring_message_29.setCode("snpchromosome.list.label.strain15IAlleleFixed");
    int[] _jspx_push_body_count_spring_message_29 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_29 = _jspx_th_spring_message_29.doStartTag();
      if (_jspx_th_spring_message_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_29[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_29.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_29.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_29);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_30(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_30 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_30.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_spring_message_30.setCode("snpchromosome.list.label.strain15IAlleleRatio");
    int[] _jspx_push_body_count_spring_message_30 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_30 = _jspx_th_spring_message_30.doStartTag();
      if (_jspx_th_spring_message_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_30[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_30.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_30.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_30);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_31(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_31 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_31.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_spring_message_31.setCode("snpchromosome.list.label.strain15IAlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_31 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_31 = _jspx_th_spring_message_31.doStartTag();
      if (_jspx_th_spring_message_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_31[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_31.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_31.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_31);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_32(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_32 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_32.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_spring_message_32.setCode("snpchromosome.list.label.strain15IAlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_32 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_32 = _jspx_th_spring_message_32.doStartTag();
      if (_jspx_th_spring_message_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_32[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_32.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_32.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_32);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadReferenceZero()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_33((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_34((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_35((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_36((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_37((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_spring_message_33(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_33 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_33.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_spring_message_33.setCode("snpchromosome.list.label.strainZeroAllele");
    int[] _jspx_push_body_count_spring_message_33 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_33 = _jspx_th_spring_message_33.doStartTag();
      if (_jspx_th_spring_message_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_33[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_33.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_33.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_33);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_34(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_34 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_34.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_spring_message_34.setCode("snpchromosome.list.label.strainZeroAlleleFixed");
    int[] _jspx_push_body_count_spring_message_34 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_34 = _jspx_th_spring_message_34.doStartTag();
      if (_jspx_th_spring_message_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_34[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_34.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_34.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_34);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_35(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_35 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_35.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_spring_message_35.setCode("snpchromosome.list.label.strainZeroAlleleRatio");
    int[] _jspx_push_body_count_spring_message_35 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_35 = _jspx_th_spring_message_35.doStartTag();
      if (_jspx_th_spring_message_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_35[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_35.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_35.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_35);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_36(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_36 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_36.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_spring_message_36.setCode("snpchromosome.list.label.strainZeroAlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_36 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_36 = _jspx_th_spring_message_36.doStartTag();
      if (_jspx_th_spring_message_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_36[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_36.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_36.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_36);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_37(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_37 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_37.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_spring_message_37.setCode("snpchromosome.list.label.strainZeroAlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_37 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_37 = _jspx_th_spring_message_37.doStartTag();
      if (_jspx_th_spring_message_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_37[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_37.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_37.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_37);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadReference6()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_38((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_39((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_40((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_41((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_42((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_spring_message_38(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_38 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_38.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_spring_message_38.setCode("snpchromosome.list.label.strain6Allele");
    int[] _jspx_push_body_count_spring_message_38 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_38 = _jspx_th_spring_message_38.doStartTag();
      if (_jspx_th_spring_message_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_38[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_38.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_38.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_38);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_39(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_39 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_39.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_spring_message_39.setCode("snpchromosome.list.label.strain6AlleleFixed");
    int[] _jspx_push_body_count_spring_message_39 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_39 = _jspx_th_spring_message_39.doStartTag();
      if (_jspx_th_spring_message_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_39[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_39.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_39.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_39);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_40(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_40 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_40.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_spring_message_40.setCode("snpchromosome.list.label.strain6AlleleRatio");
    int[] _jspx_push_body_count_spring_message_40 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_40 = _jspx_th_spring_message_40.doStartTag();
      if (_jspx_th_spring_message_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_40[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_40.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_40.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_40);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_41(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_41 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_41.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_spring_message_41.setCode("snpchromosome.list.label.strain6AlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_41 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_41 = _jspx_th_spring_message_41.doStartTag();
      if (_jspx_th_spring_message_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_41[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_41.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_41.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_41);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_42(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_42 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_42.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_spring_message_42.setCode("snpchromosome.list.label.strain6AlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_42 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_42 = _jspx_th_spring_message_42.doStartTag();
      if (_jspx_th_spring_message_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_42[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_42.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_42.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_42);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadReferenceC()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_43((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_44((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_45((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_46((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_47((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_spring_message_43(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_43 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_43.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_spring_message_43.setCode("snpchromosome.list.label.strainCAllele");
    int[] _jspx_push_body_count_spring_message_43 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_43 = _jspx_th_spring_message_43.doStartTag();
      if (_jspx_th_spring_message_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_43[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_43.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_43.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_43);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_44(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_44 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_44.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_spring_message_44.setCode("snpchromosome.list.label.strainCAlleleFixed");
    int[] _jspx_push_body_count_spring_message_44 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_44 = _jspx_th_spring_message_44.doStartTag();
      if (_jspx_th_spring_message_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_44[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_44.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_44.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_44);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_45(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_45 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_45.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_spring_message_45.setCode("snpchromosome.list.label.strainCAlleleRatio");
    int[] _jspx_push_body_count_spring_message_45 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_45 = _jspx_th_spring_message_45.doStartTag();
      if (_jspx_th_spring_message_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_45[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_45.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_45.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_45);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_46(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_46 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_46.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_spring_message_46.setCode("snpchromosome.list.label.strainCAlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_46 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_46 = _jspx_th_spring_message_46.doStartTag();
      if (_jspx_th_spring_message_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_46[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_46.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_46.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_46);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_47(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_47 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_47.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_spring_message_47.setCode("snpchromosome.list.label.strainCAlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_47 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_47 = _jspx_th_spring_message_47.doStartTag();
      if (_jspx_th_spring_message_47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_47[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_47.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_47.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_47);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadAlternative7()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_48((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_49((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_50((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_51((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_52((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }

  private boolean _jspx_meth_spring_message_48(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_48 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_48.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_spring_message_48.setCode("snpchromosome.list.label.strain7Allele");
    int[] _jspx_push_body_count_spring_message_48 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_48 = _jspx_th_spring_message_48.doStartTag();
      if (_jspx_th_spring_message_48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_48[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_48.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_48.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_48);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_49(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_49 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_49.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_49.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_spring_message_49.setCode("snpchromosome.list.label.strain7AlleleFixed");
    int[] _jspx_push_body_count_spring_message_49 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_49 = _jspx_th_spring_message_49.doStartTag();
      if (_jspx_th_spring_message_49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_49[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_49.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_49.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_49);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_50(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_50 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_50.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_50.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_spring_message_50.setCode("snpchromosome.list.label.strain7AlleleRatio");
    int[] _jspx_push_body_count_spring_message_50 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_50 = _jspx_th_spring_message_50.doStartTag();
      if (_jspx_th_spring_message_50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_50[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_50.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_50.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_50);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_51(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_51 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_51.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_51.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_spring_message_51.setCode("snpchromosome.list.label.strain7AlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_51 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_51 = _jspx_th_spring_message_51.doStartTag();
      if (_jspx_th_spring_message_51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_51[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_51.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_51.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_51);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_52(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_52 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_52.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_52.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_spring_message_52.setCode("snpchromosome.list.label.strain7AlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_52 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_52 = _jspx_th_spring_message_52.doStartTag();
      if (_jspx_th_spring_message_52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_52[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_52.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_52.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_52);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadAlternativeP()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_53((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_54((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_55((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_56((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_57((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }

  private boolean _jspx_meth_spring_message_53(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_53 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_53.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_53.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_spring_message_53.setCode("snpchromosome.list.label.strainPAllele");
    int[] _jspx_push_body_count_spring_message_53 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_53 = _jspx_th_spring_message_53.doStartTag();
      if (_jspx_th_spring_message_53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_53[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_53.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_53.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_53);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_54(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_54 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_54.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_54.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_spring_message_54.setCode("snpchromosome.list.label.strainPAlleleFixed");
    int[] _jspx_push_body_count_spring_message_54 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_54 = _jspx_th_spring_message_54.doStartTag();
      if (_jspx_th_spring_message_54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_54[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_54.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_54.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_54);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_55(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_55 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_55.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_55.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_spring_message_55.setCode("snpchromosome.list.label.strainPAlleleRatio");
    int[] _jspx_push_body_count_spring_message_55 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_55 = _jspx_th_spring_message_55.doStartTag();
      if (_jspx_th_spring_message_55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_55[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_55.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_55.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_55);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_56(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_56 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_56.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_56.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_spring_message_56.setCode("snpchromosome.list.label.strainPAlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_56 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_56 = _jspx_th_spring_message_56.doStartTag();
      if (_jspx_th_spring_message_56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_56[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_56.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_56.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_56);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_57(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_57 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_57.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_57.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_spring_message_57.setCode("snpchromosome.list.label.strainPAlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_57 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_57 = _jspx_th_spring_message_57.doStartTag();
      if (_jspx_th_spring_message_57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_57[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_57.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_57.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_57);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadAlternativeW()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_58((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_11, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_59((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_11, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_60((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_11, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_61((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_11, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_62((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_11, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
    return false;
  }

  private boolean _jspx_meth_spring_message_58(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_58 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_58.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_58.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_11);
    _jspx_th_spring_message_58.setCode("snpchromosome.list.label.strainWAllele");
    int[] _jspx_push_body_count_spring_message_58 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_58 = _jspx_th_spring_message_58.doStartTag();
      if (_jspx_th_spring_message_58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_58[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_58.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_58.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_58);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_59(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_59 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_59.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_59.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_11);
    _jspx_th_spring_message_59.setCode("snpchromosome.list.label.strainWAlleleFixed");
    int[] _jspx_push_body_count_spring_message_59 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_59 = _jspx_th_spring_message_59.doStartTag();
      if (_jspx_th_spring_message_59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_59[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_59.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_59.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_59);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_60(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_60 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_60.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_60.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_11);
    _jspx_th_spring_message_60.setCode("snpchromosome.list.label.strainWAlleleRatio");
    int[] _jspx_push_body_count_spring_message_60 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_60 = _jspx_th_spring_message_60.doStartTag();
      if (_jspx_th_spring_message_60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_60[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_60.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_60.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_60);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_61(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_61 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_61.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_61.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_11);
    _jspx_th_spring_message_61.setCode("snpchromosome.list.label.strainWAlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_61 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_61 = _jspx_th_spring_message_61.doStartTag();
      if (_jspx_th_spring_message_61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_61[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_61.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_61.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_61);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_62(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_62 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_62.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_62.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_11);
    _jspx_th_spring_message_62.setCode("snpchromosome.list.label.strainWAlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_62 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_62 = _jspx_th_spring_message_62.doStartTag();
      if (_jspx_th_spring_message_62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_62[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_62.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_62.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_62);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_12.setPageContext(_jspx_page_context);
    _jspx_th_c_if_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadAlternativeN()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_12 = _jspx_th_c_if_12.doStartTag();
    if (_jspx_eval_c_if_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_63((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_12, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_64((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_12, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_65((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_12, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_66((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_12, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_67((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_12, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
    return false;
  }

  private boolean _jspx_meth_spring_message_63(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_63 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_63.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_63.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_12);
    _jspx_th_spring_message_63.setCode("snpchromosome.list.label.strainNAllele");
    int[] _jspx_push_body_count_spring_message_63 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_63 = _jspx_th_spring_message_63.doStartTag();
      if (_jspx_th_spring_message_63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_63[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_63.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_63.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_63);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_64(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_64 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_64.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_64.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_12);
    _jspx_th_spring_message_64.setCode("snpchromosome.list.label.strainNAlleleFixed");
    int[] _jspx_push_body_count_spring_message_64 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_64 = _jspx_th_spring_message_64.doStartTag();
      if (_jspx_th_spring_message_64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_64[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_64.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_64.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_64);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_65(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_65 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_65.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_65.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_12);
    _jspx_th_spring_message_65.setCode("snpchromosome.list.label.strainNAlleleRatio");
    int[] _jspx_push_body_count_spring_message_65 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_65 = _jspx_th_spring_message_65.doStartTag();
      if (_jspx_th_spring_message_65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_65[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_65.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_65.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_65);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_66(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_66 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_66.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_66.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_12);
    _jspx_th_spring_message_66.setCode("snpchromosome.list.label.strainNAlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_66 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_66 = _jspx_th_spring_message_66.doStartTag();
      if (_jspx_th_spring_message_66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_66[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_66.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_66.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_66);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_67(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_67 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_67.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_67.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_12);
    _jspx_th_spring_message_67.setCode("snpchromosome.list.label.strainNAlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_67 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_67 = _jspx_th_spring_message_67.doStartTag();
      if (_jspx_th_spring_message_67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_67[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_67.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_67.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_67);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_13.setPageContext(_jspx_page_context);
    _jspx_th_c_if_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadAlternative15I()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_13 = _jspx_th_c_if_13.doStartTag();
    if (_jspx_eval_c_if_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_68((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_13, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_69((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_13, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_70((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_13, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_71((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_13, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_72((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_13, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
    return false;
  }

  private boolean _jspx_meth_spring_message_68(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_68 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_68.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_68.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_13);
    _jspx_th_spring_message_68.setCode("snpchromosome.list.label.strain15IAllele");
    int[] _jspx_push_body_count_spring_message_68 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_68 = _jspx_th_spring_message_68.doStartTag();
      if (_jspx_th_spring_message_68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_68[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_68.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_68.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_68);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_69(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_69 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_69.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_69.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_13);
    _jspx_th_spring_message_69.setCode("snpchromosome.list.label.strain15IAlleleFixed");
    int[] _jspx_push_body_count_spring_message_69 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_69 = _jspx_th_spring_message_69.doStartTag();
      if (_jspx_th_spring_message_69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_69[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_69.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_69.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_69);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_70(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_70 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_70.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_70.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_13);
    _jspx_th_spring_message_70.setCode("snpchromosome.list.label.strain15IAlleleRatio");
    int[] _jspx_push_body_count_spring_message_70 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_70 = _jspx_th_spring_message_70.doStartTag();
      if (_jspx_th_spring_message_70.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_70[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_70.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_70.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_70);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_71(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_71 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_71.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_71.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_13);
    _jspx_th_spring_message_71.setCode("snpchromosome.list.label.strain15IAlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_71 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_71 = _jspx_th_spring_message_71.doStartTag();
      if (_jspx_th_spring_message_71.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_71[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_71.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_71.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_71);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_72(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_72 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_72.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_72.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_13);
    _jspx_th_spring_message_72.setCode("snpchromosome.list.label.strain15IAlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_72 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_72 = _jspx_th_spring_message_72.doStartTag();
      if (_jspx_th_spring_message_72.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_72[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_72.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_72.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_72);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_14.setPageContext(_jspx_page_context);
    _jspx_th_c_if_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadAlternativeZero()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_14 = _jspx_th_c_if_14.doStartTag();
    if (_jspx_eval_c_if_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_73((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_14, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_74((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_14, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_75((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_14, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_76((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_14, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_77((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_14, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
    return false;
  }

  private boolean _jspx_meth_spring_message_73(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_73 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_73.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_73.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_14);
    _jspx_th_spring_message_73.setCode("snpchromosome.list.label.strainZeroAllele");
    int[] _jspx_push_body_count_spring_message_73 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_73 = _jspx_th_spring_message_73.doStartTag();
      if (_jspx_th_spring_message_73.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_73[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_73.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_73.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_73);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_74(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_74 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_74.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_74.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_14);
    _jspx_th_spring_message_74.setCode("snpchromosome.list.label.strainZeroAlleleFixed");
    int[] _jspx_push_body_count_spring_message_74 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_74 = _jspx_th_spring_message_74.doStartTag();
      if (_jspx_th_spring_message_74.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_74[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_74.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_74.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_74);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_75(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_75 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_75.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_75.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_14);
    _jspx_th_spring_message_75.setCode("snpchromosome.list.label.strainZeroAlleleRatio");
    int[] _jspx_push_body_count_spring_message_75 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_75 = _jspx_th_spring_message_75.doStartTag();
      if (_jspx_th_spring_message_75.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_75[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_75.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_75.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_75);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_76(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_76 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_76.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_76.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_14);
    _jspx_th_spring_message_76.setCode("snpchromosome.list.label.strainZeroAlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_76 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_76 = _jspx_th_spring_message_76.doStartTag();
      if (_jspx_th_spring_message_76.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_76[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_76.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_76.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_76);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_77(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_77 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_77.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_77.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_14);
    _jspx_th_spring_message_77.setCode("snpchromosome.list.label.strainZeroAlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_77 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_77 = _jspx_th_spring_message_77.doStartTag();
      if (_jspx_th_spring_message_77.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_77[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_77.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_77.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_77);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_15 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_15.setPageContext(_jspx_page_context);
    _jspx_th_c_if_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadAlternative6()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_15 = _jspx_th_c_if_15.doStartTag();
    if (_jspx_eval_c_if_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_78((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_15, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_79((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_15, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_80((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_15, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_81((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_15, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_82((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_15, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
    return false;
  }

  private boolean _jspx_meth_spring_message_78(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_78 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_78.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_78.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_15);
    _jspx_th_spring_message_78.setCode("snpchromosome.list.label.strain6Allele");
    int[] _jspx_push_body_count_spring_message_78 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_78 = _jspx_th_spring_message_78.doStartTag();
      if (_jspx_th_spring_message_78.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_78[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_78.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_78.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_78);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_79(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_79 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_79.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_79.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_15);
    _jspx_th_spring_message_79.setCode("snpchromosome.list.label.strain6AlleleFixed");
    int[] _jspx_push_body_count_spring_message_79 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_79 = _jspx_th_spring_message_79.doStartTag();
      if (_jspx_th_spring_message_79.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_79[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_79.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_79.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_79);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_80(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_80 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_80.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_80.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_15);
    _jspx_th_spring_message_80.setCode("snpchromosome.list.label.strain6AlleleRatio");
    int[] _jspx_push_body_count_spring_message_80 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_80 = _jspx_th_spring_message_80.doStartTag();
      if (_jspx_th_spring_message_80.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_80[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_80.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_80.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_80);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_81(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_81 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_81.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_81.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_15);
    _jspx_th_spring_message_81.setCode("snpchromosome.list.label.strain6AlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_81 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_81 = _jspx_th_spring_message_81.doStartTag();
      if (_jspx_th_spring_message_81.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_81[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_81.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_81.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_81);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_82(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_82 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_82.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_82.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_15);
    _jspx_th_spring_message_82.setCode("snpchromosome.list.label.strain6AlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_82 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_82 = _jspx_th_spring_message_82.doStartTag();
      if (_jspx_th_spring_message_82.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_82[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_82.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_82.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_82);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_16 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_16.setPageContext(_jspx_page_context);
    _jspx_th_c_if_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadAlternativeC()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_16 = _jspx_th_c_if_16.doStartTag();
    if (_jspx_eval_c_if_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_83((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_16, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_84((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_16, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_85((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_16, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_86((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_16, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_87((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_16, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
    return false;
  }

  private boolean _jspx_meth_spring_message_83(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_83 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_83.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_83.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_16);
    _jspx_th_spring_message_83.setCode("snpchromosome.list.label.strainCAllele");
    int[] _jspx_push_body_count_spring_message_83 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_83 = _jspx_th_spring_message_83.doStartTag();
      if (_jspx_th_spring_message_83.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_83[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_83.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_83.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_83);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_84(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_84 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_84.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_84.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_16);
    _jspx_th_spring_message_84.setCode("snpchromosome.list.label.strainCAlleleFixed");
    int[] _jspx_push_body_count_spring_message_84 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_84 = _jspx_th_spring_message_84.doStartTag();
      if (_jspx_th_spring_message_84.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_84[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_84.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_84.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_84);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_85(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_85 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_85.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_85.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_16);
    _jspx_th_spring_message_85.setCode("snpchromosome.list.label.strainCAlleleRatio");
    int[] _jspx_push_body_count_spring_message_85 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_85 = _jspx_th_spring_message_85.doStartTag();
      if (_jspx_th_spring_message_85.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_85[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_85.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_85.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_85);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_86(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_86 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_86.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_86.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_16);
    _jspx_th_spring_message_86.setCode("snpchromosome.list.label.strainCAlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_86 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_86 = _jspx_th_spring_message_86.doStartTag();
      if (_jspx_th_spring_message_86.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_86[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_86.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_86.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_86);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_87(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_87 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_87.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_87.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_16);
    _jspx_th_spring_message_87.setCode("snpchromosome.list.label.strainCAlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_87 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_87 = _jspx_th_spring_message_87.doStartTag();
      if (_jspx_th_spring_message_87.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_87[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_87.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_87.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_87);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_88(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_88 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_88.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_88.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_88.setCode("snpchromosome.list.label.aminoAcidSubs");
    int[] _jspx_push_body_count_spring_message_88 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_88 = _jspx_th_spring_message_88.doStartTag();
      if (_jspx_th_spring_message_88.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_88[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_88.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_88.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_88);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_89(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_89 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_89.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_89.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_89.setCode("snpchromosome.list.label.predictionCategory");
    int[] _jspx_push_body_count_spring_message_89 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_89 = _jspx_th_spring_message_89.doStartTag();
      if (_jspx_th_spring_message_89.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_89[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_89.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_89.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_89);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_90(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_90 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_90.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_90.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_90.setCode("snpchromosome.list.label.scoreProvean");
    int[] _jspx_push_body_count_spring_message_90 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_90 = _jspx_th_spring_message_90.doStartTag();
      if (_jspx_th_spring_message_90.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_90[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_90.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_90.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_90);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_91(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_91 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_91.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_91.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_91.setCode("snpchromosome.list.label.scoreSift");
    int[] _jspx_push_body_count_spring_message_91 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_91 = _jspx_th_spring_message_91.doStartTag();
      if (_jspx_th_spring_message_91.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_91[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_91.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_91.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_91);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_92(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_92 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_92.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_92.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_92.setCode("snpchromosome.list.label.scoreConservation");
    int[] _jspx_push_body_count_spring_message_92 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_92 = _jspx_th_spring_message_92.doStartTag();
      if (_jspx_th_spring_message_92.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_92[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_92.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_92.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_92);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_93(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_93 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_93.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_93.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_93.setCode("snpchromosome.list.label.proteinAlignNumber");
    int[] _jspx_push_body_count_spring_message_93 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_93 = _jspx_th_spring_message_93.doStartTag();
      if (_jspx_th_spring_message_93.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_93[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_93.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_93.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_93);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_94(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_94 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_94.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_94.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_94.setCode("snpchromosome.list.label.totalAlignSequenceNumber");
    int[] _jspx_push_body_count_spring_message_94 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_94 = _jspx_th_spring_message_94.doStartTag();
      if (_jspx_th_spring_message_94.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_94[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_94.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_94.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_94);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_95(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_95 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_95.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_95.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_95.setCode("snpchromosome.list.label.chromosomeId");
    int[] _jspx_push_body_count_spring_message_95 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_95 = _jspx_th_spring_message_95.doStartTag();
      if (_jspx_th_spring_message_95.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_95[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_95.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_95.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_95);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_96(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_96 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_96.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_96.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_96.setCode("snpchromosome.list.label.position");
    int[] _jspx_push_body_count_spring_message_96 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_96 = _jspx_th_spring_message_96.doStartTag();
      if (_jspx_th_spring_message_96.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_96[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_96.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_96.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_96);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_97(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_97 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_97.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_97.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_97.setCode("snpchromosome.list.label.reference");
    int[] _jspx_push_body_count_spring_message_97 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_97 = _jspx_th_spring_message_97.doStartTag();
      if (_jspx_th_spring_message_97.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_97[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_97.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_97.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_97);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_98(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_98 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_98.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_98.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_98.setCode("snpchromosome.list.label.alternative");
    int[] _jspx_push_body_count_spring_message_98 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_98 = _jspx_th_spring_message_98.doStartTag();
      if (_jspx_th_spring_message_98.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_98[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_98.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_98.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_98);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_99(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_99 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_99.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_99.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_99.setCode("snpchromosome.list.label.region");
    int[] _jspx_push_body_count_spring_message_99 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_99 = _jspx_th_spring_message_99.doStartTag();
      if (_jspx_th_spring_message_99.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_99[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_99.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_99.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_99);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_100(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_100 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_100.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_100.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_100.setCode("snpchromosome.list.label.ensemblGene");
    int[] _jspx_push_body_count_spring_message_100 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_100 = _jspx_th_spring_message_100.doStartTag();
      if (_jspx_th_spring_message_100.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_100[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_100.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_100.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_100);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_101(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_101 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_101.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_101.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_101.setCode("snpchromosome.list.label.ensemblTranscript");
    int[] _jspx_push_body_count_spring_message_101 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_101 = _jspx_th_spring_message_101.doStartTag();
      if (_jspx_th_spring_message_101.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_101[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_101.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_101.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_101);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_102(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_102 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_102.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_102.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_102.setCode("snpchromosome.list.label.ensemblAnnotation");
    int[] _jspx_push_body_count_spring_message_102 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_102 = _jspx_th_spring_message_102.doStartTag();
      if (_jspx_th_spring_message_102.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_102[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_102.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_102.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_102);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_17 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_17.setPageContext(_jspx_page_context);
    _jspx_th_c_if_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadReference7()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_17 = _jspx_th_c_if_17.doStartTag();
    if (_jspx_eval_c_if_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_103((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_17, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_104((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_17, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_105((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_17, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_106((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_17, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_107((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_17, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_17);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_17);
    return false;
  }

  private boolean _jspx_meth_spring_message_103(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_103 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_103.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_103.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_17);
    _jspx_th_spring_message_103.setCode("snpchromosome.list.label.strain7Allele");
    int[] _jspx_push_body_count_spring_message_103 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_103 = _jspx_th_spring_message_103.doStartTag();
      if (_jspx_th_spring_message_103.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_103[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_103.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_103.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_103);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_104(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_104 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_104.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_104.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_17);
    _jspx_th_spring_message_104.setCode("snpchromosome.list.label.strain7AlleleFixed");
    int[] _jspx_push_body_count_spring_message_104 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_104 = _jspx_th_spring_message_104.doStartTag();
      if (_jspx_th_spring_message_104.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_104[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_104.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_104.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_104);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_105(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_105 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_105.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_105.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_17);
    _jspx_th_spring_message_105.setCode("snpchromosome.list.label.strain7AlleleRatio");
    int[] _jspx_push_body_count_spring_message_105 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_105 = _jspx_th_spring_message_105.doStartTag();
      if (_jspx_th_spring_message_105.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_105[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_105.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_105.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_105);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_106(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_106 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_106.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_106.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_17);
    _jspx_th_spring_message_106.setCode("snpchromosome.list.label.strain7AlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_106 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_106 = _jspx_th_spring_message_106.doStartTag();
      if (_jspx_th_spring_message_106.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_106[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_106.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_106.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_106);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_107(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_107 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_107.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_107.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_17);
    _jspx_th_spring_message_107.setCode("snpchromosome.list.label.strain7AlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_107 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_107 = _jspx_th_spring_message_107.doStartTag();
      if (_jspx_th_spring_message_107.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_107[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_107.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_107.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_107);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_18 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_18.setPageContext(_jspx_page_context);
    _jspx_th_c_if_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_18.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadReferenceP()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_18 = _jspx_th_c_if_18.doStartTag();
    if (_jspx_eval_c_if_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_108((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_18, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_109((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_18, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_110((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_18, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_111((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_18, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_112((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_18, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_18);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_18);
    return false;
  }

  private boolean _jspx_meth_spring_message_108(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_108 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_108.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_108.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_18);
    _jspx_th_spring_message_108.setCode("snpchromosome.list.label.strainPAllele");
    int[] _jspx_push_body_count_spring_message_108 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_108 = _jspx_th_spring_message_108.doStartTag();
      if (_jspx_th_spring_message_108.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_108[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_108.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_108.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_108);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_109(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_109 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_109.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_109.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_18);
    _jspx_th_spring_message_109.setCode("snpchromosome.list.label.strainPAlleleFixed");
    int[] _jspx_push_body_count_spring_message_109 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_109 = _jspx_th_spring_message_109.doStartTag();
      if (_jspx_th_spring_message_109.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_109[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_109.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_109.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_109);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_110(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_110 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_110.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_110.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_18);
    _jspx_th_spring_message_110.setCode("snpchromosome.list.label.strainPAlleleRatio");
    int[] _jspx_push_body_count_spring_message_110 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_110 = _jspx_th_spring_message_110.doStartTag();
      if (_jspx_th_spring_message_110.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_110[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_110.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_110.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_110);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_111(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_111 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_111.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_111.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_18);
    _jspx_th_spring_message_111.setCode("snpchromosome.list.label.strainPAlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_111 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_111 = _jspx_th_spring_message_111.doStartTag();
      if (_jspx_th_spring_message_111.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_111[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_111.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_111.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_111);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_112(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_112 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_112.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_112.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_18);
    _jspx_th_spring_message_112.setCode("snpchromosome.list.label.strainPAlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_112 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_112 = _jspx_th_spring_message_112.doStartTag();
      if (_jspx_th_spring_message_112.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_112[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_112.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_112.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_112);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_19 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_19.setPageContext(_jspx_page_context);
    _jspx_th_c_if_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_19.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadReferenceW()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_19 = _jspx_th_c_if_19.doStartTag();
    if (_jspx_eval_c_if_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_113((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_19, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_114((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_19, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_115((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_19, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_116((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_19, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_117((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_19, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_19);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_19);
    return false;
  }

  private boolean _jspx_meth_spring_message_113(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_19, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_113 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_113.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_113.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_19);
    _jspx_th_spring_message_113.setCode("snpchromosome.list.label.strainWAllele");
    int[] _jspx_push_body_count_spring_message_113 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_113 = _jspx_th_spring_message_113.doStartTag();
      if (_jspx_th_spring_message_113.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_113[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_113.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_113.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_113);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_114(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_19, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_114 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_114.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_114.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_19);
    _jspx_th_spring_message_114.setCode("snpchromosome.list.label.strainWAlleleFixed");
    int[] _jspx_push_body_count_spring_message_114 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_114 = _jspx_th_spring_message_114.doStartTag();
      if (_jspx_th_spring_message_114.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_114[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_114.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_114.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_114);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_115(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_19, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_115 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_115.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_115.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_19);
    _jspx_th_spring_message_115.setCode("snpchromosome.list.label.strainWAlleleRatio");
    int[] _jspx_push_body_count_spring_message_115 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_115 = _jspx_th_spring_message_115.doStartTag();
      if (_jspx_th_spring_message_115.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_115[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_115.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_115.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_115);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_116(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_19, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_116 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_116.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_116.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_19);
    _jspx_th_spring_message_116.setCode("snpchromosome.list.label.strainWAlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_116 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_116 = _jspx_th_spring_message_116.doStartTag();
      if (_jspx_th_spring_message_116.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_116[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_116.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_116.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_116);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_117(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_19, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_117 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_117.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_117.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_19);
    _jspx_th_spring_message_117.setCode("snpchromosome.list.label.strainWAlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_117 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_117 = _jspx_th_spring_message_117.doStartTag();
      if (_jspx_th_spring_message_117.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_117[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_117.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_117.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_117);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_20 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_20.setPageContext(_jspx_page_context);
    _jspx_th_c_if_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_20.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadReferenceN()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_20 = _jspx_th_c_if_20.doStartTag();
    if (_jspx_eval_c_if_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_118((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_119((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_120((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_121((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_122((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_20, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_20);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_20);
    return false;
  }

  private boolean _jspx_meth_spring_message_118(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_118 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_118.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_118.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_spring_message_118.setCode("snpchromosome.list.label.strainNAllele");
    int[] _jspx_push_body_count_spring_message_118 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_118 = _jspx_th_spring_message_118.doStartTag();
      if (_jspx_th_spring_message_118.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_118[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_118.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_118.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_118);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_119(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_119 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_119.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_119.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_spring_message_119.setCode("snpchromosome.list.label.strainNAlleleFixed");
    int[] _jspx_push_body_count_spring_message_119 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_119 = _jspx_th_spring_message_119.doStartTag();
      if (_jspx_th_spring_message_119.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_119[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_119.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_119.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_119);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_120(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_120 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_120.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_120.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_spring_message_120.setCode("snpchromosome.list.label.strainNAlleleRatio");
    int[] _jspx_push_body_count_spring_message_120 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_120 = _jspx_th_spring_message_120.doStartTag();
      if (_jspx_th_spring_message_120.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_120[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_120.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_120.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_120);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_121(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_121 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_121.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_121.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_spring_message_121.setCode("snpchromosome.list.label.strainNAlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_121 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_121 = _jspx_th_spring_message_121.doStartTag();
      if (_jspx_th_spring_message_121.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_121[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_121.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_121.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_121);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_122(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_20, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_122 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_122.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_122.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_20);
    _jspx_th_spring_message_122.setCode("snpchromosome.list.label.strainNAlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_122 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_122 = _jspx_th_spring_message_122.doStartTag();
      if (_jspx_th_spring_message_122.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_122[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_122.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_122.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_122);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_21 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_21.setPageContext(_jspx_page_context);
    _jspx_th_c_if_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_21.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadReference15I()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_21 = _jspx_th_c_if_21.doStartTag();
    if (_jspx_eval_c_if_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_123((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_21, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_124((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_21, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_125((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_21, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_126((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_21, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_127((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_21, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_21);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_21);
    return false;
  }

  private boolean _jspx_meth_spring_message_123(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_123 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_123.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_123.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_21);
    _jspx_th_spring_message_123.setCode("snpchromosome.list.label.strain15IAllele");
    int[] _jspx_push_body_count_spring_message_123 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_123 = _jspx_th_spring_message_123.doStartTag();
      if (_jspx_th_spring_message_123.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_123[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_123.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_123.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_123);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_124(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_124 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_124.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_124.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_21);
    _jspx_th_spring_message_124.setCode("snpchromosome.list.label.strain15IAlleleFixed");
    int[] _jspx_push_body_count_spring_message_124 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_124 = _jspx_th_spring_message_124.doStartTag();
      if (_jspx_th_spring_message_124.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_124[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_124.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_124.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_124);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_125(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_125 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_125.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_125.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_21);
    _jspx_th_spring_message_125.setCode("snpchromosome.list.label.strain15IAlleleRatio");
    int[] _jspx_push_body_count_spring_message_125 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_125 = _jspx_th_spring_message_125.doStartTag();
      if (_jspx_th_spring_message_125.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_125[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_125.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_125.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_125);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_126(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_126 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_126.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_126.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_21);
    _jspx_th_spring_message_126.setCode("snpchromosome.list.label.strain15IAlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_126 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_126 = _jspx_th_spring_message_126.doStartTag();
      if (_jspx_th_spring_message_126.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_126[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_126.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_126.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_126);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_127(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_127 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_127.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_127.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_21);
    _jspx_th_spring_message_127.setCode("snpchromosome.list.label.strain15IAlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_127 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_127 = _jspx_th_spring_message_127.doStartTag();
      if (_jspx_th_spring_message_127.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_127[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_127.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_127.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_127);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_22 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_22.setPageContext(_jspx_page_context);
    _jspx_th_c_if_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_22.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadReferenceZero()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_22 = _jspx_th_c_if_22.doStartTag();
    if (_jspx_eval_c_if_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_128((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_22, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_129((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_22, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_130((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_22, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_131((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_22, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_132((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_22, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_22);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_22);
    return false;
  }

  private boolean _jspx_meth_spring_message_128(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_128 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_128.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_128.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_22);
    _jspx_th_spring_message_128.setCode("snpchromosome.list.label.strainZeroAllele");
    int[] _jspx_push_body_count_spring_message_128 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_128 = _jspx_th_spring_message_128.doStartTag();
      if (_jspx_th_spring_message_128.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_128[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_128.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_128.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_128);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_129(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_129 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_129.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_129.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_22);
    _jspx_th_spring_message_129.setCode("snpchromosome.list.label.strainZeroAlleleFixed");
    int[] _jspx_push_body_count_spring_message_129 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_129 = _jspx_th_spring_message_129.doStartTag();
      if (_jspx_th_spring_message_129.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_129[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_129.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_129.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_129);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_130(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_130 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_130.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_130.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_22);
    _jspx_th_spring_message_130.setCode("snpchromosome.list.label.strainZeroAlleleRatio");
    int[] _jspx_push_body_count_spring_message_130 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_130 = _jspx_th_spring_message_130.doStartTag();
      if (_jspx_th_spring_message_130.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_130[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_130.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_130.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_130);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_131(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_131 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_131.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_131.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_22);
    _jspx_th_spring_message_131.setCode("snpchromosome.list.label.strainZeroAlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_131 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_131 = _jspx_th_spring_message_131.doStartTag();
      if (_jspx_th_spring_message_131.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_131[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_131.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_131.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_131);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_132(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_132 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_132.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_132.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_22);
    _jspx_th_spring_message_132.setCode("snpchromosome.list.label.strainZeroAlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_132 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_132 = _jspx_th_spring_message_132.doStartTag();
      if (_jspx_th_spring_message_132.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_132[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_132.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_132.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_132);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_23 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_23.setPageContext(_jspx_page_context);
    _jspx_th_c_if_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_23.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadReference6()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_23 = _jspx_th_c_if_23.doStartTag();
    if (_jspx_eval_c_if_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_133((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_23, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_134((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_23, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_135((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_23, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_136((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_23, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_137((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_23, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_23);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_23);
    return false;
  }

  private boolean _jspx_meth_spring_message_133(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_23, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_133 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_133.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_133.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_23);
    _jspx_th_spring_message_133.setCode("snpchromosome.list.label.strain6Allele");
    int[] _jspx_push_body_count_spring_message_133 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_133 = _jspx_th_spring_message_133.doStartTag();
      if (_jspx_th_spring_message_133.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_133[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_133.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_133.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_133);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_134(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_23, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_134 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_134.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_134.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_23);
    _jspx_th_spring_message_134.setCode("snpchromosome.list.label.strain6AlleleFixed");
    int[] _jspx_push_body_count_spring_message_134 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_134 = _jspx_th_spring_message_134.doStartTag();
      if (_jspx_th_spring_message_134.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_134[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_134.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_134.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_134);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_135(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_23, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_135 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_135.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_135.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_23);
    _jspx_th_spring_message_135.setCode("snpchromosome.list.label.strain6AlleleRatio");
    int[] _jspx_push_body_count_spring_message_135 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_135 = _jspx_th_spring_message_135.doStartTag();
      if (_jspx_th_spring_message_135.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_135[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_135.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_135.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_135);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_136(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_23, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_136 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_136.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_136.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_23);
    _jspx_th_spring_message_136.setCode("snpchromosome.list.label.strain6AlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_136 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_136 = _jspx_th_spring_message_136.doStartTag();
      if (_jspx_th_spring_message_136.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_136[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_136.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_136.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_136);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_137(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_23, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_137 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_137.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_137.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_23);
    _jspx_th_spring_message_137.setCode("snpchromosome.list.label.strain6AlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_137 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_137 = _jspx_th_spring_message_137.doStartTag();
      if (_jspx_th_spring_message_137.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_137[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_137.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_137.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_137);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_24 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_24.setPageContext(_jspx_page_context);
    _jspx_th_c_if_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_24.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadReferenceC()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_24 = _jspx_th_c_if_24.doStartTag();
    if (_jspx_eval_c_if_24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_138((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_24, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_139((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_24, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_140((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_24, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_141((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_24, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_142((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_24, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_24);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_24);
    return false;
  }

  private boolean _jspx_meth_spring_message_138(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_138 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_138.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_138.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_24);
    _jspx_th_spring_message_138.setCode("snpchromosome.list.label.strainCAllele");
    int[] _jspx_push_body_count_spring_message_138 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_138 = _jspx_th_spring_message_138.doStartTag();
      if (_jspx_th_spring_message_138.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_138[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_138.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_138.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_138);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_139(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_139 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_139.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_139.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_24);
    _jspx_th_spring_message_139.setCode("snpchromosome.list.label.strainCAlleleFixed");
    int[] _jspx_push_body_count_spring_message_139 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_139 = _jspx_th_spring_message_139.doStartTag();
      if (_jspx_th_spring_message_139.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_139[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_139.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_139.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_139);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_140(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_140 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_140.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_140.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_24);
    _jspx_th_spring_message_140.setCode("snpchromosome.list.label.strainCAlleleRatio");
    int[] _jspx_push_body_count_spring_message_140 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_140 = _jspx_th_spring_message_140.doStartTag();
      if (_jspx_th_spring_message_140.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_140[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_140.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_140.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_140);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_141(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_141 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_141.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_141.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_24);
    _jspx_th_spring_message_141.setCode("snpchromosome.list.label.strainCAlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_141 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_141 = _jspx_th_spring_message_141.doStartTag();
      if (_jspx_th_spring_message_141.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_141[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_141.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_141.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_141);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_142(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_142 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_142.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_142.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_24);
    _jspx_th_spring_message_142.setCode("snpchromosome.list.label.strainCAlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_142 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_142 = _jspx_th_spring_message_142.doStartTag();
      if (_jspx_th_spring_message_142.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_142[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_142.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_142.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_142);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_25 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_25.setPageContext(_jspx_page_context);
    _jspx_th_c_if_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_25.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadAlternative7()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_25 = _jspx_th_c_if_25.doStartTag();
    if (_jspx_eval_c_if_25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_143((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_25, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_144((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_25, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_145((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_25, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_146((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_25, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_147((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_25, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_25);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_25);
    return false;
  }

  private boolean _jspx_meth_spring_message_143(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_25, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_143 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_143.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_143.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_25);
    _jspx_th_spring_message_143.setCode("snpchromosome.list.label.strain7Allele");
    int[] _jspx_push_body_count_spring_message_143 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_143 = _jspx_th_spring_message_143.doStartTag();
      if (_jspx_th_spring_message_143.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_143[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_143.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_143.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_143);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_144(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_25, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_144 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_144.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_144.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_25);
    _jspx_th_spring_message_144.setCode("snpchromosome.list.label.strain7AlleleFixed");
    int[] _jspx_push_body_count_spring_message_144 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_144 = _jspx_th_spring_message_144.doStartTag();
      if (_jspx_th_spring_message_144.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_144[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_144.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_144.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_144);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_145(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_25, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_145 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_145.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_145.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_25);
    _jspx_th_spring_message_145.setCode("snpchromosome.list.label.strain7AlleleRatio");
    int[] _jspx_push_body_count_spring_message_145 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_145 = _jspx_th_spring_message_145.doStartTag();
      if (_jspx_th_spring_message_145.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_145[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_145.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_145.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_145);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_146(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_25, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_146 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_146.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_146.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_25);
    _jspx_th_spring_message_146.setCode("snpchromosome.list.label.strain7AlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_146 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_146 = _jspx_th_spring_message_146.doStartTag();
      if (_jspx_th_spring_message_146.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_146[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_146.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_146.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_146);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_147(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_25, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_147 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_147.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_147.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_25);
    _jspx_th_spring_message_147.setCode("snpchromosome.list.label.strain7AlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_147 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_147 = _jspx_th_spring_message_147.doStartTag();
      if (_jspx_th_spring_message_147.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_147[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_147.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_147.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_147);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_26 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_26.setPageContext(_jspx_page_context);
    _jspx_th_c_if_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_26.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadAlternativeP()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_26 = _jspx_th_c_if_26.doStartTag();
    if (_jspx_eval_c_if_26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_148((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_26, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_149((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_26, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_150((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_26, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_151((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_26, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_152((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_26, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_26);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_26);
    return false;
  }

  private boolean _jspx_meth_spring_message_148(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_26, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_148 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_148.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_148.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_26);
    _jspx_th_spring_message_148.setCode("snpchromosome.list.label.strainPAllele");
    int[] _jspx_push_body_count_spring_message_148 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_148 = _jspx_th_spring_message_148.doStartTag();
      if (_jspx_th_spring_message_148.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_148[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_148.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_148.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_148);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_149(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_26, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_149 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_149.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_149.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_26);
    _jspx_th_spring_message_149.setCode("snpchromosome.list.label.strainPAlleleFixed");
    int[] _jspx_push_body_count_spring_message_149 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_149 = _jspx_th_spring_message_149.doStartTag();
      if (_jspx_th_spring_message_149.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_149[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_149.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_149.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_149);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_150(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_26, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_150 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_150.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_150.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_26);
    _jspx_th_spring_message_150.setCode("snpchromosome.list.label.strainPAlleleRatio");
    int[] _jspx_push_body_count_spring_message_150 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_150 = _jspx_th_spring_message_150.doStartTag();
      if (_jspx_th_spring_message_150.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_150[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_150.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_150.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_150);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_151(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_26, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_151 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_151.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_151.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_26);
    _jspx_th_spring_message_151.setCode("snpchromosome.list.label.strainPAlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_151 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_151 = _jspx_th_spring_message_151.doStartTag();
      if (_jspx_th_spring_message_151.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_151[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_151.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_151.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_151);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_152(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_26, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_152 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_152.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_152.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_26);
    _jspx_th_spring_message_152.setCode("snpchromosome.list.label.strainPAlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_152 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_152 = _jspx_th_spring_message_152.doStartTag();
      if (_jspx_th_spring_message_152.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_152[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_152.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_152.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_152);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_27(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_27 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_27.setPageContext(_jspx_page_context);
    _jspx_th_c_if_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_27.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadAlternativeW()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_27 = _jspx_th_c_if_27.doStartTag();
    if (_jspx_eval_c_if_27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_153((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_27, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_154((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_27, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_155((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_27, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_156((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_27, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_157((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_27, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_27.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_27);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_27);
    return false;
  }

  private boolean _jspx_meth_spring_message_153(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_153 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_153.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_153.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_27);
    _jspx_th_spring_message_153.setCode("snpchromosome.list.label.strainWAllele");
    int[] _jspx_push_body_count_spring_message_153 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_153 = _jspx_th_spring_message_153.doStartTag();
      if (_jspx_th_spring_message_153.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_153[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_153.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_153.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_153);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_154(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_154 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_154.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_154.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_27);
    _jspx_th_spring_message_154.setCode("snpchromosome.list.label.strainWAlleleFixed");
    int[] _jspx_push_body_count_spring_message_154 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_154 = _jspx_th_spring_message_154.doStartTag();
      if (_jspx_th_spring_message_154.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_154[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_154.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_154.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_154);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_155(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_155 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_155.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_155.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_27);
    _jspx_th_spring_message_155.setCode("snpchromosome.list.label.strainWAlleleRatio");
    int[] _jspx_push_body_count_spring_message_155 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_155 = _jspx_th_spring_message_155.doStartTag();
      if (_jspx_th_spring_message_155.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_155[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_155.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_155.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_155);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_156(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_156 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_156.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_156.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_27);
    _jspx_th_spring_message_156.setCode("snpchromosome.list.label.strainWAlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_156 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_156 = _jspx_th_spring_message_156.doStartTag();
      if (_jspx_th_spring_message_156.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_156[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_156.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_156.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_156);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_157(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_27, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_157 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_157.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_157.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_27);
    _jspx_th_spring_message_157.setCode("snpchromosome.list.label.strainWAlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_157 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_157 = _jspx_th_spring_message_157.doStartTag();
      if (_jspx_th_spring_message_157.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_157[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_157.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_157.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_157);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_28(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_28 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_28.setPageContext(_jspx_page_context);
    _jspx_th_c_if_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_28.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadAlternativeN()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_28 = _jspx_th_c_if_28.doStartTag();
    if (_jspx_eval_c_if_28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_158((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_28, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_159((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_28, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_160((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_28, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_161((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_28, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_162((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_28, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_28.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_28);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_28);
    return false;
  }

  private boolean _jspx_meth_spring_message_158(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_158 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_158.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_158.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_28);
    _jspx_th_spring_message_158.setCode("snpchromosome.list.label.strainNAllele");
    int[] _jspx_push_body_count_spring_message_158 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_158 = _jspx_th_spring_message_158.doStartTag();
      if (_jspx_th_spring_message_158.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_158[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_158.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_158.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_158);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_159(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_159 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_159.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_159.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_28);
    _jspx_th_spring_message_159.setCode("snpchromosome.list.label.strainNAlleleFixed");
    int[] _jspx_push_body_count_spring_message_159 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_159 = _jspx_th_spring_message_159.doStartTag();
      if (_jspx_th_spring_message_159.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_159[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_159.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_159.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_159);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_160(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_160 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_160.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_160.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_28);
    _jspx_th_spring_message_160.setCode("snpchromosome.list.label.strainNAlleleRatio");
    int[] _jspx_push_body_count_spring_message_160 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_160 = _jspx_th_spring_message_160.doStartTag();
      if (_jspx_th_spring_message_160.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_160[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_160.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_160.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_160);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_161(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_161 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_161.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_161.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_28);
    _jspx_th_spring_message_161.setCode("snpchromosome.list.label.strainNAlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_161 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_161 = _jspx_th_spring_message_161.doStartTag();
      if (_jspx_th_spring_message_161.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_161[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_161.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_161.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_161);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_162(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_162 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_162.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_162.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_28);
    _jspx_th_spring_message_162.setCode("snpchromosome.list.label.strainNAlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_162 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_162 = _jspx_th_spring_message_162.doStartTag();
      if (_jspx_th_spring_message_162.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_162[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_162.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_162.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_162);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_29(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_29 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_29.setPageContext(_jspx_page_context);
    _jspx_th_c_if_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_29.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadAlternative15I()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_29 = _jspx_th_c_if_29.doStartTag();
    if (_jspx_eval_c_if_29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_163((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_29, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_164((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_29, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_165((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_29, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_166((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_29, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_167((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_29, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_29.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_29);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_29);
    return false;
  }

  private boolean _jspx_meth_spring_message_163(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_29, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_163 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_163.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_163.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_29);
    _jspx_th_spring_message_163.setCode("snpchromosome.list.label.strain15IAllele");
    int[] _jspx_push_body_count_spring_message_163 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_163 = _jspx_th_spring_message_163.doStartTag();
      if (_jspx_th_spring_message_163.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_163[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_163.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_163.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_163);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_164(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_29, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_164 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_164.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_164.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_29);
    _jspx_th_spring_message_164.setCode("snpchromosome.list.label.strain15IAlleleFixed");
    int[] _jspx_push_body_count_spring_message_164 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_164 = _jspx_th_spring_message_164.doStartTag();
      if (_jspx_th_spring_message_164.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_164[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_164.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_164.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_164);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_165(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_29, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_165 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_165.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_165.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_29);
    _jspx_th_spring_message_165.setCode("snpchromosome.list.label.strain15IAlleleRatio");
    int[] _jspx_push_body_count_spring_message_165 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_165 = _jspx_th_spring_message_165.doStartTag();
      if (_jspx_th_spring_message_165.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_165[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_165.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_165.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_165);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_166(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_29, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_166 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_166.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_166.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_29);
    _jspx_th_spring_message_166.setCode("snpchromosome.list.label.strain15IAlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_166 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_166 = _jspx_th_spring_message_166.doStartTag();
      if (_jspx_th_spring_message_166.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_166[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_166.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_166.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_166);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_167(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_29, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_167 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_167.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_167.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_29);
    _jspx_th_spring_message_167.setCode("snpchromosome.list.label.strain15IAlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_167 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_167 = _jspx_th_spring_message_167.doStartTag();
      if (_jspx_th_spring_message_167.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_167[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_167.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_167.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_167);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_30(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_30 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_30.setPageContext(_jspx_page_context);
    _jspx_th_c_if_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_30.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadAlternativeZero()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_30 = _jspx_th_c_if_30.doStartTag();
    if (_jspx_eval_c_if_30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_168((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_30, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_169((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_30, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_170((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_30, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_171((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_30, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_172((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_30, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_30.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_30);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_30);
    return false;
  }

  private boolean _jspx_meth_spring_message_168(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_168 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_168.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_168.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_30);
    _jspx_th_spring_message_168.setCode("snpchromosome.list.label.strainZeroAllele");
    int[] _jspx_push_body_count_spring_message_168 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_168 = _jspx_th_spring_message_168.doStartTag();
      if (_jspx_th_spring_message_168.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_168[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_168.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_168.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_168);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_169(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_169 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_169.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_169.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_30);
    _jspx_th_spring_message_169.setCode("snpchromosome.list.label.strainZeroAlleleFixed");
    int[] _jspx_push_body_count_spring_message_169 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_169 = _jspx_th_spring_message_169.doStartTag();
      if (_jspx_th_spring_message_169.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_169[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_169.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_169.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_169);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_170(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_170 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_170.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_170.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_30);
    _jspx_th_spring_message_170.setCode("snpchromosome.list.label.strainZeroAlleleRatio");
    int[] _jspx_push_body_count_spring_message_170 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_170 = _jspx_th_spring_message_170.doStartTag();
      if (_jspx_th_spring_message_170.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_170[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_170.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_170.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_170);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_171(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_171 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_171.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_171.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_30);
    _jspx_th_spring_message_171.setCode("snpchromosome.list.label.strainZeroAlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_171 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_171 = _jspx_th_spring_message_171.doStartTag();
      if (_jspx_th_spring_message_171.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_171[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_171.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_171.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_171);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_172(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_172 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_172.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_172.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_30);
    _jspx_th_spring_message_172.setCode("snpchromosome.list.label.strainZeroAlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_172 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_172 = _jspx_th_spring_message_172.doStartTag();
      if (_jspx_th_spring_message_172.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_172[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_172.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_172.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_172);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_31(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_31 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_31.setPageContext(_jspx_page_context);
    _jspx_th_c_if_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_31.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadAlternative6()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_31 = _jspx_th_c_if_31.doStartTag();
    if (_jspx_eval_c_if_31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_173((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_31, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_174((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_31, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_175((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_31, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_176((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_31, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_177((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_31, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_31.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_31);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_31);
    return false;
  }

  private boolean _jspx_meth_spring_message_173(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_31, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_173 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_173.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_173.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_31);
    _jspx_th_spring_message_173.setCode("snpchromosome.list.label.strain6Allele");
    int[] _jspx_push_body_count_spring_message_173 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_173 = _jspx_th_spring_message_173.doStartTag();
      if (_jspx_th_spring_message_173.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_173[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_173.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_173.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_173);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_174(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_31, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_174 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_174.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_174.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_31);
    _jspx_th_spring_message_174.setCode("snpchromosome.list.label.strain6AlleleFixed");
    int[] _jspx_push_body_count_spring_message_174 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_174 = _jspx_th_spring_message_174.doStartTag();
      if (_jspx_th_spring_message_174.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_174[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_174.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_174.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_174);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_175(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_31, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_175 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_175.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_175.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_31);
    _jspx_th_spring_message_175.setCode("snpchromosome.list.label.strain6AlleleRatio");
    int[] _jspx_push_body_count_spring_message_175 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_175 = _jspx_th_spring_message_175.doStartTag();
      if (_jspx_th_spring_message_175.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_175[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_175.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_175.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_175);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_176(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_31, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_176 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_176.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_176.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_31);
    _jspx_th_spring_message_176.setCode("snpchromosome.list.label.strain6AlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_176 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_176 = _jspx_th_spring_message_176.doStartTag();
      if (_jspx_th_spring_message_176.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_176[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_176.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_176.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_176);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_177(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_31, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_177 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_177.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_177.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_31);
    _jspx_th_spring_message_177.setCode("snpchromosome.list.label.strain6AlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_177 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_177 = _jspx_th_spring_message_177.doStartTag();
      if (_jspx_th_spring_message_177.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_177[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_177.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_177.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_177);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_32(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_32 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_32.setPageContext(_jspx_page_context);
    _jspx_th_c_if_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_32.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadAlternativeC()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_32 = _jspx_th_c_if_32.doStartTag();
    if (_jspx_eval_c_if_32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_178((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_32, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_179((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_32, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_180((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_32, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_181((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_32, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("                <th>");
        if (_jspx_meth_spring_message_182((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_32, _jspx_page_context))
          return true;
        out.write("</th>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_32.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_32);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_32);
    return false;
  }

  private boolean _jspx_meth_spring_message_178(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_32, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_178 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_178.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_178.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_32);
    _jspx_th_spring_message_178.setCode("snpchromosome.list.label.strainCAllele");
    int[] _jspx_push_body_count_spring_message_178 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_178 = _jspx_th_spring_message_178.doStartTag();
      if (_jspx_th_spring_message_178.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_178[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_178.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_178.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_178);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_179(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_32, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_179 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_179.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_179.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_32);
    _jspx_th_spring_message_179.setCode("snpchromosome.list.label.strainCAlleleFixed");
    int[] _jspx_push_body_count_spring_message_179 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_179 = _jspx_th_spring_message_179.doStartTag();
      if (_jspx_th_spring_message_179.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_179[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_179.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_179.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_179);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_180(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_32, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_180 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_180.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_180.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_32);
    _jspx_th_spring_message_180.setCode("snpchromosome.list.label.strainCAlleleRatio");
    int[] _jspx_push_body_count_spring_message_180 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_180 = _jspx_th_spring_message_180.doStartTag();
      if (_jspx_th_spring_message_180.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_180[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_180.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_180.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_180);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_181(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_32, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_181 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_181.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_181.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_32);
    _jspx_th_spring_message_181.setCode("snpchromosome.list.label.strainCAlleleAlternativeCount");
    int[] _jspx_push_body_count_spring_message_181 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_181 = _jspx_th_spring_message_181.doStartTag();
      if (_jspx_th_spring_message_181.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_181[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_181.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_181.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_181);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_182(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_32, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_182 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_182.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_182.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_32);
    _jspx_th_spring_message_182.setCode("snpchromosome.list.label.strainCAlleleReferenceCount");
    int[] _jspx_push_body_count_spring_message_182 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_182 = _jspx_th_spring_message_182.doStartTag();
      if (_jspx_th_spring_message_182.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_182[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_182.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_182.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_182);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_183(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_183 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_183.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_183.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_183.setCode("snpchromosome.list.label.aminoAcidSubs");
    int[] _jspx_push_body_count_spring_message_183 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_183 = _jspx_th_spring_message_183.doStartTag();
      if (_jspx_th_spring_message_183.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_183[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_183.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_183.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_183);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_184(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_184 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_184.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_184.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_184.setCode("snpchromosome.list.label.predictionCategory");
    int[] _jspx_push_body_count_spring_message_184 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_184 = _jspx_th_spring_message_184.doStartTag();
      if (_jspx_th_spring_message_184.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_184[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_184.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_184.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_184);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_185(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_185 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_185.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_185.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_185.setCode("snpchromosome.list.label.scoreProvean");
    int[] _jspx_push_body_count_spring_message_185 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_185 = _jspx_th_spring_message_185.doStartTag();
      if (_jspx_th_spring_message_185.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_185[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_185.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_185.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_185);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_186(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_186 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_186.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_186.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_186.setCode("snpchromosome.list.label.scoreSift");
    int[] _jspx_push_body_count_spring_message_186 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_186 = _jspx_th_spring_message_186.doStartTag();
      if (_jspx_th_spring_message_186.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_186[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_186.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_186.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_186);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_187(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_187 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_187.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_187.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_187.setCode("snpchromosome.list.label.scoreConservation");
    int[] _jspx_push_body_count_spring_message_187 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_187 = _jspx_th_spring_message_187.doStartTag();
      if (_jspx_th_spring_message_187.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_187[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_187.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_187.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_187);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_188(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_188 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_188.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_188.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_188.setCode("snpchromosome.list.label.proteinAlignNumber");
    int[] _jspx_push_body_count_spring_message_188 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_188 = _jspx_th_spring_message_188.doStartTag();
      if (_jspx_th_spring_message_188.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_188[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_188.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_188.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_188);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_189(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_189 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_189.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_189.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_spring_message_189.setCode("snpchromosome.list.label.totalAlignSequenceNumber");
    int[] _jspx_push_body_count_spring_message_189 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_189 = _jspx_th_spring_message_189.doStartTag();
      if (_jspx_th_spring_message_189.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_189[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_189.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_189.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_189);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${SNPChromosome}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("snpchromosome");
    _jspx_th_c_forEach_0.setVarStatus("rowStatus");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        \n");
          out.write("            <tr>\n");
          out.write("        \n");
          out.write("              <td>");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("              <td>");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("              <td>");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("              <td>");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("              <td>");
          if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("              <td>");
          if (_jspx_meth_c_out_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("              <td>");
          if (_jspx_meth_c_out_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("              <td>");
          if (_jspx_meth_c_out_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("              \n");
          out.write("              ");
          if (_jspx_meth_c_if_33((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("              \n");
          out.write("              ");
          if (_jspx_meth_c_if_34((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("              \n");
          out.write("              ");
          if (_jspx_meth_c_if_35((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("              \n");
          out.write("              ");
          if (_jspx_meth_c_if_36((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("              \n");
          out.write("              ");
          if (_jspx_meth_c_if_37((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("              \n");
          out.write("              ");
          if (_jspx_meth_c_if_38((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("              \n");
          out.write("              ");
          if (_jspx_meth_c_if_39((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("              \n");
          out.write("              ");
          if (_jspx_meth_c_if_40((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("              \n");
          out.write("              ");
          if (_jspx_meth_c_if_41((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("              \n");
          out.write("              ");
          if (_jspx_meth_c_if_42((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("              \n");
          out.write("              ");
          if (_jspx_meth_c_if_43((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("              \n");
          out.write("              ");
          if (_jspx_meth_c_if_44((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("              \n");
          out.write("              ");
          if (_jspx_meth_c_if_45((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("              \n");
          out.write("              ");
          if (_jspx_meth_c_if_46((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("              \n");
          out.write("              ");
          if (_jspx_meth_c_if_47((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("              \n");
          out.write("              ");
          if (_jspx_meth_c_if_48((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("              \n");
          out.write("              <td>");
          if (_jspx_meth_c_out_88((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("              <td>");
          if (_jspx_meth_c_out_89((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("              <td>");
          if (_jspx_meth_c_out_90((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("              <td>");
          if (_jspx_meth_c_out_91((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("              <td>");
          if (_jspx_meth_c_out_92((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("              <td>");
          if (_jspx_meth_c_out_93((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("              <td>");
          if (_jspx_meth_c_out_94((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("              \n");
          out.write("            </tr>\n");
          out.write("            \n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.chromosomeId}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.position}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.reference}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.alternative}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getRegionMultiLines()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_out_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getEnsemblGeneMultiLines()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_c_out_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getEnsemblTranscriptMultiLines()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }

  private boolean _jspx_meth_c_out_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_7.setPageContext(_jspx_page_context);
    _jspx_th_c_out_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getEnsemblAnnotationMultiLines()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_7 = _jspx_th_c_out_7.doStartTag();
    if (_jspx_th_c_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
    return false;
  }

  private boolean _jspx_meth_c_if_33(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_33 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_33.setPageContext(_jspx_page_context);
    _jspx_th_c_if_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_33.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadReference7()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_33 = _jspx_th_c_if_33.doStartTag();
    if (_jspx_eval_c_if_33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_33, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_33, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_33, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_33, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_33, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_33.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_33);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_33);
    return false;
  }

  private boolean _jspx_meth_c_out_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_33, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_8 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_8.setPageContext(_jspx_page_context);
    _jspx_th_c_out_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_33);
    _jspx_th_c_out_8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain7Allele()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_8 = _jspx_th_c_out_8.doStartTag();
    if (_jspx_th_c_out_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
    return false;
  }

  private boolean _jspx_meth_c_out_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_33, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_9 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_9.setPageContext(_jspx_page_context);
    _jspx_th_c_out_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_33);
    _jspx_th_c_out_9.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain7AlleleFixed()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_9 = _jspx_th_c_out_9.doStartTag();
    if (_jspx_th_c_out_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
    return false;
  }

  private boolean _jspx_meth_c_out_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_33, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_10 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_10.setPageContext(_jspx_page_context);
    _jspx_th_c_out_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_33);
    _jspx_th_c_out_10.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain7AlleleRatio()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_10 = _jspx_th_c_out_10.doStartTag();
    if (_jspx_th_c_out_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_10);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_10);
    return false;
  }

  private boolean _jspx_meth_c_out_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_33, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_11 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_11.setPageContext(_jspx_page_context);
    _jspx_th_c_out_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_33);
    _jspx_th_c_out_11.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain7AlleleAlternativeCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_11 = _jspx_th_c_out_11.doStartTag();
    if (_jspx_th_c_out_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_11);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_11);
    return false;
  }

  private boolean _jspx_meth_c_out_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_33, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_12 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_12.setPageContext(_jspx_page_context);
    _jspx_th_c_out_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_33);
    _jspx_th_c_out_12.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain7AlleleReferenceCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_12 = _jspx_th_c_out_12.doStartTag();
    if (_jspx_th_c_out_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_12);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_12);
    return false;
  }

  private boolean _jspx_meth_c_if_34(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_34 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_34.setPageContext(_jspx_page_context);
    _jspx_th_c_if_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_34.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadReferenceP()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_34 = _jspx_th_c_if_34.doStartTag();
    if (_jspx_eval_c_if_34 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_34, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_34, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_34, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_34, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_34, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_34.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_34);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_34);
    return false;
  }

  private boolean _jspx_meth_c_out_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_34, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_13 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_13.setPageContext(_jspx_page_context);
    _jspx_th_c_out_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_34);
    _jspx_th_c_out_13.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainPAllele()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_13 = _jspx_th_c_out_13.doStartTag();
    if (_jspx_th_c_out_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_13);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_13);
    return false;
  }

  private boolean _jspx_meth_c_out_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_34, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_14 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_14.setPageContext(_jspx_page_context);
    _jspx_th_c_out_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_34);
    _jspx_th_c_out_14.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainPAlleleFixed()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_14 = _jspx_th_c_out_14.doStartTag();
    if (_jspx_th_c_out_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_14);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_14);
    return false;
  }

  private boolean _jspx_meth_c_out_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_34, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_15 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_15.setPageContext(_jspx_page_context);
    _jspx_th_c_out_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_34);
    _jspx_th_c_out_15.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainPAlleleRatio()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_15 = _jspx_th_c_out_15.doStartTag();
    if (_jspx_th_c_out_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_15);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_15);
    return false;
  }

  private boolean _jspx_meth_c_out_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_34, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_16 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_16.setPageContext(_jspx_page_context);
    _jspx_th_c_out_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_34);
    _jspx_th_c_out_16.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainPAlleleAlternativeCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_16 = _jspx_th_c_out_16.doStartTag();
    if (_jspx_th_c_out_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_16);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_16);
    return false;
  }

  private boolean _jspx_meth_c_out_17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_34, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_17 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_17.setPageContext(_jspx_page_context);
    _jspx_th_c_out_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_34);
    _jspx_th_c_out_17.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainPAlleleReferenceCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_17 = _jspx_th_c_out_17.doStartTag();
    if (_jspx_th_c_out_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_17);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_17);
    return false;
  }

  private boolean _jspx_meth_c_if_35(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_35 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_35.setPageContext(_jspx_page_context);
    _jspx_th_c_if_35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_35.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadReferenceW()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_35 = _jspx_th_c_if_35.doStartTag();
    if (_jspx_eval_c_if_35 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_35, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_35, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_35, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_35, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_35, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_35.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_35);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_35);
    return false;
  }

  private boolean _jspx_meth_c_out_18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_35, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_18 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_18.setPageContext(_jspx_page_context);
    _jspx_th_c_out_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_35);
    _jspx_th_c_out_18.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainWAllele()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_18 = _jspx_th_c_out_18.doStartTag();
    if (_jspx_th_c_out_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_18);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_18);
    return false;
  }

  private boolean _jspx_meth_c_out_19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_35, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_19 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_19.setPageContext(_jspx_page_context);
    _jspx_th_c_out_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_35);
    _jspx_th_c_out_19.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainWAlleleFixed()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_19 = _jspx_th_c_out_19.doStartTag();
    if (_jspx_th_c_out_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_19);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_19);
    return false;
  }

  private boolean _jspx_meth_c_out_20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_35, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_20 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_20.setPageContext(_jspx_page_context);
    _jspx_th_c_out_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_35);
    _jspx_th_c_out_20.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainWAlleleRatio()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_20 = _jspx_th_c_out_20.doStartTag();
    if (_jspx_th_c_out_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_20);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_20);
    return false;
  }

  private boolean _jspx_meth_c_out_21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_35, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_21 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_21.setPageContext(_jspx_page_context);
    _jspx_th_c_out_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_35);
    _jspx_th_c_out_21.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainWAlleleAlternativeCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_21 = _jspx_th_c_out_21.doStartTag();
    if (_jspx_th_c_out_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_21);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_21);
    return false;
  }

  private boolean _jspx_meth_c_out_22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_35, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_22 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_22.setPageContext(_jspx_page_context);
    _jspx_th_c_out_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_35);
    _jspx_th_c_out_22.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainWAlleleReferenceCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_22 = _jspx_th_c_out_22.doStartTag();
    if (_jspx_th_c_out_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_22);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_22);
    return false;
  }

  private boolean _jspx_meth_c_if_36(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_36 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_36.setPageContext(_jspx_page_context);
    _jspx_th_c_if_36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_36.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadReferenceN()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_36 = _jspx_th_c_if_36.doStartTag();
    if (_jspx_eval_c_if_36 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_36, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_36, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_36, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_26((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_36, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_27((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_36, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_36.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_36);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_36);
    return false;
  }

  private boolean _jspx_meth_c_out_23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_36, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_23 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_23.setPageContext(_jspx_page_context);
    _jspx_th_c_out_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_36);
    _jspx_th_c_out_23.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainNAllele()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_23 = _jspx_th_c_out_23.doStartTag();
    if (_jspx_th_c_out_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_23);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_23);
    return false;
  }

  private boolean _jspx_meth_c_out_24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_36, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_24 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_24.setPageContext(_jspx_page_context);
    _jspx_th_c_out_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_36);
    _jspx_th_c_out_24.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainNAlleleFixed()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_24 = _jspx_th_c_out_24.doStartTag();
    if (_jspx_th_c_out_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_24);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_24);
    return false;
  }

  private boolean _jspx_meth_c_out_25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_36, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_25 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_25.setPageContext(_jspx_page_context);
    _jspx_th_c_out_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_36);
    _jspx_th_c_out_25.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainNAlleleRatio()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_25 = _jspx_th_c_out_25.doStartTag();
    if (_jspx_th_c_out_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_25);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_25);
    return false;
  }

  private boolean _jspx_meth_c_out_26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_36, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_26 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_26.setPageContext(_jspx_page_context);
    _jspx_th_c_out_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_36);
    _jspx_th_c_out_26.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainNAlleleAlternativeCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_26 = _jspx_th_c_out_26.doStartTag();
    if (_jspx_th_c_out_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_26);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_26);
    return false;
  }

  private boolean _jspx_meth_c_out_27(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_36, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_27 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_27.setPageContext(_jspx_page_context);
    _jspx_th_c_out_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_36);
    _jspx_th_c_out_27.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainNAlleleReferenceCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_27 = _jspx_th_c_out_27.doStartTag();
    if (_jspx_th_c_out_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_27);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_27);
    return false;
  }

  private boolean _jspx_meth_c_if_37(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_37 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_37.setPageContext(_jspx_page_context);
    _jspx_th_c_if_37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_37.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadReference15I()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_37 = _jspx_th_c_if_37.doStartTag();
    if (_jspx_eval_c_if_37 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_28((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_37, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_29((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_37, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_30((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_37, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_31((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_37, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_32((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_37, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_37.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_37);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_37);
    return false;
  }

  private boolean _jspx_meth_c_out_28(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_37, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_28 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_28.setPageContext(_jspx_page_context);
    _jspx_th_c_out_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_37);
    _jspx_th_c_out_28.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain15IAllele()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_28 = _jspx_th_c_out_28.doStartTag();
    if (_jspx_th_c_out_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_28);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_28);
    return false;
  }

  private boolean _jspx_meth_c_out_29(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_37, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_29 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_29.setPageContext(_jspx_page_context);
    _jspx_th_c_out_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_37);
    _jspx_th_c_out_29.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain15IAlleleFixed()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_29 = _jspx_th_c_out_29.doStartTag();
    if (_jspx_th_c_out_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_29);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_29);
    return false;
  }

  private boolean _jspx_meth_c_out_30(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_37, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_30 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_30.setPageContext(_jspx_page_context);
    _jspx_th_c_out_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_37);
    _jspx_th_c_out_30.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain15IAlleleRatio()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_30 = _jspx_th_c_out_30.doStartTag();
    if (_jspx_th_c_out_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_30);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_30);
    return false;
  }

  private boolean _jspx_meth_c_out_31(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_37, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_31 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_31.setPageContext(_jspx_page_context);
    _jspx_th_c_out_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_37);
    _jspx_th_c_out_31.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain15IAlleleAlternativeCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_31 = _jspx_th_c_out_31.doStartTag();
    if (_jspx_th_c_out_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_31);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_31);
    return false;
  }

  private boolean _jspx_meth_c_out_32(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_37, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_32 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_32.setPageContext(_jspx_page_context);
    _jspx_th_c_out_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_37);
    _jspx_th_c_out_32.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain15IAlleleReferenceCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_32 = _jspx_th_c_out_32.doStartTag();
    if (_jspx_th_c_out_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_32);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_32);
    return false;
  }

  private boolean _jspx_meth_c_if_38(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_38 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_38.setPageContext(_jspx_page_context);
    _jspx_th_c_if_38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_38.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadReferenceZero()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_38 = _jspx_th_c_if_38.doStartTag();
    if (_jspx_eval_c_if_38 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_33((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_38, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_34((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_38, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_35((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_38, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_36((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_38, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_37((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_38, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_38.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_38);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_38);
    return false;
  }

  private boolean _jspx_meth_c_out_33(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_38, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_33 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_33.setPageContext(_jspx_page_context);
    _jspx_th_c_out_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_38);
    _jspx_th_c_out_33.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainZeroAllele()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_33 = _jspx_th_c_out_33.doStartTag();
    if (_jspx_th_c_out_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_33);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_33);
    return false;
  }

  private boolean _jspx_meth_c_out_34(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_38, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_34 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_34.setPageContext(_jspx_page_context);
    _jspx_th_c_out_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_38);
    _jspx_th_c_out_34.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainZeroAlleleFixed()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_34 = _jspx_th_c_out_34.doStartTag();
    if (_jspx_th_c_out_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_34);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_34);
    return false;
  }

  private boolean _jspx_meth_c_out_35(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_38, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_35 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_35.setPageContext(_jspx_page_context);
    _jspx_th_c_out_35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_38);
    _jspx_th_c_out_35.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainZeroAlleleRatio()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_35 = _jspx_th_c_out_35.doStartTag();
    if (_jspx_th_c_out_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_35);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_35);
    return false;
  }

  private boolean _jspx_meth_c_out_36(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_38, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_36 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_36.setPageContext(_jspx_page_context);
    _jspx_th_c_out_36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_38);
    _jspx_th_c_out_36.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainZeroAlleleAlternativeCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_36 = _jspx_th_c_out_36.doStartTag();
    if (_jspx_th_c_out_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_36);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_36);
    return false;
  }

  private boolean _jspx_meth_c_out_37(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_38, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_37 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_37.setPageContext(_jspx_page_context);
    _jspx_th_c_out_37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_38);
    _jspx_th_c_out_37.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainZeroAlleleReferenceCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_37 = _jspx_th_c_out_37.doStartTag();
    if (_jspx_th_c_out_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_37);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_37);
    return false;
  }

  private boolean _jspx_meth_c_if_39(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_39 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_39.setPageContext(_jspx_page_context);
    _jspx_th_c_if_39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_39.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadReference6()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_39 = _jspx_th_c_if_39.doStartTag();
    if (_jspx_eval_c_if_39 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_38((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_39, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_39((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_39, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_40((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_39, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_41((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_39, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_42((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_39, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_39.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_39);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_39);
    return false;
  }

  private boolean _jspx_meth_c_out_38(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_39, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_38 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_38.setPageContext(_jspx_page_context);
    _jspx_th_c_out_38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_39);
    _jspx_th_c_out_38.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain6Allele()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_38 = _jspx_th_c_out_38.doStartTag();
    if (_jspx_th_c_out_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_38);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_38);
    return false;
  }

  private boolean _jspx_meth_c_out_39(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_39, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_39 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_39.setPageContext(_jspx_page_context);
    _jspx_th_c_out_39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_39);
    _jspx_th_c_out_39.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain6AlleleFixed()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_39 = _jspx_th_c_out_39.doStartTag();
    if (_jspx_th_c_out_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_39);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_39);
    return false;
  }

  private boolean _jspx_meth_c_out_40(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_39, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_40 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_40.setPageContext(_jspx_page_context);
    _jspx_th_c_out_40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_39);
    _jspx_th_c_out_40.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain6AlleleRatio()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_40 = _jspx_th_c_out_40.doStartTag();
    if (_jspx_th_c_out_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_40);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_40);
    return false;
  }

  private boolean _jspx_meth_c_out_41(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_39, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_41 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_41.setPageContext(_jspx_page_context);
    _jspx_th_c_out_41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_39);
    _jspx_th_c_out_41.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain6AlleleAlternativeCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_41 = _jspx_th_c_out_41.doStartTag();
    if (_jspx_th_c_out_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_41);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_41);
    return false;
  }

  private boolean _jspx_meth_c_out_42(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_39, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_42 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_42.setPageContext(_jspx_page_context);
    _jspx_th_c_out_42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_39);
    _jspx_th_c_out_42.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain6AlleleReferenceCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_42 = _jspx_th_c_out_42.doStartTag();
    if (_jspx_th_c_out_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_42);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_42);
    return false;
  }

  private boolean _jspx_meth_c_if_40(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_40 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_40.setPageContext(_jspx_page_context);
    _jspx_th_c_if_40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_40.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadReferenceC()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_40 = _jspx_th_c_if_40.doStartTag();
    if (_jspx_eval_c_if_40 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_43((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_40, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_44((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_40, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_45((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_40, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_46((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_40, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_47((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_40, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_40.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_40);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_40);
    return false;
  }

  private boolean _jspx_meth_c_out_43(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_40, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_43 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_43.setPageContext(_jspx_page_context);
    _jspx_th_c_out_43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_40);
    _jspx_th_c_out_43.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainCAllele()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_43 = _jspx_th_c_out_43.doStartTag();
    if (_jspx_th_c_out_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_43);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_43);
    return false;
  }

  private boolean _jspx_meth_c_out_44(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_40, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_44 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_44.setPageContext(_jspx_page_context);
    _jspx_th_c_out_44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_40);
    _jspx_th_c_out_44.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainCAlleleFixed()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_44 = _jspx_th_c_out_44.doStartTag();
    if (_jspx_th_c_out_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_44);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_44);
    return false;
  }

  private boolean _jspx_meth_c_out_45(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_40, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_45 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_45.setPageContext(_jspx_page_context);
    _jspx_th_c_out_45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_40);
    _jspx_th_c_out_45.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainCAlleleRatio()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_45 = _jspx_th_c_out_45.doStartTag();
    if (_jspx_th_c_out_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_45);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_45);
    return false;
  }

  private boolean _jspx_meth_c_out_46(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_40, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_46 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_46.setPageContext(_jspx_page_context);
    _jspx_th_c_out_46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_40);
    _jspx_th_c_out_46.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainCAlleleAlternativeCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_46 = _jspx_th_c_out_46.doStartTag();
    if (_jspx_th_c_out_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_46);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_46);
    return false;
  }

  private boolean _jspx_meth_c_out_47(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_40, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_47 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_47.setPageContext(_jspx_page_context);
    _jspx_th_c_out_47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_40);
    _jspx_th_c_out_47.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainCAlleleReferenceCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_47 = _jspx_th_c_out_47.doStartTag();
    if (_jspx_th_c_out_47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_47);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_47);
    return false;
  }

  private boolean _jspx_meth_c_if_41(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_41 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_41.setPageContext(_jspx_page_context);
    _jspx_th_c_if_41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_41.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadAlternative7()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_41 = _jspx_th_c_if_41.doStartTag();
    if (_jspx_eval_c_if_41 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_48((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_41, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_49((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_41, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_50((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_41, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_51((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_41, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_52((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_41, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_41.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_41);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_41);
    return false;
  }

  private boolean _jspx_meth_c_out_48(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_41, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_48 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_48.setPageContext(_jspx_page_context);
    _jspx_th_c_out_48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_41);
    _jspx_th_c_out_48.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain7Allele()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_48 = _jspx_th_c_out_48.doStartTag();
    if (_jspx_th_c_out_48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_48);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_48);
    return false;
  }

  private boolean _jspx_meth_c_out_49(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_41, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_49 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_49.setPageContext(_jspx_page_context);
    _jspx_th_c_out_49.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_41);
    _jspx_th_c_out_49.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain7AlleleFixed()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_49 = _jspx_th_c_out_49.doStartTag();
    if (_jspx_th_c_out_49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_49);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_49);
    return false;
  }

  private boolean _jspx_meth_c_out_50(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_41, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_50 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_50.setPageContext(_jspx_page_context);
    _jspx_th_c_out_50.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_41);
    _jspx_th_c_out_50.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain7AlleleRatio()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_50 = _jspx_th_c_out_50.doStartTag();
    if (_jspx_th_c_out_50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_50);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_50);
    return false;
  }

  private boolean _jspx_meth_c_out_51(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_41, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_51 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_51.setPageContext(_jspx_page_context);
    _jspx_th_c_out_51.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_41);
    _jspx_th_c_out_51.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain7AlleleAlternativeCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_51 = _jspx_th_c_out_51.doStartTag();
    if (_jspx_th_c_out_51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_51);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_51);
    return false;
  }

  private boolean _jspx_meth_c_out_52(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_41, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_52 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_52.setPageContext(_jspx_page_context);
    _jspx_th_c_out_52.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_41);
    _jspx_th_c_out_52.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain7AlleleReferenceCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_52 = _jspx_th_c_out_52.doStartTag();
    if (_jspx_th_c_out_52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_52);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_52);
    return false;
  }

  private boolean _jspx_meth_c_if_42(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_42 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_42.setPageContext(_jspx_page_context);
    _jspx_th_c_if_42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_42.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadAlternativeP()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_42 = _jspx_th_c_if_42.doStartTag();
    if (_jspx_eval_c_if_42 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_53((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_42, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_54((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_42, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_55((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_42, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_56((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_42, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_57((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_42, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_42.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_42);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_42);
    return false;
  }

  private boolean _jspx_meth_c_out_53(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_42, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_53 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_53.setPageContext(_jspx_page_context);
    _jspx_th_c_out_53.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_42);
    _jspx_th_c_out_53.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainPAllele()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_53 = _jspx_th_c_out_53.doStartTag();
    if (_jspx_th_c_out_53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_53);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_53);
    return false;
  }

  private boolean _jspx_meth_c_out_54(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_42, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_54 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_54.setPageContext(_jspx_page_context);
    _jspx_th_c_out_54.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_42);
    _jspx_th_c_out_54.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainPAlleleFixed()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_54 = _jspx_th_c_out_54.doStartTag();
    if (_jspx_th_c_out_54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_54);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_54);
    return false;
  }

  private boolean _jspx_meth_c_out_55(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_42, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_55 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_55.setPageContext(_jspx_page_context);
    _jspx_th_c_out_55.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_42);
    _jspx_th_c_out_55.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainPAlleleRatio()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_55 = _jspx_th_c_out_55.doStartTag();
    if (_jspx_th_c_out_55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_55);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_55);
    return false;
  }

  private boolean _jspx_meth_c_out_56(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_42, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_56 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_56.setPageContext(_jspx_page_context);
    _jspx_th_c_out_56.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_42);
    _jspx_th_c_out_56.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainPAlleleAlternativeCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_56 = _jspx_th_c_out_56.doStartTag();
    if (_jspx_th_c_out_56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_56);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_56);
    return false;
  }

  private boolean _jspx_meth_c_out_57(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_42, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_57 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_57.setPageContext(_jspx_page_context);
    _jspx_th_c_out_57.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_42);
    _jspx_th_c_out_57.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainPAlleleReferenceCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_57 = _jspx_th_c_out_57.doStartTag();
    if (_jspx_th_c_out_57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_57);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_57);
    return false;
  }

  private boolean _jspx_meth_c_if_43(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_43 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_43.setPageContext(_jspx_page_context);
    _jspx_th_c_if_43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_43.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadAlternativeW()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_43 = _jspx_th_c_if_43.doStartTag();
    if (_jspx_eval_c_if_43 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_58((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_43, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_59((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_43, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_60((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_43, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_61((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_43, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_62((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_43, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_43.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_43);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_43);
    return false;
  }

  private boolean _jspx_meth_c_out_58(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_43, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_58 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_58.setPageContext(_jspx_page_context);
    _jspx_th_c_out_58.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_43);
    _jspx_th_c_out_58.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainWAllele()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_58 = _jspx_th_c_out_58.doStartTag();
    if (_jspx_th_c_out_58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_58);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_58);
    return false;
  }

  private boolean _jspx_meth_c_out_59(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_43, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_59 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_59.setPageContext(_jspx_page_context);
    _jspx_th_c_out_59.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_43);
    _jspx_th_c_out_59.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainWAlleleFixed()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_59 = _jspx_th_c_out_59.doStartTag();
    if (_jspx_th_c_out_59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_59);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_59);
    return false;
  }

  private boolean _jspx_meth_c_out_60(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_43, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_60 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_60.setPageContext(_jspx_page_context);
    _jspx_th_c_out_60.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_43);
    _jspx_th_c_out_60.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainWAlleleRatio()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_60 = _jspx_th_c_out_60.doStartTag();
    if (_jspx_th_c_out_60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_60);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_60);
    return false;
  }

  private boolean _jspx_meth_c_out_61(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_43, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_61 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_61.setPageContext(_jspx_page_context);
    _jspx_th_c_out_61.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_43);
    _jspx_th_c_out_61.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainWAlleleAlternativeCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_61 = _jspx_th_c_out_61.doStartTag();
    if (_jspx_th_c_out_61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_61);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_61);
    return false;
  }

  private boolean _jspx_meth_c_out_62(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_43, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_62 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_62.setPageContext(_jspx_page_context);
    _jspx_th_c_out_62.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_43);
    _jspx_th_c_out_62.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainWAlleleReferenceCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_62 = _jspx_th_c_out_62.doStartTag();
    if (_jspx_th_c_out_62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_62);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_62);
    return false;
  }

  private boolean _jspx_meth_c_if_44(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_44 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_44.setPageContext(_jspx_page_context);
    _jspx_th_c_if_44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_44.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadAlternativeN()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_44 = _jspx_th_c_if_44.doStartTag();
    if (_jspx_eval_c_if_44 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_63((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_44, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_64((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_44, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_65((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_44, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_66((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_44, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_67((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_44, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_44.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_44);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_44);
    return false;
  }

  private boolean _jspx_meth_c_out_63(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_44, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_63 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_63.setPageContext(_jspx_page_context);
    _jspx_th_c_out_63.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_44);
    _jspx_th_c_out_63.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainNAllele()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_63 = _jspx_th_c_out_63.doStartTag();
    if (_jspx_th_c_out_63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_63);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_63);
    return false;
  }

  private boolean _jspx_meth_c_out_64(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_44, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_64 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_64.setPageContext(_jspx_page_context);
    _jspx_th_c_out_64.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_44);
    _jspx_th_c_out_64.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainNAlleleFixed()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_64 = _jspx_th_c_out_64.doStartTag();
    if (_jspx_th_c_out_64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_64);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_64);
    return false;
  }

  private boolean _jspx_meth_c_out_65(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_44, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_65 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_65.setPageContext(_jspx_page_context);
    _jspx_th_c_out_65.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_44);
    _jspx_th_c_out_65.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainNAlleleRatio()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_65 = _jspx_th_c_out_65.doStartTag();
    if (_jspx_th_c_out_65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_65);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_65);
    return false;
  }

  private boolean _jspx_meth_c_out_66(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_44, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_66 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_66.setPageContext(_jspx_page_context);
    _jspx_th_c_out_66.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_44);
    _jspx_th_c_out_66.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainNAlleleAlternativeCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_66 = _jspx_th_c_out_66.doStartTag();
    if (_jspx_th_c_out_66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_66);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_66);
    return false;
  }

  private boolean _jspx_meth_c_out_67(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_44, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_67 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_67.setPageContext(_jspx_page_context);
    _jspx_th_c_out_67.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_44);
    _jspx_th_c_out_67.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainNAlleleReferenceCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_67 = _jspx_th_c_out_67.doStartTag();
    if (_jspx_th_c_out_67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_67);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_67);
    return false;
  }

  private boolean _jspx_meth_c_if_45(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_45 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_45.setPageContext(_jspx_page_context);
    _jspx_th_c_if_45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_45.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadAlternative15I()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_45 = _jspx_th_c_if_45.doStartTag();
    if (_jspx_eval_c_if_45 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_68((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_45, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_69((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_45, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_70((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_45, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_71((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_45, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_72((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_45, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_45.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_45);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_45);
    return false;
  }

  private boolean _jspx_meth_c_out_68(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_45, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_68 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_68.setPageContext(_jspx_page_context);
    _jspx_th_c_out_68.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_45);
    _jspx_th_c_out_68.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain15IAllele()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_68 = _jspx_th_c_out_68.doStartTag();
    if (_jspx_th_c_out_68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_68);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_68);
    return false;
  }

  private boolean _jspx_meth_c_out_69(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_45, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_69 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_69.setPageContext(_jspx_page_context);
    _jspx_th_c_out_69.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_45);
    _jspx_th_c_out_69.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain15IAlleleFixed()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_69 = _jspx_th_c_out_69.doStartTag();
    if (_jspx_th_c_out_69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_69);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_69);
    return false;
  }

  private boolean _jspx_meth_c_out_70(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_45, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_70 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_70.setPageContext(_jspx_page_context);
    _jspx_th_c_out_70.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_45);
    _jspx_th_c_out_70.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain15IAlleleRatio()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_70 = _jspx_th_c_out_70.doStartTag();
    if (_jspx_th_c_out_70.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_70);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_70);
    return false;
  }

  private boolean _jspx_meth_c_out_71(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_45, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_71 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_71.setPageContext(_jspx_page_context);
    _jspx_th_c_out_71.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_45);
    _jspx_th_c_out_71.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain15IAlleleAlternativeCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_71 = _jspx_th_c_out_71.doStartTag();
    if (_jspx_th_c_out_71.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_71);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_71);
    return false;
  }

  private boolean _jspx_meth_c_out_72(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_45, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_72 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_72.setPageContext(_jspx_page_context);
    _jspx_th_c_out_72.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_45);
    _jspx_th_c_out_72.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain15IAlleleReferenceCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_72 = _jspx_th_c_out_72.doStartTag();
    if (_jspx_th_c_out_72.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_72);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_72);
    return false;
  }

  private boolean _jspx_meth_c_if_46(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_46 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_46.setPageContext(_jspx_page_context);
    _jspx_th_c_if_46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_46.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadAlternativeZero()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_46 = _jspx_th_c_if_46.doStartTag();
    if (_jspx_eval_c_if_46 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_73((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_46, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_74((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_46, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_75((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_46, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_76((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_46, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_77((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_46, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_46.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_46);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_46);
    return false;
  }

  private boolean _jspx_meth_c_out_73(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_46, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_73 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_73.setPageContext(_jspx_page_context);
    _jspx_th_c_out_73.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_46);
    _jspx_th_c_out_73.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainZeroAllele()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_73 = _jspx_th_c_out_73.doStartTag();
    if (_jspx_th_c_out_73.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_73);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_73);
    return false;
  }

  private boolean _jspx_meth_c_out_74(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_46, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_74 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_74.setPageContext(_jspx_page_context);
    _jspx_th_c_out_74.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_46);
    _jspx_th_c_out_74.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainZeroAlleleFixed()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_74 = _jspx_th_c_out_74.doStartTag();
    if (_jspx_th_c_out_74.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_74);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_74);
    return false;
  }

  private boolean _jspx_meth_c_out_75(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_46, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_75 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_75.setPageContext(_jspx_page_context);
    _jspx_th_c_out_75.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_46);
    _jspx_th_c_out_75.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainZeroAlleleRatio()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_75 = _jspx_th_c_out_75.doStartTag();
    if (_jspx_th_c_out_75.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_75);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_75);
    return false;
  }

  private boolean _jspx_meth_c_out_76(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_46, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_76 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_76.setPageContext(_jspx_page_context);
    _jspx_th_c_out_76.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_46);
    _jspx_th_c_out_76.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainZeroAlleleAlternativeCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_76 = _jspx_th_c_out_76.doStartTag();
    if (_jspx_th_c_out_76.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_76);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_76);
    return false;
  }

  private boolean _jspx_meth_c_out_77(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_46, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_77 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_77.setPageContext(_jspx_page_context);
    _jspx_th_c_out_77.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_46);
    _jspx_th_c_out_77.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainZeroAlleleReferenceCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_77 = _jspx_th_c_out_77.doStartTag();
    if (_jspx_th_c_out_77.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_77);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_77);
    return false;
  }

  private boolean _jspx_meth_c_if_47(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_47 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_47.setPageContext(_jspx_page_context);
    _jspx_th_c_if_47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_47.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadAlternative6()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_47 = _jspx_th_c_if_47.doStartTag();
    if (_jspx_eval_c_if_47 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_78((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_47, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_79((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_47, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_80((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_47, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_81((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_47, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_82((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_47, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_47.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_47);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_47);
    return false;
  }

  private boolean _jspx_meth_c_out_78(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_47, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_78 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_78.setPageContext(_jspx_page_context);
    _jspx_th_c_out_78.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_47);
    _jspx_th_c_out_78.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain6Allele()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_78 = _jspx_th_c_out_78.doStartTag();
    if (_jspx_th_c_out_78.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_78);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_78);
    return false;
  }

  private boolean _jspx_meth_c_out_79(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_47, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_79 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_79.setPageContext(_jspx_page_context);
    _jspx_th_c_out_79.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_47);
    _jspx_th_c_out_79.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain6AlleleFixed()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_79 = _jspx_th_c_out_79.doStartTag();
    if (_jspx_th_c_out_79.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_79);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_79);
    return false;
  }

  private boolean _jspx_meth_c_out_80(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_47, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_80 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_80.setPageContext(_jspx_page_context);
    _jspx_th_c_out_80.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_47);
    _jspx_th_c_out_80.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain6AlleleRatio()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_80 = _jspx_th_c_out_80.doStartTag();
    if (_jspx_th_c_out_80.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_80);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_80);
    return false;
  }

  private boolean _jspx_meth_c_out_81(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_47, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_81 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_81.setPageContext(_jspx_page_context);
    _jspx_th_c_out_81.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_47);
    _jspx_th_c_out_81.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain6AlleleAlternativeCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_81 = _jspx_th_c_out_81.doStartTag();
    if (_jspx_th_c_out_81.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_81);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_81);
    return false;
  }

  private boolean _jspx_meth_c_out_82(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_47, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_82 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_82.setPageContext(_jspx_page_context);
    _jspx_th_c_out_82.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_47);
    _jspx_th_c_out_82.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrain6AlleleReferenceCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_82 = _jspx_th_c_out_82.doStartTag();
    if (_jspx_th_c_out_82.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_82);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_82);
    return false;
  }

  private boolean _jspx_meth_c_if_48(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_48 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_48.setPageContext(_jspx_page_context);
    _jspx_th_c_if_48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_48.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtoDownload.isDownloadAlternativeC()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_48 = _jspx_th_c_if_48.doStartTag();
    if (_jspx_eval_c_if_48 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_83((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_48, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_84((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_48, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_85((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_48, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_86((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_48, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("                <td>");
        if (_jspx_meth_c_out_87((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_48, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</td>\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_if_48.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_48);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_48);
    return false;
  }

  private boolean _jspx_meth_c_out_83(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_48, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_83 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_83.setPageContext(_jspx_page_context);
    _jspx_th_c_out_83.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_48);
    _jspx_th_c_out_83.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainCAllele()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_83 = _jspx_th_c_out_83.doStartTag();
    if (_jspx_th_c_out_83.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_83);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_83);
    return false;
  }

  private boolean _jspx_meth_c_out_84(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_48, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_84 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_84.setPageContext(_jspx_page_context);
    _jspx_th_c_out_84.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_48);
    _jspx_th_c_out_84.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainCAlleleFixed()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_84 = _jspx_th_c_out_84.doStartTag();
    if (_jspx_th_c_out_84.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_84);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_84);
    return false;
  }

  private boolean _jspx_meth_c_out_85(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_48, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_85 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_85.setPageContext(_jspx_page_context);
    _jspx_th_c_out_85.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_48);
    _jspx_th_c_out_85.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainCAlleleRatio()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_85 = _jspx_th_c_out_85.doStartTag();
    if (_jspx_th_c_out_85.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_85);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_85);
    return false;
  }

  private boolean _jspx_meth_c_out_86(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_48, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_86 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_86.setPageContext(_jspx_page_context);
    _jspx_th_c_out_86.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_48);
    _jspx_th_c_out_86.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainCAlleleAlternativeCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_86 = _jspx_th_c_out_86.doStartTag();
    if (_jspx_th_c_out_86.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_86);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_86);
    return false;
  }

  private boolean _jspx_meth_c_out_87(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_48, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_87 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_87.setPageContext(_jspx_page_context);
    _jspx_th_c_out_87.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_48);
    _jspx_th_c_out_87.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getStrainCAlleleReferenceCount()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_87 = _jspx_th_c_out_87.doStartTag();
    if (_jspx_th_c_out_87.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_87);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_87);
    return false;
  }

  private boolean _jspx_meth_c_out_88(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_88 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_88.setPageContext(_jspx_page_context);
    _jspx_th_c_out_88.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_88.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getAminoAcidSubs()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_88 = _jspx_th_c_out_88.doStartTag();
    if (_jspx_th_c_out_88.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_88);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_88);
    return false;
  }

  private boolean _jspx_meth_c_out_89(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_89 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_89.setPageContext(_jspx_page_context);
    _jspx_th_c_out_89.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_89.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getPredictionCategory()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_89 = _jspx_th_c_out_89.doStartTag();
    if (_jspx_th_c_out_89.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_89);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_89);
    return false;
  }

  private boolean _jspx_meth_c_out_90(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_90 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_90.setPageContext(_jspx_page_context);
    _jspx_th_c_out_90.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_90.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getScoreProvean()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_90 = _jspx_th_c_out_90.doStartTag();
    if (_jspx_th_c_out_90.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_90);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_90);
    return false;
  }

  private boolean _jspx_meth_c_out_91(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_91 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_91.setPageContext(_jspx_page_context);
    _jspx_th_c_out_91.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_91.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getScoreSift()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_91 = _jspx_th_c_out_91.doStartTag();
    if (_jspx_th_c_out_91.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_91);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_91);
    return false;
  }

  private boolean _jspx_meth_c_out_92(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_92 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_92.setPageContext(_jspx_page_context);
    _jspx_th_c_out_92.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_92.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getScoreConservation()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_92 = _jspx_th_c_out_92.doStartTag();
    if (_jspx_th_c_out_92.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_92);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_92);
    return false;
  }

  private boolean _jspx_meth_c_out_93(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_93 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_93.setPageContext(_jspx_page_context);
    _jspx_th_c_out_93.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_93.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getProteinAlignNumber()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_93 = _jspx_th_c_out_93.doStartTag();
    if (_jspx_th_c_out_93.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_93);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_93);
    return false;
  }

  private boolean _jspx_meth_c_out_94(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_94 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_94.setPageContext(_jspx_page_context);
    _jspx_th_c_out_94.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_94.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${snpchromosome.getTotalAlignSequenceNumber()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_94 = _jspx_th_c_out_94.doStartTag();
    if (_jspx_th_c_out_94.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_94);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_94);
    return false;
  }
}
