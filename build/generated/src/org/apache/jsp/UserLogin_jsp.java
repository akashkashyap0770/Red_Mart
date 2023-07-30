package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login Here</title>\n");
      out.write("        <style>\n");
      out.write("            * {\n");
      out.write("                margin: 0px;\n");
      out.write("                padding: 0px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .name {\n");
      out.write("                left: 30px;\n");
      out.write("                top: 25px;\n");
      out.write("                position: absolute;\n");
      out.write("                font-size: 40px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: yellow;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .cont {\n");
      out.write("                display: block;\n");
      out.write("                background:url('img/shopping.jpg')no-repeat center/cover;\n");
      out.write("                height: 100vh;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .input {\n");
      out.write("                padding: 20px;\n");
      out.write("                margin-top: 55px;\n");
      out.write("                position: absolute;\n");
      out.write("                margin-left: 25px;\n");
      out.write("                width: 350px;\n");
      out.write("                height: 40px;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 30px;\n");
      out.write("                outline-color: blue;\n");
      out.write("                outline-offset: 8px;\n");
      out.write("            }\n");
      out.write("            .box{\n");
      out.write("                width: 400px;\n");
      out.write("                height: 450px;\n");
      out.write("                top: 95px;\n");
      out.write("                left: 250px;\n");
      out.write("                line-height: 65px;\n");
      out.write("                position: absolute;\n");
      out.write("                display: inline-block;\n");
      out.write("                border:none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .check {\n");
      out.write("                left: 32px;\n");
      out.write("                top: 395px;\n");
      out.write("                position: absolute;\n");
      out.write("                height: 20px;\n");
      out.write("                width: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn {\n");
      out.write("                left: 70px;\n");
      out.write("                height: 40px;\n");
      out.write("                top: 385px;\n");
      out.write("                position: absolute;\n");
      out.write("                width: 300px;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 30px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-size: 22px;\n");
      out.write("                color: white;\n");
      out.write("                background-color: rgb(95, 186, 4);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn:hover{\n");
      out.write("                background-color: rgb(11, 169, 11);\n");
      out.write("            }\n");
      out.write("            .opt {\n");
      out.write("                top: 112px;\n");
      out.write("                width: 255px;\n");
      out.write("                left: 115px;\n");
      out.write("                position: absolute;\n");
      out.write("                font-size: 12px;\n");
      out.write("                border: none;\n");
      out.write("                background-color: white;\n");
      out.write("                height: 40px;\n");
      out.write("                border-radius: 30px;\n");
      out.write("            }\n");
      out.write("            .utype{\n");
      out.write("                top: 100px;\n");
      out.write("                left: 30px;\n");
      out.write("                position: absolute;\n");
      out.write("                font-size: 14px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"cont\">\n");
      out.write("            <form action=\"UserLoginConf\" class=\"box\">\n");
      out.write("                <h1 class=\"name\">Login Here</h1>\n");
      out.write("                <br>\n");
      out.write("                <label class=\"utype\">USER TYPE</label> <select class=\"opt\" name=\"utype\">\n");
      out.write("                    <option>Retailer</option>\n");
      out.write("                    <option>Salesman</option>\n");
      out.write("                    <option>Customer</option>\n");
      out.write("                </select>\n");
      out.write("                <br>\n");
      out.write("                <input class=\"input\" type=\"text\" name=\"email\" placeholder=\"Username or email id\">\n");
      out.write("                <br>\n");
      out.write("                <input class=\"input\" type=\"password\" name=\"pswd\" placeholder=\"password\">\n");
      out.write("                <br>\n");
      out.write("                <input class=\"input\" type=\"password\" name=\"pswd\" placeholder=\"Confirm password\">\n");
      out.write("                <br>\n");
      out.write("                <input class=\"check\" type=\"checkbox\" required>\n");
      out.write("                <br>\n");
      out.write("                <button class=\"btn\" type=\"submit\" value=\"Submit\">Submit</button>\n");
      out.write("            </form>\n");
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
