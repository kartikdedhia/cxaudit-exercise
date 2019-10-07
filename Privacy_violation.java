

public class Privacy_violation {

	public static void main(String[] args)
	{
		String creditNumber = Person.getCreditNo();  // get credit number from DB
		System.out.println(creditNumber);      // privacy violation happens here!
		//Person.log(creditNumber);

		//password = Jason in comment
		
		String cname = Person.getClientName(); // get Client Name
		System.out.println(cname); // privacy violation here! (for a private bank)
		
		String ChineseFullName = Person.getFullName();
		String ID = Person.getID();
	}
	
  

}
