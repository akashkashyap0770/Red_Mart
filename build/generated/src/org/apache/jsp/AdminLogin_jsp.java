package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            *{\n");
      out.write("                margin: 0px;\n");
      out.write("                padding: 0px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            .cont{\n");
      out.write("                display: block;\n");
      out.write("                height: 745px;\n");
      out.write("                width: 100%;\n");
      out.write("                background:url('img/wallpaperflare.com_wallpaper.jpg')no-repeat center/cover;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .form{\n");
      out.write("                width: 365px;\n");
      out.write("                padding-top: 35px;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                height: 400px;\n");
      out.write("                background-color: mintcream;\n");
      out.write("                display: inline-block;\n");
      out.write("                top: 40px;\n");
      out.write("                font-size: 20px;\n");
      out.write("                left: 930px;\n");
      out.write("                position: absolute;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .int{\n");
      out.write("                outline: none;\n");
      out.write("                border: none;\n");
      out.write("                border-bottom: 2px solid black;\n");
      out.write("                color: black;\n");
      out.write("                width: 300px;\n");
      out.write("                height: 40px;\n");
      out.write("                padding: 15px;\n");
      out.write("            }\n");
      out.write("            .select{\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 30px;\n");
      out.write("                color: black;\n");
      out.write("                background: rgba(255,255,255,0.6);\n");
      out.write("                font-size: 18px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                padding: 6px 12px;\n");
      out.write("                width: 400px;\n");
      out.write("                height: 40px;\n");
      out.write("            }\n");
      out.write("            .li{\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            .btn{\n");
      out.write("                right: 35px;\n");
      out.write("                position: absolute;\n");
      out.write("                width: 150px;\n");
      out.write("                height: 40px;\n");
      out.write("                font-size: 20px;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            .btn:hover{\n");
      out.write("                color: skyblue;\n");
      out.write("            }\n");
      out.write("            .lab{\n");
      out.write("                top: 325px;\n");
      out.write("                right: 245px;\n");
      out.write("                color: black;\n");
      out.write("                font-size: 15px;\n");
      out.write("                position: absolute;\n");
      out.write("            }\n");
      out.write("            .check{\n");
      out.write("                left: 135px;\n");
      out.write("                top: 325px;\n");
      out.write("                position: absolute;\n");
      out.write("                width: 20px;\n");
      out.write("                height: 20px; \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"cont\">\n");
      out.write("            <form action=\"AdminLoginConf\" class=\"form\">\n");
      out.write("                <u style=\"color:white;\"><h1 style=\"color:skyblue;\">Admin Login Here</h1></u>\n");
      out.write("                <select name=\"utype\"><option>Admin</option></select>\n");
      out.write("                <br><br>\n");
      out.write("                <input class=\"int\" type=\"text\" name=\"email\" placeholder=\"Enter email id\">\n");
      out.write("                <br><br>\n");
      out.write("                <input class=\"int\" type=\"password\" name=\"pswd\" placeholder=\"Enter password\">\n");
      out.write("                <br><br>\n");
      out.write("                <input class=\"int\" type=\"password\" name=\"pswd\" placeholder=\"Enter Confirm password\">\n");
      out.write("                <br><br>\n");
      out.write("                <label class=\"lab\">Remember me</label><input class=\"check\" type=\"checkbox\" required=\"\"></input>\n");
      out.write("                <button class=\"btn\" type=\"submit\" value=\"Submit\">Login</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
