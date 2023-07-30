package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Register Now</title>\n");
      out.write("    <style>\n");
      out.write("        * {\n");
      out.write("            margin: 0px;\n");
      out.write("            padding: 0px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .head {\n");
      out.write("            background-color: red;\n");
      out.write("            height: 100px;\n");
      out.write("            width: 100%;\n");
      out.write("            font-size: 40px;\n");
      out.write("            padding-top: 25px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .cont {\n");
      out.write("            display: block;\n");
      out.write("            line-height: 50px;\n");
      out.write("            background-color: lightsalmon;\n");
      out.write("            height: 700px;\n");
      out.write("            padding: 100px 275px;\n");
      out.write("            font-size: 22px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .input {\n");
      out.write("            outline-color: red;\n");
      out.write("            background-color: lightgrey;\n");
      out.write("            outline-offset: 5px;\n");
      out.write("            border: none;\n");
      out.write("            height: 35px;\n");
      out.write("            width: 285px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #pas {\n");
      out.write("            margin-left: 32px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #mail {\n");
      out.write("            width: 705px;\n");
      out.write("            margin-left: 73px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .opt {\n");
      out.write("            margin-left: 62px;\n");
      out.write("            background-color: lightgrey;\n");
      out.write("            height: 35px;\n");
      out.write("            width: 705px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn {\n");
      out.write("            margin-top: 25px;\n");
      out.write("            font-size: 22px;\n");
      out.write("            width: 200px;\n");
      out.write("            padding: 12px;\n");
      out.write("            margin-left: 385px;\n");
      out.write("            background-color: orangered;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn:hover {\n");
      out.write("            background-color: red;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #int {\n");
      out.write("            margin-left: 52px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #pas {\n");
      out.write("            margin-left: 65px;\n");
      out.write("            width: 225px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <header class=\"head\">\n");
      out.write("        <p style=\"text-align: center; font-weight: bold;\">Register Now</p>\n");
      out.write("    </header>\n");
      out.write("    <div class=\"cont\">\n");
      out.write("        <form action=\"RegisterConf\">\n");
      out.write("            <label class=\"lab\" for=\"\">User Type</label>\n");
      out.write("            <select class=\"opt\" name=\"utype\">\n");
      out.write("                <option>Retailer</option>\n");
      out.write("                <option>Salesman</option>\n");
      out.write("                <option>Customer</option>\n");
      out.write("            </select>\n");
      out.write("            <br><br>\n");
      out.write("            <span><label class=\"lab\" for=\"user\">User Name</label>\n");
      out.write("                <input id=\"int\" class=\"input\" type=\"text\" name=\"uname\" placeholder=\"User Name\">\n");
      out.write("\n");
      out.write("                <label class=\"lab\" for=\"user\">Date of Birth</label>\n");
      out.write("                <input class=\"input\" type=\"date\" name=\"udob\" placeholder=\"Date of birth\"></span>\n");
      out.write("            <br><br>\n");
      out.write("            <span><label class=\"lab\" for=\"user\">Email-Id</label>\n");
      out.write("                <input id=\"mail\" class=\"input\" type=\"email\" name=\"email\" placeholder=\"email\">\n");
      out.write("                <br><br>\n");
      out.write("                <label class=\"lab\" for=\"user\">Password</label>\n");
      out.write("                <input id=\"pas\" class=\"input\" type=\"password\" name=\"pswd\" placeholder=\"password\">\n");
      out.write("                <label class=\"lab\" for=\"user\">Confirm Password</label>\n");
      out.write("                <input id=\"pas\" class=\"input\" type=\"confirm password\" name=\"cpswd\" placeholder=\"confirm password\"></span>\n");
      out.write("            <br><br>\n");
      out.write("            <button class=\"btn\" type=\"submit\" name=\"\" value=\"\">Submit Now</button>\n");
      out.write("        </form>\n");
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
