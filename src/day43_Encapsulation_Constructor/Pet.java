package day43_Encapsulation_Constructor;

public class Pet {
	
	private String type;
	private String name;
	
	public Pet (String type, String name) {
		this.type = type;
		this.name = name;
		
	}
	
	public Pet() {
		System.out.println("No - args constructor");
	}
	
	public void speak () {
		switch (type.toLowerCase()) {
		case "cat":
			System.out.println("Myauu");
			break;
		case "dog":
			System.out.println("gaf-gaf");
			break;
		case "bird":
			System.out.println("chik-chirik");
			break;
		case "sheep":
			System.out.println("bha-aaa");
			break;
		case "goat":
			System.out.println("mha-aaa");
			break;
		case "rooster":
			System.out.println("ku-ka-re-kuu");
			break;
			default: 
				System.out.println("...");
		}
	}
	
	
	@Override
	public String toString() {
		return "Pet [type=" + type + ", name=" + name + "]";
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
