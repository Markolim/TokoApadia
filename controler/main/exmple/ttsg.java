//import library

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ttsng extends HttpServlet
{
  public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
  {
  	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
  
  }
}
