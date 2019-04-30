package homeWork_Assignments;
import java.util.Scanner;
public class Assignment146_SplitPersonsInfo {

	//class Main {
	  
	  public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    String s = inp.next();
	    person(s) ;
	  }
	  
	   public static void person(String info) 
		{
		
			//your code here
		   String first ="";
		   String last ="";
		   String age = "";
		   
			String [] array = info.split(",");
			first = array[0]; 
			last = array [1];
			age = array [2];
			
			System.out.println("person name: "+first+" last name: "+last+" age: "+age);
		
		}//end person
	  
	}
	
//The method person get a string with this format : "name,last name,age"
//for example: 
//person("jon,doe,30");
//the output is:
//person name: jon last name: doe age: 30
//hint: use the split method to split the string to a string array where there is a "," char
