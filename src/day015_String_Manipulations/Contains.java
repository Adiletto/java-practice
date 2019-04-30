package day015_String_Manipulations;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email = "test@gmail.com";
		System.out.println(email.contains("@"));
		
		// check if apples in the shopping list
		//true ==> Yes, apples in the list
		// false ==>Lets add apples now
		
		String list = "potatoes, apples, tomatoes, eggs, milk, meat";
		
		if (list.contains("apples")) {
			System.out.println("Yes, apples in the list");
		}else {
			System.out.println("Lets add apples now");
		}
	
	
		boolean hasEggs = list.contains("eggs");
		System.out.println("Contains eggs: "+hasEggs);
		
		boolean hasCucumbers = list.contains("cucumbers");
		System.out.println("Contains cucumber: "+hasCucumbers);
		
		boolean hasCucumbers1 = list.toLowerCase().contains("cucumbers");
		
		
		System.out.println();// just to have empty space
		
		email = "name@yahoo.com";
		
		if (email.contains("@yahoo")) {
			System.out.println("it is Yahoo email");
		} else if (email.contains("@gmail")) {
			System.out.println("it is Gmail email");
		}else if (email.contains("@hotmail")) {
			System.out.println("it is Hotmail email");
		}
		
		
		
		String etsyTitle = "Wooden spoon | Etsy";
		if (etsyTitle.contains(" | ")) {
			System.out.println("Pipe is there as expected");
		} else {
			System.out.println("Pipe is not detected");
		}
		
		
		System.out.println(); // just to have empty space
		
		
		String name = "Adilet";
		
		if (name.contains ("i") || (name.contains("t"))) {
			System.out.println("Yes, it does contain letters 'i' and 't'");
		} else {
			System.out.println("No, 'i' and 't' letters is not detected");
		}
		
	}

}
