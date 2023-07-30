package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Red Mart</title>\n");
      out.write("        <style>\n");
      out.write("            * {\n");
      out.write("                margin: 0px;\n");
      out.write("                padding: 0px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                list-style: none;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            header {\n");
      out.write("                display: block;\n");
      out.write("                background: yellow;\n");
      out.write("                height: 120px;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .red {\n");
      out.write("                display: block;\n");
      out.write("                padding-left: 70px;\n");
      out.write("                padding-top: 40px;\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .list li {\n");
      out.write("                display: inline-block;\n");
      out.write("                padding: 60px;\n");
      out.write("                margin-top: -82px;\n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li a {\n");
      out.write("                font-size: 20px;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .cont {\n");
      out.write("                display: block;\n");
      out.write("               background: url('img/log2.jpg')no-repeat center center/cover;\n");
      out.write("                height: 100vh;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .wel {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 16%;\n");
      out.write("                top: 200px;\n");
      out.write("                font-size: 36px;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .para {\n");
      out.write("                padding-right: 515px;\n");
      out.write("                margin-left: 2px;\n");
      out.write("                display: flex;\n");
      out.write("                text-align: center;\n");
      out.write("                margin: auto 45px;\n");
      out.write("                padding-top: 167px;\n");
      out.write("                font-size: 22px;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            .cont a{\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .stulogin {\n");
      out.write("                position: relative;\n");
      out.write("                margin-right: 275px;\n");
      out.write("                float: right;\n");
      out.write("                top: 50px;\n");
      out.write("                padding: 15px 70px;\n");
      out.write("                background-color: red;\n");
      out.write("\n");
      out.write("                color: white;\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("            .stulogin:hover{\n");
      out.write("                background-color: blue;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .regbtn {\n");
      out.write("                position: relative;\n");
      out.write("                margin-left: 345px;\n");
      out.write("                top: 65px;\n");
      out.write("                padding: 15px 70px;\n");
      out.write("                background-color: red;\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("            .regbtn:hover{\n");
      out.write("                background-color: green;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <h1 class=\"red\">Red Mart</h1>\n");
      out.write("            <div>\n");
      out.write("                <ul class=\"list\">\n");
      out.write("                    <li><a href=\"\">Contact Us</a></li>\n");
      out.write("                    <li><a href=\"\">Details</a></li>\n");
      out.write("                    <li><a href=\"\">About</a></li>\n");
      out.write("                    <li><a href=\"\">Home</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"cont\">\n");
      out.write("            <h2 class=\"wel\">Welcome To <span style=\"color:red;\">Red Mart</span> Lucknow</h2>\n");
      out.write("            <br>\n");
      out.write("            <p class=\"para\">\n");
      out.write("                Free online test to practice for Competitive exams. Aptitude, Logical Reasoning, Computer Questions will\n");
      out.write("                help you to prepare for\n");
      out.write("                Online Exam, Entrance and Interview. Learn and Practice online test for Free and\n");
      out.write("                Prepare for your exam online with many free tests and study materials with answers and explanation.\n");
      out.write("            </p>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <button class=\"regbtn\"><a href=\"Register.jsp\">Register Now</a></button>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"background-color: white;\">\n");
      out.write("            <img style=\"margin-left: 3%;\" src=\"Images/Placement.png\" alt=\"\">\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <img src=\"Images/Placement - Copy.png\" alt=\"\">\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
