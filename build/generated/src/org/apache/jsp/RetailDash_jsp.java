package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RetailDash_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Dashboard Retailer</title>\n");
      out.write("    <style>\n");
      out.write("        * {\n");
      out.write("            margin: 0px;\n");
      out.write("            padding: 0px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container {\n");
      out.write("            display: block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .head {\n");
      out.write("            height: 150px;\n");
      out.write("            background: lightseagreen;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .head li {\n");
      out.write("            display: inline-block;\n");
      out.write("            padding: 6px 145px;\n");
      out.write("            font-size: 20px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .head button {\n");
      out.write("            width: 200px;\n");
      out.write("            height: 35px;\n");
      out.write("            font-size: 20px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 20px;\n");
      out.write("            background-color: rgb(81, 81, 255);\n");
      out.write("            color: white;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .head button:hover {\n");
      out.write("            color: red;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .cont {\n");
      out.write("            display: block;\n");
      out.write("            background-color: lightskyblue;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 645px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .box {\n");
      out.write("            display: inline-block;\n");
      out.write("            border: 4px solid black;\n");
      out.write("            margin: 75px 117px;\n");
      out.write("            padding: 50px;\n");
      out.write("            height: 150px;\n");
      out.write("            width: 250px;\n");
      out.write("            font-size: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .head h1{\n");
      out.write("            padding-top: 22px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <header class=\"head\">\n");
      out.write("           <u><h1>Dashboard Retailer</h1></u>\n");
      out.write("            <br>\n");
      out.write("            <li><a href=\"\"></a>Welcome:Mr.Expert002</li>\n");
      out.write("            <li><a href=\"\"></a>Designation:Retailer</li>\n");
      out.write("            <li><button>Logout</button></li>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"cont\">\n");
      out.write("            <div class=\"box\"><a href=\"\"></a>Pending Orders 20</div>\n");
      out.write("            <div class=\"box\"><a href=\"\"></a>Available Salesman 24</div>\n");
      out.write("            <div class=\"box\"><a href=\"\"></a>Make a New Order</div>\n");
      out.write("            <div class=\"box\"><a href=\"\"></a>New Order of Customer 40</div>\n");
      out.write("            <div class=\"box\"><a href=\"\"></a>Check your Stock</div>\n");
      out.write("            <div class=\"box\"><a href=\"\"></a>Send Complaint to Admim</div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
