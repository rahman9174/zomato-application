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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <style>\n");
      out.write("            #img{\n");
      out.write("                width:10%;\n");
      out.write("                height: 15%;\n");
      out.write("                margin-right: 10px;\n");
      out.write("            }\n");
      out.write("            #img1{\n");
      out.write("                width:10%;\n");
      out.write("                height: 10%;\n");
      out.write("                margin-left: 40px;\n");
      out.write("                border-radius: 50%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .one{\n");
      out.write("                margin-left: 10px;\n");
      out.write("            }\n");
      out.write("            .one:hover{\n");
      out.write("                border-bottom: 2px solid white;\n");
      out.write("            }\n");
      out.write("            .two{\n");
      out.write("                border-bottom: 2px solid black;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .body-image{\n");
      out.write("                width:100%;\n");
      out.write("                height: 65%;\n");
      out.write("                margin-top:5px;\n");
      out.write("            }\n");
      out.write("            .content-div{\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            button{\n");
      out.write("                float: right;\n");
      out.write("                margin-right: 10px;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("            p{\n");
      out.write("                font-size: 15px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <bod>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <navbar class='navbar navbar-expand-lg navbar-light bg-dark' style=\"\">\n");
      out.write("                <img  id=\"img\" src='images/gif.gif' alt=\"logo\"/>\n");
      out.write("                <a class='navbar-brand text-white   one'  href=\"#\"><i class=\"fa fa-home fa-fw\" aria-hidden=\"true\"></i>Home</a>\n");
      out.write("                <a class='navbar-brand text-white one'  href=\"#\"><i class=\"fab fa-creative-commons-share\"></i>Your Order</a>\n");
      out.write("                <a class='navbar-brand text-white one'  href=\"#\">Categories</a>\n");
      out.write("                <a class='navbar-brand text-white one'  href=\"#\">Contact us</a>\n");
      out.write("                <a class='navbar-brand text-white one'  href=\"#\">About us</a>\n");
      out.write("                <form class=\"form-inline my-2 my-lg-0 \" style=\"margin-left:40px\" >\n");
      out.write("                    <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\" >\n");
      out.write("                    <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("                    <button type=\"button\" title=\"Register Your self\" class=\"btn btn-primary btn-outline-success my-2 my-sm-0\">SignIn</button>\n");
      out.write("                    <button type=\"button\" title=\"open your portal by login\" class=\"btn btn-success btn-outline-success my-2 my-sm-0\">Login</button>\n");
      out.write("                    <a href=\"#\"><i class=\"fa fa-shopping-cart\" aria-hidden=\"true\" style=\"color:white;font-size: 40px;\"></i></a>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </navbar>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mt-3 ml-4 two\"><h2>Order your food</h2></div>\n");
      out.write("        <div class=\"container justify-content-auto\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 mt-4  border border-black content-div\">\n");
      out.write("                    <img src=\"images/biryani.jpg\" class=\"body-image\" >\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row border\">\n");
      out.write("                            <div class=\"col-md-6 \">\n");
      out.write("                                <div class=\"ustify-content-center\">\n");
      out.write("                                    <p class=\"pt-0 mt-0\"><b>Biryani<br>Price : Rs.150/.<br> Yummy  <br>20% off</b><span></span><span></span>\n");
      out.write("                                    </p>\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 mt-1 jsutify-content-center\">\n");
      out.write("                                <button class=\"btn btn-primary\">Order Now</button>\n");
      out.write("                                <button class=\"btn btn-primary\">Add to Cart </button>\n");
      out.write("                            </div>\n");
      out.write("                                \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 mt-4  border border-black content-div\">\n");
      out.write("                    <img src=\"images/burger.jpg\" class=\"body-image\" >\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row border\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"\">\n");
      out.write("                                    <p class=\"pt-0 mt-0\"><b>Burger<br>Price : Rs.150/.<br> Yummy Burger <br>20% off</b><span></span><span></span>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 mt-1\"><button class=\"btn btn-primary\">Order Now</button>\n");
      out.write("                                <button class=\"btn btn-primary\">Add to Cart </button></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>                \n");
      out.write("                <div class=\"col-md-4 mt-4  border border-black content-div\">\n");
      out.write("                    <img src=\"images/butter-chicken.jpg\" class=\"body-image\" >\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row border\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"\">\n");
      out.write("                                    <p class=\"pt-0 mt-0\"><b>Butter chicken<br>Price : Rs.150/.<br>Delicious <br>20% off</b><span></span><span></span>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 mt-1\"><button class=\"btn btn-primary\">Order Now</button>\n");
      out.write("                                <button class=\"btn btn-primary\">Add to Cart </button></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>                  \n");
      out.write("            </div> \n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 mt-4  border border-black content-div\">\n");
      out.write("                    <img src=\"images/momos.jpg\" class=\"body-image\" >\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row border\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"\">\n");
      out.write("                                    <p class=\"pt-0 mt-0\"><b>Momos<br>Price : Rs.150/.<br> Yummy & Testy <br>20% off</b><span></span><span></span>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 mt-1\"><button class=\"btn btn-primary\">Order Now</button>\n");
      out.write("                                <button class=\"btn btn-primary\">Add to Cart </button></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 mt-4  border border-black content-div\">\n");
      out.write("                    <img src=\"images/pizza.jpg\" class=\"body-image\" >\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row border\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"\">\n");
      out.write("                                    <p class=\"pt-0 mt-0\"><b>Pizza<br>Price : Rs.150/.<br> Testy <br>20% off</b><span></span><span></span>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 mt-1\"><button class=\"btn btn-primary\">Order Now</button>\n");
      out.write("                                <button class=\"btn btn-primary\">Add to Cart </button></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>                \n");
      out.write("                <div class=\"col-md-4 mt-4  border border-black content-div\">\n");
      out.write("                    <img src=\"images/donut.jpg\" class=\"body-image\" >\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row border\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"\">\n");
      out.write("                                    <p class=\"pt-0 mt-0\"><b>Donut<br>Price : Rs.150/.<br> Yummy <br>20% off</b><span></span><span></span>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 mt-1\"><button class=\"btn btn-primary\">Order Now</button>\n");
      out.write("                                <button class=\"btn btn-primary\">Add to Cart </button></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>                  \n");
      out.write("            </div> \n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 mt-4  border border-black content-div\">\n");
      out.write("                    <img src=\"images/dossa.jpg\" class=\"body-image\" >\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row border\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"\">\n");
      out.write("                                    <p class=\"pt-0 mt-0\"><b>Dossa<br>Price : Rs.150/.<br> Yummy <br>20% off</b><span></span><span></span>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 mt-1\"><button class=\"btn btn-primary\">Order Now</button>\n");
      out.write("                                <button class=\"btn btn-primary\">Add to Cart </button></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 mt-4  border border-black content-div\">\n");
      out.write("                    <img src=\"images/chaumin.jpg\" class=\"body-image\" >\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row border\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"\">\n");
      out.write("                                    <p class=\"pt-0 mt-0\"><b>Chaumin<br>Price : Rs.150/.<br> Spicy <br>20% off</b><span></span><span></span>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 mt-1\"><button class=\"btn btn-primary\">Order Now</button>\n");
      out.write("                                <button class=\"btn btn-primary\">Add to Cart </button></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>                \n");
      out.write("                <div class=\"col-md-4 mt-4  border border-black content-div\">\n");
      out.write("                    <img src=\"images/fried chicken.jpg\" class=\"body-image\" >\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row border\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"\">\n");
      out.write("                                    <p class=\"pt-0 mt-0\"><b>Fried Chicken<br>Price : Rs.150/.<br> Yummy <br>20% off</b><span></span><span></span>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 mt-1\"><button class=\"btn btn-primary\">Order Now</button>\n");
      out.write("                                <button class=\"btn btn-primary\">Add to Cart </button></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>                  \n");
      out.write("            </div> \n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 mt-4  border border-black content-div\">\n");
      out.write("                    <img src=\"images/veg biryan.jpg\" class=\"body-image\" >\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row border\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"\">\n");
      out.write("                                    <p class=\"pt-0 mt-0\"><b>Veg Biryani<br>Price : Rs.150/.<br> Yummy<br>20% off</b><span></span><span></span>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 mt-1\"><button class=\"btn btn-primary\">Order Now</button>\n");
      out.write("                                <button class=\"btn btn-primary\">Add to Cart </button></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 mt-4  border border-black content-div\">\n");
      out.write("                    <img src=\"images/chicken dossa.jpg\" class=\"body-image\" >\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row border\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"\">\n");
      out.write("                                    <p class=\"pt-0 mt-0\"><b>Chicken Dossa<br>Price : Rs.150/.<br> Yummy <br>20% off</b><span></span><span></span>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 mt-1\"><button class=\"btn btn-primary\">Order Now</button>\n");
      out.write("                                <button class=\"btn btn-primary\">Add to Cart </button></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>                \n");
      out.write("                <div class=\"col-md-4 mt-4  border border-black content-div\">\n");
      out.write("                    <img src=\"images/handi pakwaan.jpg\" class=\"body-image\" >\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row border\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"\">\n");
      out.write("                                    <p class=\"pt-0 mt-0\"><b>Handi Pakwan<br>Price : Rs.150/.<br>south dish <br>20% off</b><span></span><span></span>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 mt-1\"><button class=\"btn btn-primary\">Order Now</button>\n");
      out.write("                                <button class=\"btn btn-primary\">Add to Cart </button></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>                  \n");
      out.write("            </div> \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container mt-2 \">\n");
      out.write("            <nav aria-label=\"Page navigation example\">\n");
      out.write("                <ul class=\"pagination justify-content-left\">\n");
      out.write("                    <li class=\"page-item disabled\">\n");
      out.write("                        <a class=\"page-link\" href=\"#\" tabindex=\"-1\">Previous</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"page-item\"><a class=\"page-link\" href=\"HomePage1.jsp\">1</a></li>\n");
      out.write("                    <li class=\"page-item\"><a class=\"page-link\" href=\"HomePage2.jsp\">2</a></li>\n");
      out.write("                    <li class=\"page-item\"><a class=\"page-link\" href=\"HomePage3.jsp\">3</a></li>\n");
      out.write("                    <li class=\"page-item\">\n");
      out.write("                        <a class=\"page-link\" href=\"#\">Next</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
