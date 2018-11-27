package bankAccount;

public class Account {

	private String name;   // Instance variable 
	
	//
	public void setName(String name) 
	{
		this.name = name;
		
	}
	
	// method to retrieve the name from the object
	public String getName() 
	{
		return name;    //return name of the caller 
	}
	
}
