import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyServletToRD extends HttpServlet
{
 public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
 {
   response.setContentType("text/html");
   PrintWriter out = response.getWriter();
   String username = request.getParameter("login");
   String password = request.getParameter("password");
   String htmlRespone = "<html><body background=\"servlet2.jpg\"><div align=\"center\">";
   htmlRespone += "<h2>Your username is: " + username + "<br/>";      
   htmlRespone += "Your password is: " + password + "</h2>";    
   htmlRespone += "<table><tr><td><button onclick=\"window.history.back()\">Go Back</button></td><td><input type=\"button\" value=\"close\" onclick=\"closeWin();\"></td></tr></table></div></body></html>";
   htmlRespone += "<script language=\"javascript\" type=\"text/javascript\">function closeWin(){ window.close();}</script>";
         
   out.println(htmlRespone);
 }
}



