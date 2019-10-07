import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import cnt.Security.*;

public class Xss_sample3 extends HttpJspBase {

  public static String loadDriver () {
	String bookName = request.getParameter("bookName");  // bookName stores user input
	String vBookName = Security.validate(bookName);      // vBookName is supposed to be the "clean" version on bookName
	
	out.println(vBookName); // print vbookName to the page
  }

}
