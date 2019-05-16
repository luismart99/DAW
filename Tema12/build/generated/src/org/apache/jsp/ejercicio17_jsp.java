package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ejercicio17_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"estilos17.css\">\n");
      out.write("        <title>Configurar Coche</title>\n");
      out.write(" \n");
      out.write("          <h1>Personaliza tu interior</h1>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        Tapicería\n");
      out.write("        <select>\n");
      out.write("            \n");
      out.write("            <option value=\"cuero-Alcántara\" selected=\"selected\">Cuero Alcántara</option>\n");
      out.write("            <option value=\"cuero Milano\">Cuero Milano</option>\n");
      out.write("            <option value=\"cuero napa fina \">Cuero Napa Fina Negro-Negro-Gris Roca</option>\n");
      out.write("            <option value=\"cuero napa fina 2\">Cuero Napa Fina Negro-Negro-Rojo Crescendo</option>\n");
      out.write("            <option value=\"cuero napa fina 3\">Cuero Napa Fina Plata Luna-Plata Luna-Gris Roca</option>\n");
      out.write("        </select>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        Material de las molduras\n");
      out.write("          <select>\n");
      out.write("            \n");
      out.write("            <option value=\"Aluminio Race Serie\"selected=\"selected\">Aluminio Race Serie</option>\n");
      out.write("      \n");
      out.write("        </select>\n");
      out.write("        \n");
      out.write("          <br>\n");
      out.write("          <br>\n");
      out.write("          \n");
      out.write("          <input type=\"submit\" name=\"Aceptar\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("    </body>\n");
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
