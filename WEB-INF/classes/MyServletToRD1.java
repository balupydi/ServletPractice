import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyServletToRD1 extends HttpServlet
{
 
 public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
 {
   String str="";
   response.setContentType("text/html");
   PrintWriter out = response.getWriter();
   String fn = request.getParameter("fn");
   String ln = request.getParameter("ln");
   String ge = request.getParameter("gender");
   String dp = request.getParameter("select1");
   String Un = request.getParameter("c1"); 
   if(!(Un=="null"))
   {
	str=str+Un;
   }
   String Jv = request.getParameter("c2");
   if(!(Jv=="null"))
   {
	str=str+Jv;
   }
   String dn = request.getParameter("c3");
   if(!(dn=="null"))
   {
	str=str+dn;
   }
   String ot = request.getParameter("c4"); 
   if(!(ot=="null"))
   {
	str=str+ot;
   }
   String ta = request.getParameter("comment");
   String htmlRespone = "<html><body background=\"servlet2.jpg\"><div align=\"center\">";
   htmlRespone += "<h2>firs name is: " + fn + "<br/>";      
   htmlRespone += "Last name is: " + ln + "<br/>";
   htmlRespone += "Gender is: " + ge + "<br/>";
   htmlRespone += "Department belongs to: " + dp + "<br/>";
   if(!(str=="nullnullnullnull"))
   {
	  htmlRespone += "Specialist in: " + str + "<br/>";
   }
   else
   {
	  htmlRespone += "Specialist in: Nothing <br/>";
   }
    htmlRespone += "Abourt himself: " + ta + "</h2>";    
   htmlRespone += "<table><tr><td><button onclick=\"window.history.back()\">Go Back</button></td><td><input type=\"button\" value=\"close\" onclick=\"closeWin();\"></td></tr></table></div></body></html>";
   htmlRespone += "<script language=\"javascript\" type=\"text/javascript\">function closeWin(){ window.close();}</script>";
         
   out.println(htmlRespone);

   }
}



