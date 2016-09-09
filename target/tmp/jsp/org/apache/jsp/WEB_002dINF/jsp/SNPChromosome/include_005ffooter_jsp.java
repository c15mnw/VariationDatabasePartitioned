package org.apache.jsp.WEB_002dINF.jsp.SNPChromosome;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class include_005ffooter_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
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
      out.write("<div>\n");
      out.write("  <div id=\"footer\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"visible-phone text-center\">\n");
      out.write("          Our partners:<br /><br />\n");
      out.write("          <a href=\"http://www.wellcome.ac.uk/\">Wellcome Trust</a>\n");
      out.write("          <hr>\n");
      out.write("          <a href=\"http://www.ed.ac.uk\">The University of Edinburgh</a>\n");
      out.write("          <hr>\n");
      out.write("          <a href=\"http://www.bbsrc.ac.uk/home/home.aspx\">BBSRC</a>\n");
      out.write("          <hr>\n");
      out.write("          <a href=\"http://www.roslinbiocentre.com/about/what-we-offer/community/tenants/roslin-foundation\">Roslin Foundation</a>\n");
      out.write("          <hr>\n");
      out.write("          <a href=\"http://www.roslin.ed.ac.uk/\">The Roslin Institute</a>\n");
      out.write("          <hr>\n");
      out.write("          <a href=\"http://www.pirbright.ac.uk/\">The Pirbright Institute</a>\n");
      out.write("          <hr>\n");
      out.write("        </div><!-- /.visible-phone text-center -->\n");
      out.write("        <div class=\"span2\">\n");
      out.write("          <div class=\"partner visible-tablet visible-desktop\"><a href=\"http://www.wellcome.ac.uk/\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/img/partners/wellcome-trust.png\" alt=\"Supported by Wellcome Trust\"></a>\n");
      out.write("          </div>\n");
      out.write("        </div><!-- /.span2 -->\n");
      out.write("        <div class=\"span2\">\n");
      out.write("          <div class=\"partner visible-tablet visible-desktop\"><a href=\"http://www.ed.ac.uk\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/img/partners/ed-uni.png\" alt=\"The University of Edinburgh\"></a>\n");
      out.write("          </div>\n");
      out.write("        </div><!-- /.span2 -->\n");
      out.write("        <div class=\"span2\">\n");
      out.write("          <div class=\"partner visible-tablet visible-desktop\"><a href=\"http://www.bbsrc.ac.uk/home/home.aspx\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/img/partners/bbsrc.png\" alt=\"BBSRC\"></a>\n");
      out.write("          </div>\n");
      out.write("        </div><!-- /.span2 -->\n");
      out.write("        <div class=\"span2\">\n");
      out.write("          <div class=\"partner visible-tablet visible-desktop\"><a href=\"http://www.roslinbiocentre.com/about/what-we-offer/community/tenants/roslin-foundation\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/img/partners/roslin-foundation.png\" alt=\"Roslin Foundation\"></a>\n");
      out.write("          </div>   \n");
      out.write("        </div><!-- /.span2 -->\n");
      out.write("        <div class=\"span2\">\n");
      out.write("          <div class=\"partner visible-tablet visible-desktop\"><a href=\"http://www.roslin.ed.ac.uk/\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/img/partners/roslin.png\" alt=\"The Roslin Institute\"></a>\n");
      out.write("          </div>\n");
      out.write("        </div><!-- /.span2 -->\n");
      out.write("        <div class=\"span2\">\n");
      out.write("          <div class=\"partner visible-tablet visible-desktop\"><a href=\"http://www.pirbright.ac.uk/\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/img/partners/pirbright.png\" alt=\"The Pirbright Institute\"></a>\n");
      out.write("          </div>\n");
      out.write("        </div><!-- /.span2 -->\n");
      out.write("      </div><!-- /.row -->\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"span9\">\n");
      out.write("        </div><!-- /.span9 -->\n");
      out.write("        <div class=\"span3\">\n");
      out.write("          <p>&copy; NARF 2013 | <a href=\"http://www.narf.ac.uk/privacy-cookies.html\">Privacy &amp; Cookies</a></p>\n");
      out.write("        </div><!-- /.span3 -->\n");
      out.write("      </div><!-- /.row -->\n");
      out.write("    </div><!-- /.container -->\n");
      out.write("  </div><!-- /.footer -->\n");
      out.write("</div>\n");
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
}
