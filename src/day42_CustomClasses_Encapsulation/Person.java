package day42_CustomClasses_Encapsulation;

public class Person {

	//declare name and age encapsulated data
	private String name;
	private int age;
	
//public getter and setter methods for name
	//read only
	public String getName() {
	return name; 
		}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//write only - void
	public void setName(String name) {
		this.name = name;
		
	}
	
	}
