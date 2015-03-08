package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/pages/../css/style.css");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Devinder's Code</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("@CHARSET \"ISO-8859-1\";\r\n");
      out.write("\r\n");
      out.write("#good {\r\n");
      out.write("background-color: green;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".emphasis{color:red;}\r\n");
      out.write("\r\n");
      out.write("form { display: block; margin: 20px auto; background: #eee; border-radius: 10px; padding: 15px ;}\r\n");
      out.write("\r\n");
      out.write("#progress { position:relative; width:400px; border: 1px solid #ddd; padding: 1px; border-radius: 3px; }\r\n");
      out.write("\r\n");
      out.write("#bar { background-color: #B4F5B4; width:0%; height:20px; border-radius: 3px; }\r\n");
      out.write("\r\n");
      out.write("#percent { position:absolute; display:inline-block; top:3px; left:48%; }");
      out.write("\r\n");
      out.write("\r\n");
      out.write("ul li{color:green;}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<h1>Maven + Spring MVC Web Project Example</h1>\r\n");
      out.write(" <ul>\r\n");
      out.write("  <li>\r\n");
      out.write("  Message : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write(" \r\n");
      out.write("  </li>\r\n");
      out.write("<li>Saggu : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</li>\r\n");
      out.write("</ul>\r\n");
      out.write("<h1>The url ----> ");
      out.print(request.getContextPath( ));
      out.write("</h1>\r\n");
      out.write("<div id=\"good\"></div>\r\n");
      out.write("<button type=\"button\" onClick=\"show()\">Click Me!</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- <form id=\"myForm\" action=\"upload.php\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("     <input type=\"file\" size=\"60\" name=\"myfile\">\r\n");
      out.write("     <input type=\"submit\" value=\"Ajax File Upload\">\r\n");
      out.write(" </form>\r\n");
      out.write(" \r\n");
      out.write(" <div id=\"progress\">\r\n");
      out.write("        <div id=\"bar\"></div>\r\n");
      out.write("        <div id=\"percent\">0%</div >\r\n");
      out.write("</div>\r\n");
      out.write("<br/>\r\n");
      out.write(" \r\n");
      out.write("<div id=\"message\"></div> -->\r\n");
      out.write("\r\n");
      out.write("<img style=\"display:none\" id=\"loader\" src=\"loader.gif\" alt=\"Loading....\" title=\"Loading....\" />\r\n");
      out.write("<!-- simple file uploading form -->\r\n");
      out.write("<form id=\"form\" action=\"#\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("  <input id=\"uploadImage\" type=\"file\" accept=\"image/*\" name=\"image\" />\r\n");
      out.write("  <input id=\"button\" type=\"submit\" value=\"Upload\">\r\n");
      out.write("</form>\r\n");
      out.write("<!-- preview action or error msgs -->\r\n");
      out.write("<div id=\"preview\" style=\"display:none\"></div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.3.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"http://malsup.github.com/jquery.form.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("(function(){\r\n");
      out.write("$(\"#good\").html(\"This is Hello World by JQuery\");\r\n");
      out.write("$('ul li').addClass('emphasis');\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var f = $('form');\r\n");
      out.write("var l = $('#loader'); // loder.gif image\r\n");
      out.write("var b = $('#button'); // upload button\r\n");
      out.write("var p = $('#preview'); // preview area\r\n");
      out.write("\r\n");
      out.write("b.click(function(){\r\n");
      out.write("  // implement with ajaxForm Plugin\r\n");
      out.write("  f.ajaxForm({\r\n");
      out.write("    beforeSend: function(){\r\n");
      out.write("      l.show();\r\n");
      out.write("      b.attr('disabled', 'disabled');\r\n");
      out.write("      p.fadeOut();\r\n");
      out.write("    },\r\n");
      out.write("    success: function(e){\r\n");
      out.write("      l.hide();\r\n");
      out.write("      f.resetForm();\r\n");
      out.write("      b.removeAttr('disabled');\r\n");
      out.write("      p.html(e).fadeIn();\r\n");
      out.write("    },\r\n");
      out.write("    error: function(e){\r\n");
      out.write("      b.removeAttr('disabled');\r\n");
      out.write("      p.html(e).fadeIn();\r\n");
      out.write("    }\r\n");
      out.write("  });\r\n");
      out.write(" });\r\n");
      out.write("})();\r\n");
      out.write("\r\n");
      out.write("function show()\r\n");
      out.write("{ \r\n");
      out.write("\tvar helloToSend = {\r\n");
      out.write("\t\t\ta:\"saggu\",\r\n");
      out.write("\t\t\tb:\"heyboy\",\r\n");
      out.write("\t\t\tc:\"dullboy\"}; \r\n");
      out.write("\t/* var hello={\r\n");
      out.write("\t\t\ta:\"goodbye\",\r\n");
      out.write("\t\t\tb:\"heyboy\",\r\n");
      out.write("\t\t\tc:\"dullboy\"};\r\n");
      out.write("\t\r\n");
      out.write("\t;\r\n");
      out.write("\t *///var hello={d:JSON.stringify(helloToSend)};\r\n");
      out.write("\t\r\n");
      out.write("\t//var arrString=JSON.stringify(arr);\r\n");
      out.write("\t//var hello=arrString;\r\n");
      out.write("\t\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("    url: \"http://localhost:8080");
      out.print(request.getContextPath( ));
      out.write("/ajax\",\r\n");
      out.write("    type: \"GET\",\r\n");
      out.write("    data:{hello:JSON.stringify(helloToSend)},  \r\n");
      out.write("    dataType:\"text\",  //gives what type of data want from the server\r\n");
      out.write("    success: function (html) {\r\n");
      out.write("    \talert(\"html = \"+html);\r\n");
      out.write("    },\r\n");
      out.write("    error: function (error) {\r\n");
      out.write("       alert('error == ' + eval(error)+\"   \" + \"hello\");\r\n");
      out.write("    }\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
