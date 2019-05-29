package day46_Static_Keyword;

public class Customer {

	private String name;
	private String email;
	
	static int count; //shared by everyone/ all object
					  //one central copy of this variable
	
	public Customer() {
		name = "undefined";
		this.email = "undefined";
		count++;
		
	}
	
	public Customer(String name, String email) {
		
		this.name = name;
		this.email = email;
		count++;
	}

	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
