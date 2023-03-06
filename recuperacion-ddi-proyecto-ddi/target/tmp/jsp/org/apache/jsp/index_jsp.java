/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/11.0.12
 * Generated at: 2023-03-06 17:36:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\"\n");
      out.write("	integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\n");
      out.write("	crossorigin=\"anonymous\">\n");
      out.write("<title>Index</title>\n");
      out.write("</head>\n");
      out.write("<body class=\"container\" style=\"background-color: #2C3639;\">\n");
      out.write("\n");
      out.write("	\n");
      out.write("	<br />\n");
      out.write("	<a href=\"/listEquipos\">Equipos PRUEBA</a>\n");
      out.write("	<br />\n");
      out.write("	<br />\n");
      out.write("\n");
      out.write("	<div class=\"card-deck\">\n");
      out.write("		<div class=\"card text-white border \" style=\"background-color:#3F4E4F; border-color: #A27B5C\">\n");
      out.write("			<div class=\"card-body border border-info\">\n");
      out.write("				<h5 class=\"card-header mb-3\" style=\"background-color: #262B30\">EQUIPO 1</h5>\n");
      out.write("				<h5 class=\"card-title mb-3\">ODOO</h5>\n");
      out.write("				<p class=\"card-text\">PERSONA 1<br/>PERSONA 2<br/>PERSONA 3<br/>PERSONA 4</p>\n");
      out.write("				<p class=\"card-text\">\n");
      out.write("					<small class=\"text-muted\">Last updated 3 mins ago</small>\n");
      out.write("				</p>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("<!-- 		Las dos últimas tarjetas son de prueba. Para generar las otras tarjetas -->\n");
      out.write("<!-- 		se hará con el forEach de listEquipos.jsp -->\n");
      out.write("		<div class=\"card\">\n");
      out.write("			<div class=\"card-body\">\n");
      out.write("				<h5 class=\"card-title\">Card title</h5>\n");
      out.write("				<p class=\"card-text\">This card has supporting text below as a\n");
      out.write("					natural lead-in to additional content.</p>\n");
      out.write("				<p class=\"card-text\">\n");
      out.write("					<small class=\"text-muted\">Last updated 3 mins ago</small>\n");
      out.write("				</p>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"card\">\n");
      out.write("			<div class=\"card-body\">\n");
      out.write("				<h5 class=\"card-title\">Card title</h5>\n");
      out.write("				<p class=\"card-text\">This is a wider card with supporting text\n");
      out.write("					below as a natural lead-in to additional content. This card has\n");
      out.write("					even longer content than the first to show that equal height\n");
      out.write("					action.</p>\n");
      out.write("				<p class=\"card-text\">\n");
      out.write("					<small class=\"text-muted\">Last updated 3 mins ago</small>\n");
      out.write("				</p>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
