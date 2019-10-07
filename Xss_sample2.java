import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import org.owasp.esapi.ESAPI;

public class Xss_sample2 extends HttpJspBase {

  public static String loadDriver () {
	String bookName = request.getParameter("bookName");  // bookName stores user input
	String vBookName = ESAPI.encoder().encodeForHTML(bookName); // Use ESAPI to encode string
	
	out.println(vBookName);  // print bookName to the page
}
