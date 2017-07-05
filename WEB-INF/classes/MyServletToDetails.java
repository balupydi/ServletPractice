import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyServletToDetails extends HttpServlet
{
 public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
 {
   response.setContentType("text/html");
   PrintWriter out = response.getWriter();
   out.println("<html>");
   out.println("<head><title>Login Form</title></head>");
   out.println("<body background=\"servlet1.jpg\">");
   out.println("<div align=\"center\">");
   out.println("<h1>Welcome to Bala App</h1>");
   out.println("<form name=\"loginForm\" action=\"MyServletToRD1\" method=\"get\">");

   out.println("<table>");

   out.println("<tr><td><label for=\"fs\">Enter First Name</label></td><td><input type=\"text\" name=\"fn\" value=\"\" placeholder=\"First Name\"></td><td><label for=\"ln\">Enter Last Name</label></td><td><input type=\"text\" name=\"ln\" value=\"\" placeholder=\"Last Name\"></td></tr>");

   out.println("<tr><td><label for=\"male\">Male</label></td><td><input type=\"radio\" name=\"gender\" id=\"Male\" value=\"Male\"></td><td><label for=\"female\">Female</label></td><td><input type=\"radio\" name=\"gender\" id=\"Female\" value=\"Female\"></td></tr>");

   out.println("<tr><td><label for=\"tec\">Project Belongs to: </label></td><td><select name=\"select1\"><option value=\"DPR\">ITEC/PRD/DPR</option><option value=\"RRF\">ITEC/PRD/RRF</option><option value=\"CTT\">ITEC/PRD/CTT</option><option value=\"other\">Other</option></select></td></tr>");

   out.println("<tr><td><label for=\"cbu\">Unix</label></td><td><input type=\"checkbox\" name=\"c1\" value=\"Unix\"></td><td><label for=\"cbj\">Java</label></td><td><input type=\"checkbox\" name=\"c2\" value=\"Java\"></td><td><label for=\"cbn\">DOT Net</label></td><td><input type=\"checkbox\" name=\"c3\" value=\".Net\"></td><td><label for=\"cbo\">Others</label></td><td><input type=\"checkbox\" name=\"c4\" value=\"Others\"></td></tr>");

   out.println("<tr><td><label for=\"About\">Enter About yourself</label></td><td><textarea name=\"comment\">Enter text here...</textarea></td></tr>");

   out.println("<tr><td align=\"center\"><input type=\"submit\" name=\"commit\" value=\"SUBMIT\"></td></tr>");

   out.println("</table></div></form>");
   
   out.println("</body></html>");  
 }
}
