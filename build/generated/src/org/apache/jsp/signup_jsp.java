package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <title>Sign Up | JavaT</title>\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/animate.min.css\" rel=\"stylesheet\"> \n");
      out.write("    <link href=\"css/lightbox.css\" rel=\"stylesheet\"> \n");
      out.write("\t<link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("\t    <script src=\"js/html5shiv.js\"></script>\n");
      out.write("\t    <script src=\"js/respond.min.js\"></script>\n");
      out.write("    <![endif]-->       \n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/ico/favicon.ico\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("</head><!--/head-->\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<header id=\"header\">      \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12 overflow\">\n");
      out.write("                   <div class=\"social-icons pull-right\">\n");
      out.write("                       <ul class=\"nav nav-pills\">\n");
      out.write("                            <li> <img src=\"images/mic.png\" class=\"mic\" height=\"24px\"></li>\n");
      out.write("                            <li><a href=\"login.html \">Login</a></li> \n");
      out.write("                            <li><a href=\"signup.html\">Sign Up</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("             </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"navbar navbar-inverse\" role=\"banner\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.html\">\n");
      out.write("                    \t<h1><img src=\"images/logo.png\" alt=\"logo\"></h1>\n");
      out.write("                    </a>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("                        <li ><a href=\"index.html\">Home</a></li>\n");
      out.write("                       <li> <a href=\"core.html\">Core Java</a></li>\n");
      out.write("\t\t\t\t\t\t<li > <a href=\"advance.html\">Advance Java</a></li>\n");
      out.write("                        <li ><a href=\"hibernate.html\">Hibernate</a>\n");
      out.write("                        </li>                    \n");
      out.write("                        <li><a href=\"spring.html\">Spring\n");
      out.write("                     </a>\n");
      out.write("                        </li>\n");
      out.write("                                     <li > <a href=\"android.html\">Android</a></li>        \n");
      out.write("                        <li><a href=\"contact.html \">Contact</a></li> \n");
      out.write("<li><a href=\"feedback.html \">Feedback</a></li> \n");
      out.write("\n");
      out.write("<li><a href=\"interview.html \">Interview Q/A </a></li>\t\t\t\t\t\t\t\n");
      out.write("                    </ul>\n");
      out.write("\t\t\t\t\t<div class=\"search\">\n");
      out.write("                    <form role=\"form\">\n");
      out.write("                        <i class=\"fa fa-search\"></i>\n");
      out.write("                        <div class=\"field-toggle\">\n");
      out.write("                            <input type=\"text\" class=\"search-form\" autocomplete=\"off\" placeholder=\"Search\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\t\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t<hr class=\"hr\">\n");
      out.write("<div class=\"row\" >\n");
      out.write("\t \n");
      out.write("<body>\n");
      out.write("<div class=\"col-sm-5 col-md-offset-4\">\n");
      out.write("<div class=\"border\" style=\"width:350px\">\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("               \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<h2><center>Sign Up</center></h2>\n");
      out.write("<form action=\"RegisterServlet\" >\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                        <div class=\"contact-form bottom\">\n");
      out.write("                        \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                Name:<input type=\"text\" name=\"name\" class=\"form-control\" required=\"required\" placeholder=\"Name\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                E-mail:<input type=\"email\" name=\"email\" class=\"form-control\" required=\"required\" placeholder=\"Email Id\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                Password:<input type=\"password\" name=\"password\" class=\"form-control\" required=\"required\" placeholder=\"Password\">\n");
      out.write("                            \n");
      out.write("                            </div>         \n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                              Re-enter Password:<input type=\"password\" name=\"re_password\" class=\"form-control\" required=\"required\" placeholder=\"Password\">\n");
      out.write("                            \n");
      out.write("                            </div>                                       \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"submit\" name=\"submit\" class=\"btn btn-submit\" value=\"Submit\">\n");
      out.write("                            </div>\n");
      out.write("                      \n");
      out.write("                    </div>\n");
      out.write("     </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");

String loginStatus = "";
if(request.getAttribute("loginstatus")!=null){
	loginStatus = request.getAttribute("loginstatus").toString();
}

      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\twindow.onload = function(){\n");
      out.write("\t\tvar loginStatus = '");
      out.print( loginStatus );
      out.write("';\n");
      out.write("\t\tif(loginStatus.length > 0){\n");
      out.write("\t\t\tdocument.getElementById(\"error\").appendChild(document.createTextNode(loginStatus));\t\t\t\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("\t <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/lightbox.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/wow.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/main.js\"></script>   \n");
      out.write("\t</body>\n");
      out.write("\t</html>");
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
