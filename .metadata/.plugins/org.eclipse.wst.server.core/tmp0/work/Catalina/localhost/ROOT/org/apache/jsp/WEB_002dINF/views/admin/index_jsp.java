/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.49
 * Generated at: 2020-09-15 15:35:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/views/admin/include/aside.jsp", Long.valueOf(1600183644511L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1599747949337L));
    _jspx_dependants.put("/WEB-INF/views/admin/include/footer.jsp", Long.valueOf(1599785117496L));
    _jspx_dependants.put("/WEB-INF/views/admin/include/nav.jsp", Long.valueOf(1599801136486L));
    _jspx_dependants.put("jar:file:/C:/Users/82103/Documents/shopping/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/shop/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/admin/include/header.jsp", Long.valueOf(1599801082488L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<script src='https://code.jquery.com/jquery-3.3.2.min.js'></script>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/bootstrap/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/bootstrap/css/bootstrap-theme.min.css\">\n");
      out.write("<script src=\"/resources/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("\tfont-family: '맑은 고딕', verdana;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tmargin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul {\n");
      out.write("\tpadding: 0;\n");
      out.write("\tmargin: 0;\n");
      out.write("\tlist-style: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div#root {\n");
      out.write("\twidth: 90%;\n");
      out.write("\tmargin: 0 auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("header#header {\n");
      out.write("\tfont-size: 60px;\n");
      out.write("\tpadding: 20px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("header#header h1 a {\n");
      out.write("\tcolor: #000;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav#nav {\n");
      out.write("\tpadding: 10px;\n");
      out.write("\ttext-align: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav#nav ul li {\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tmargin-left: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("section#container {\n");
      out.write("\tpadding: 20px 0;\n");
      out.write("\tborder-top: 2px solid #eee;\n");
      out.write("\tborder-bottom: 2px solid #eee;\n");
      out.write("}\n");
      out.write("\n");
      out.write("section#container::after {\n");
      out.write("\tcontent: \"\";\n");
      out.write("\tdisplay: block;\n");
      out.write("\tclear: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write("aside {\n");
      out.write("\tfloat: left;\n");
      out.write("\twidth: 200px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div#container_box {\n");
      out.write("\tfloat: right;\n");
      out.write("\twidth: calc(100% - 200px - 20px);\n");
      out.write("}\n");
      out.write("\n");
      out.write("aside ul li {\n");
      out.write("\ttext-align: center;\n");
      out.write("\tmargin-bottom: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("aside ul li a{\n");
      out.write("\tdisplay:block; \n");
      out.write("\twidth:100%;\n");
      out.write("\tpadding: 10px 0;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tmargin-bottom: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("aside ul li a:hover{\n");
      out.write("\tbackground:#eee;\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer#footer {\n");
      out.write("\tbackground: #f9f9f9;\n");
      out.write("\tpadding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer#footer ul li {\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tmargin-right: 10px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"root\">\n");
      out.write("\t<header id=\"header\">\n");
      out.write("\t\t<div id=\"header_box\">\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h1 class=\"title\">\r\n");
      out.write("\t<a href=\"/admin/index\">SHOP Admin</a>\r\n");
      out.write("</h1>\r\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("\t\n");
      out.write("\t<nav id=\"nav\">\n");
      out.write("\t\t<div id=\"nav_box\">\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<ul>\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</ul>");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\t\n");
      out.write("\t<section id=\"container\">\n");
      out.write("\t\t<aside>\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<ul>\r\n");
      out.write("\t<li><a href=\"/admin/goods/register\">상품 등록</a></li>\r\n");
      out.write("\t<li><a href=\"/admin/goods/list\">상품 목록</a></li>\r\n");
      out.write("\t<li><a href=\"/admin/shop/orderList\">주문 목록</a>\r\n");
      out.write("\t<li><a href=\"/admin/shop/allReply\">상품 리뷰</a></li>\r\n");
      out.write("\t<li><a href=\"\">유저 목록</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("\n");
      out.write("\t\t</aside>\n");
      out.write("\t\t<div id=\"container_box\">\n");
      out.write("\t\t\t본문영역\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t\n");
      out.write("\t<footer id=\"footer\">\n");
      out.write("\t\t<div id=\"footer_box\">\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<ul>\r\n");
      out.write("\t<li>사이트 소개</li>\r\n");
      out.write("\t<li>이용약관</li>\r\n");
      out.write("\t<li>SHOP</li>\r\n");
      out.write("</ul>");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/admin/include/nav.jsp(4,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member != null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t<li>\r\n");
          out.write("\t\t<a href=\"/\">일반화면</a>\r\n");
          out.write("\t</li>\r\n");
          out.write("\t<li>\r\n");
          out.write("\t\t<a href=\"/member/signOut\">로그아웃</a>\r\n");
          out.write("\t</li>\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}