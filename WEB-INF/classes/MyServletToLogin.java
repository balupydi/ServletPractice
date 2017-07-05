import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyServletToLogin extends HttpServlet
{
 public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
 {
   response.setContentType("text/html");
   PrintWriter out = response.getWriter();
   out.println("<html>");
   out.println("<head><title>Login Form</title></head>");
   out.println("<body background=\"servlet1.jpg\">");
   out.println("<div align=\"center\">");
   out.println("<h1>Login to Bala App</h1>");
   out.println("<form name=\"loginForm\" action=\"MyServletToRD\" method=\"get\">");
   out.println("<table>");
   out.println("<tr><p><input type=\"text\" name=\"login\" value=\"\" placeholder=\"Username or Email\"></p></tr>");
   out.println("<tr><p><input type=\"password\" name=\"password\" value=\"\" placeholder=\"Password\"></p></tr>");
   out.println("<tr><p class=\"submit\"><input type=\"submit\" name=\"commit\" value=\"Login\"></p></tr>");
   out.println("</table></div></form>");
   out.println("</body></html>");  
 }
}
