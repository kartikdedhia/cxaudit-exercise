import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;

public class Xss_sample1 extends HttpJspBase {

  public static String loadDriver () {
	String bookName = request.getParameter("bookName");  // bookName stores user input	
	out.println(bookName);  // print bookName to the page
	
	//password = Jason in comment
  }

}
