package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class valle_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Turista</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"estilos.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"fonts.css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Josefin+Sans|Montez|Pathway+Gothic+One\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"contenedor\">\n");
      out.write("\n");
      out.write("      <header>\n");
      out.write("        <h1 class=\"title\">Pueblos Mágicos Edo. México</h1>\n");
      out.write("\n");
      out.write("      </header>\n");
      out.write("      <div class=\"login\">\n");
      out.write("        <article class=\"fondo\">\n");
      out.write("          <img src=\"img/Logo_Pueblo_Mágicos.jpg\" alt=\"User\">\n");
      out.write("          </br> \n");
      out.write("          <form class=\"\" action=\"mostrara.jsp\" method=\"post\">\n");
      out.write("            <input class=\"boton\" type=\"submit\" name=\"inicio\" value=\"Mostrar archivo para marcadores\">\n");
      out.write("          </form>\n");
      out.write("        </article>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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
