/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.7
 * Generated at: 2023-08-16 15:29:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.frontend;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Zay Shop eCommerce HTML CSS Template</title>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"apple-touch-icon\" href=\"assets/img/apple-icon.png\">\r\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/templatemo.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/custom.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Load fonts style after rendering the layout styles -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@100;200;300;400;500;700;900&display=swap\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/fontawesome.min.css\">\r\n");
      out.write("    <!--\r\n");
      out.write("\r\n");
      out.write("    TemplateMo 559 Zay Shop\r\n");
      out.write("\r\n");
      out.write("    https://templatemo.com/tm-559-zay-shop\r\n");
      out.write("\r\n");
      out.write("    -->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!-- Start Top Nav -->\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg bg-dark navbar-light d-none d-lg-block\" id=\"templatemo_nav_top\">\r\n");
      out.write("    <div class=\"container text-light\">\r\n");
      out.write("        <div class=\"w-100 d-flex justify-content-between\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <i class=\"fa fa-envelope mx-2\"></i>\r\n");
      out.write("                <a class=\"navbar-sm-brand text-light text-decoration-none\" href=\"mailto:info@company.com\">info@company.com</a>\r\n");
      out.write("                <i class=\"fa fa-phone mx-2\"></i>\r\n");
      out.write("                <a class=\"navbar-sm-brand text-light text-decoration-none\" href=\"tel:010-020-0340\">010-020-0340</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <a class=\"text-light\" href=\"https://fb.com/templatemo\" target=\"_blank\" rel=\"sponsored\"><i class=\"fab fa-facebook-f fa-sm fa-fw me-2\"></i></a>\r\n");
      out.write("                <a class=\"text-light\" href=\"https://www.instagram.com/\" target=\"_blank\"><i class=\"fab fa-instagram fa-sm fa-fw me-2\"></i></a>\r\n");
      out.write("                <a class=\"text-light\" href=\"https://twitter.com/\" target=\"_blank\"><i class=\"fab fa-twitter fa-sm fa-fw me-2\"></i></a>\r\n");
      out.write("                <a class=\"text-light\" href=\"https://www.linkedin.com/\" target=\"_blank\"><i class=\"fab fa-linkedin fa-sm fa-fw\"></i></a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<!-- Close Top Nav -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Header -->\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light shadow\">\r\n");
      out.write("    <div class=\"container d-flex justify-content-between align-items-center\">\r\n");
      out.write("\r\n");
      out.write("        <a class=\"navbar-brand text-success logo h1 align-self-center\" href=\"index.html\">\r\n");
      out.write("            Zay\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <button class=\"navbar-toggler border-0\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#templatemo_main_nav\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"align-self-center collapse navbar-collapse flex-fill  d-lg-flex justify-content-lg-between\" id=\"templatemo_main_nav\">\r\n");
      out.write("            <div class=\"flex-fill\">\r\n");
      out.write("                <ul class=\"nav navbar-nav d-flex justify-content-between mx-lg-auto\">\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"main.jsp\">Home</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"about.jsp\">About</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"shop.jsp\">Shop</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"contact.jsp\">Contact</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"navbar align-self-center d-flex\">\r\n");
      out.write("                <div class=\"d-lg-none flex-sm-fill mt-3 mb-4 col-7 col-sm-auto pr-3\">\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"inputMobileSearch\" placeholder=\"Search ...\">\r\n");
      out.write("                        <div class=\"input-group-text\">\r\n");
      out.write("                            <i class=\"fa fa-fw fa-search\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a class=\"nav-icon d-none d-lg-inline\" href=\"#\" data-bs-toggle=\"modal\" data-bs-target=\"#templatemo_search\">\r\n");
      out.write("                    <i class=\"fa fa-fw fa-search text-dark mr-2\"></i>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a class=\"nav-icon position-relative text-decoration-none\" href=\"#\">\r\n");
      out.write("                    <i class=\"fa fa-fw fa-cart-arrow-down text-dark mr-1\"></i>\r\n");
      out.write("                    <span class=\"position-absolute top-0 left-100 translate-middle badge rounded-pill bg-light text-dark\">7</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a class=\"nav-icon position-relative text-decoration-none\" href=\"#\">\r\n");
      out.write("                    <i class=\"fa fa-fw fa-user text-dark mr-3\"></i>\r\n");
      out.write("                    <span class=\"position-absolute top-0 left-100 translate-middle badge rounded-pill bg-light text-dark\">+99</span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<!-- Close Header -->\r\n");
      out.write("\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div class=\"modal fade bg-white\" id=\"templatemo_search\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-lg\" role=\"document\">\r\n");
      out.write("        <div class=\"w-100 pt-1 mb-5 text-right\">\r\n");
      out.write("            <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <form action=\"\" method=\"get\" class=\"modal-content modal-body border-0 p-0\">\r\n");
      out.write("            <div class=\"input-group mb-2\">\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"inputModalSearch\" name=\"q\" placeholder=\"Search ...\">\r\n");
      out.write("                <button type=\"submit\" class=\"input-group-text bg-success text-light\">\r\n");
      out.write("                    <i class=\"fa fa-fw fa-search text-white\"></i>\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Start Banner Hero -->\r\n");
      out.write("<div id=\"template-mo-zay-hero-carousel\" class=\"carousel slide\" data-bs-ride=\"carousel\">\r\n");
      out.write("    <ol class=\"carousel-indicators\">\r\n");
      out.write("        <li data-bs-target=\"#template-mo-zay-hero-carousel\" data-bs-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("        <li data-bs-target=\"#template-mo-zay-hero-carousel\" data-bs-slide-to=\"1\"></li>\r\n");
      out.write("        <li data-bs-target=\"#template-mo-zay-hero-carousel\" data-bs-slide-to=\"2\"></li>\r\n");
      out.write("    </ol>\r\n");
      out.write("    <div class=\"carousel-inner\">\r\n");
      out.write("        <div class=\"carousel-item active\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row p-5\">\r\n");
      out.write("                    <div class=\"mx-auto col-md-8 col-lg-6 order-lg-last\">\r\n");
      out.write("                        <img class=\"img-fluid\" src=\"./assets/img/banner_img_01.jpg\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-6 mb-0 d-flex align-items-center\">\r\n");
      out.write("                        <div class=\"text-align-left align-self-center\">\r\n");
      out.write("                            <h1 class=\"h1 text-success\"><b>Zay</b> eCommerce</h1>\r\n");
      out.write("                            <h3 class=\"h2\">Tiny and Perfect eCommerce Template</h3>\r\n");
      out.write("                            <p>\r\n");
      out.write("                                Zay Shop is an eCommerce HTML5 CSS template with latest version of Bootstrap 5 (beta 1).\r\n");
      out.write("                                This template is 100% free provided by <a rel=\"sponsored\" class=\"text-success\" href=\"https://templatemo.com\" target=\"_blank\">TemplateMo</a> website.\r\n");
      out.write("                                Image credits go to <a rel=\"sponsored\" class=\"text-success\" href=\"https://stories.freepik.com/\" target=\"_blank\">Freepik Stories</a>,\r\n");
      out.write("                                <a rel=\"sponsored\" class=\"text-success\" href=\"https://unsplash.com/\" target=\"_blank\">Unsplash</a> and\r\n");
      out.write("                                <a rel=\"sponsored\" class=\"text-success\" href=\"https://icons8.com/\" target=\"_blank\">Icons 8</a>.\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"carousel-item\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row p-5\">\r\n");
      out.write("                    <div class=\"mx-auto col-md-8 col-lg-6 order-lg-last\">\r\n");
      out.write("                        <img class=\"img-fluid\" src=\"./assets/img/banner_img_02.jpg\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-6 mb-0 d-flex align-items-center\">\r\n");
      out.write("                        <div class=\"text-align-left\">\r\n");
      out.write("                            <h1 class=\"h1\">Proident occaecat</h1>\r\n");
      out.write("                            <h3 class=\"h2\">Aliquip ex ea commodo consequat</h3>\r\n");
      out.write("                            <p>\r\n");
      out.write("                                You are permitted to use this Zay CSS template for your commercial websites.\r\n");
      out.write("                                You are <strong>not permitted</strong> to re-distribute the template ZIP file in any kind of template collection websites.\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"carousel-item\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row p-5\">\r\n");
      out.write("                    <div class=\"mx-auto col-md-8 col-lg-6 order-lg-last\">\r\n");
      out.write("                        <img class=\"img-fluid\" src=\"./assets/img/banner_img_03.jpg\" alt=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-6 mb-0 d-flex align-items-center\">\r\n");
      out.write("                        <div class=\"text-align-left\">\r\n");
      out.write("                            <h1 class=\"h1\">Repr in voluptate</h1>\r\n");
      out.write("                            <h3 class=\"h2\">Ullamco laboris nisi ut </h3>\r\n");
      out.write("                            <p>\r\n");
      out.write("                                We bring you 100% free CSS templates for your websites.\r\n");
      out.write("                                If you wish to support TemplateMo, please make a small contribution via PayPal or tell your friends about our website. Thank you.\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <a class=\"carousel-control-prev text-decoration-none w-auto ps-3\" href=\"#template-mo-zay-hero-carousel\" role=\"button\" data-bs-slide=\"prev\">\r\n");
      out.write("        <i class=\"fas fa-chevron-left\"></i>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a class=\"carousel-control-next text-decoration-none w-auto pe-3\" href=\"#template-mo-zay-hero-carousel\" role=\"button\" data-bs-slide=\"next\">\r\n");
      out.write("        <i class=\"fas fa-chevron-right\"></i>\r\n");
      out.write("    </a>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- End Banner Hero -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Start Categories of The Month -->\r\n");
      out.write("<section class=\"container py-5\">\r\n");
      out.write("    <div class=\"row text-center pt-3\">\r\n");
      out.write("        <div class=\"col-lg-6 m-auto\">\r\n");
      out.write("            <h1 class=\"h1\">Categories of The Month</h1>\r\n");
      out.write("            <p>\r\n");
      out.write("                Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia\r\n");
      out.write("                deserunt mollit anim id est laborum.\r\n");
      out.write("            </p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-12 col-md-4 p-5 mt-3\">\r\n");
      out.write("            <a href=\"#\"><img src=\"./assets/img/category_img_01.jpg\" class=\"rounded-circle img-fluid border\"></a>\r\n");
      out.write("            <h5 class=\"text-center mt-3 mb-3\">Watches</h5>\r\n");
      out.write("            <p class=\"text-center\"><a class=\"btn btn-success\">Go Shop</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-12 col-md-4 p-5 mt-3\">\r\n");
      out.write("            <a href=\"#\"><img src=\"./assets/img/category_img_02.jpg\" class=\"rounded-circle img-fluid border\"></a>\r\n");
      out.write("            <h2 class=\"h5 text-center mt-3 mb-3\">Shoes</h2>\r\n");
      out.write("            <p class=\"text-center\"><a class=\"btn btn-success\">Go Shop</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-12 col-md-4 p-5 mt-3\">\r\n");
      out.write("            <a href=\"#\"><img src=\"./assets/img/category_img_03.jpg\" class=\"rounded-circle img-fluid border\"></a>\r\n");
      out.write("            <h2 class=\"h5 text-center mt-3 mb-3\">Accessories</h2>\r\n");
      out.write("            <p class=\"text-center\"><a class=\"btn btn-success\">Go Shop</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("<!-- End Categories of The Month -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Start Featured Product -->\r\n");
      out.write("<section class=\"bg-light\">\r\n");
      out.write("    <div class=\"container py-5\">\r\n");
      out.write("        <div class=\"row text-center py-3\">\r\n");
      out.write("            <div class=\"col-lg-6 m-auto\">\r\n");
      out.write("                <h1 class=\"h1\">Featured Product</h1>\r\n");
      out.write("                <p>\r\n");
      out.write("                    Reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.\r\n");
      out.write("                    Excepteur sint occaecat cupidatat non proident.\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-12 col-md-4 mb-4\">\r\n");
      out.write("                <div class=\"card h-100\">\r\n");
      out.write("                    <a href=\"shop-single.html\">\r\n");
      out.write("                        <img src=\"./assets/img/feature_prod_01.jpg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <ul class=\"list-unstyled d-flex justify-content-between\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <i class=\"text-warning fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"text-warning fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"text-warning fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"text-muted fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"text-muted fa fa-star\"></i>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"text-muted text-right\">$240.00</li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <a href=\"shop-single.html\" class=\"h2 text-decoration-none text-dark\">Gym Weight</a>\r\n");
      out.write("                        <p class=\"card-text\">\r\n");
      out.write("                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sunt in culpa qui officia deserunt.\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <p class=\"text-muted\">Reviews (24)</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-12 col-md-4 mb-4\">\r\n");
      out.write("                <div class=\"card h-100\">\r\n");
      out.write("                    <a href=\"shop-single.html\">\r\n");
      out.write("                        <img src=\"./assets/img/feature_prod_02.jpg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <ul class=\"list-unstyled d-flex justify-content-between\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <i class=\"text-warning fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"text-warning fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"text-warning fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"text-muted fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"text-muted fa fa-star\"></i>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"text-muted text-right\">$480.00</li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <a href=\"shop-single.html\" class=\"h2 text-decoration-none text-dark\">Cloud Nike Shoes</a>\r\n");
      out.write("                        <p class=\"card-text\">\r\n");
      out.write("                            Aenean gravida dignissim finibus. Nullam ipsum diam, posuere vitae pharetra sed, commodo ullamcorper.\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <p class=\"text-muted\">Reviews (48)</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-12 col-md-4 mb-4\">\r\n");
      out.write("                <div class=\"card h-100\">\r\n");
      out.write("                    <a href=\"shop-single.html\">\r\n");
      out.write("                        <img src=\"./assets/img/feature_prod_03.jpg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <ul class=\"list-unstyled d-flex justify-content-between\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <i class=\"text-warning fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"text-warning fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"text-warning fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"text-warning fa fa-star\"></i>\r\n");
      out.write("                                <i class=\"text-warning fa fa-star\"></i>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"text-muted text-right\">$360.00</li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <a href=\"shop-single.html\" class=\"h2 text-decoration-none text-dark\">Summer Addides Shoes</a>\r\n");
      out.write("                        <p class=\"card-text\">\r\n");
      out.write("                            Curabitur ac mi sit amet diam luctus porta. Phasellus pulvinar sagittis diam, et scelerisque ipsum lobortis nec.\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <p class=\"text-muted\">Reviews (74)</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("<!-- End Featured Product -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Start Footer -->\r\n");
      out.write("<footer class=\"bg-dark\" id=\"tempaltemo_footer\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-md-4 pt-5\">\r\n");
      out.write("                <h2 class=\"h2 text-success border-bottom pb-3 border-light logo\">Zay Shop</h2>\r\n");
      out.write("                <ul class=\"list-unstyled text-light footer-link-list\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <i class=\"fas fa-map-marker-alt fa-fw\"></i>\r\n");
      out.write("                        123 Consectetur at ligula 10660\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <i class=\"fa fa-phone fa-fw\"></i>\r\n");
      out.write("                        <a class=\"text-decoration-none\" href=\"tel:010-020-0340\">010-020-0340</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <i class=\"fa fa-envelope fa-fw\"></i>\r\n");
      out.write("                        <a class=\"text-decoration-none\" href=\"mailto:info@company.com\">info@company.com</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-md-4 pt-5\">\r\n");
      out.write("                <h2 class=\"h2 text-light border-bottom pb-3 border-light\">Products</h2>\r\n");
      out.write("                <ul class=\"list-unstyled text-light footer-link-list\">\r\n");
      out.write("                    <li><a class=\"text-decoration-none\" href=\"#\">Luxury</a></li>\r\n");
      out.write("                    <li><a class=\"text-decoration-none\" href=\"#\">Sport Wear</a></li>\r\n");
      out.write("                    <li><a class=\"text-decoration-none\" href=\"#\">Men's Shoes</a></li>\r\n");
      out.write("                    <li><a class=\"text-decoration-none\" href=\"#\">Women's Shoes</a></li>\r\n");
      out.write("                    <li><a class=\"text-decoration-none\" href=\"#\">Popular Dress</a></li>\r\n");
      out.write("                    <li><a class=\"text-decoration-none\" href=\"#\">Gym Accessories</a></li>\r\n");
      out.write("                    <li><a class=\"text-decoration-none\" href=\"#\">Sport Shoes</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-md-4 pt-5\">\r\n");
      out.write("                <h2 class=\"h2 text-light border-bottom pb-3 border-light\">Further Info</h2>\r\n");
      out.write("                <ul class=\"list-unstyled text-light footer-link-list\">\r\n");
      out.write("                    <li><a class=\"text-decoration-none\" href=\"#\">Home</a></li>\r\n");
      out.write("                    <li><a class=\"text-decoration-none\" href=\"#\">About Us</a></li>\r\n");
      out.write("                    <li><a class=\"text-decoration-none\" href=\"#\">Shop Locations</a></li>\r\n");
      out.write("                    <li><a class=\"text-decoration-none\" href=\"#\">FAQs</a></li>\r\n");
      out.write("                    <li><a class=\"text-decoration-none\" href=\"#\">Contact</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row text-light mb-4\">\r\n");
      out.write("            <div class=\"col-12 mb-3\">\r\n");
      out.write("                <div class=\"w-100 my-3 border-top border-light\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-auto me-auto\">\r\n");
      out.write("                <ul class=\"list-inline text-left footer-icons\">\r\n");
      out.write("                    <li class=\"list-inline-item border border-light rounded-circle text-center\">\r\n");
      out.write("                        <a class=\"text-light text-decoration-none\" target=\"_blank\" href=\"http://facebook.com/\"><i class=\"fab fa-facebook-f fa-lg fa-fw\"></i></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"list-inline-item border border-light rounded-circle text-center\">\r\n");
      out.write("                        <a class=\"text-light text-decoration-none\" target=\"_blank\" href=\"https://www.instagram.com/\"><i class=\"fab fa-instagram fa-lg fa-fw\"></i></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"list-inline-item border border-light rounded-circle text-center\">\r\n");
      out.write("                        <a class=\"text-light text-decoration-none\" target=\"_blank\" href=\"https://twitter.com/\"><i class=\"fab fa-twitter fa-lg fa-fw\"></i></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"list-inline-item border border-light rounded-circle text-center\">\r\n");
      out.write("                        <a class=\"text-light text-decoration-none\" target=\"_blank\" href=\"https://www.linkedin.com/\"><i class=\"fab fa-linkedin fa-lg fa-fw\"></i></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-auto\">\r\n");
      out.write("                <label class=\"sr-only\" for=\"subscribeEmail\">Email address</label>\r\n");
      out.write("                <div class=\"input-group mb-2\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control bg-dark border-light\" id=\"subscribeEmail\" placeholder=\"Email address\">\r\n");
      out.write("                    <div class=\"input-group-text btn-success text-light\">Subscribe</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"w-100 bg-black py-3\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row pt-2\">\r\n");
      out.write("                <div class=\"col-12\">\r\n");
      out.write("                    <p class=\"text-left text-light\">\r\n");
      out.write("                        Copyright &copy; 2021 Company Name\r\n");
      out.write("                        | Designed by <a rel=\"sponsored\" href=\"https://templatemo.com\" target=\"_blank\">TemplateMo</a>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</footer>\r\n");
      out.write("<!-- End Footer -->\r\n");
      out.write("\r\n");
      out.write("<!-- Start Script -->\r\n");
      out.write("<script src=\"assets/js/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("<script src=\"assets/js/jquery-migrate-1.2.1.min.js\"></script>\r\n");
      out.write("<script src=\"assets/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<script src=\"assets/js/templatemo.js\"></script>\r\n");
      out.write("<script src=\"assets/js/custom.js\"></script>\r\n");
      out.write("<!-- End Script -->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
