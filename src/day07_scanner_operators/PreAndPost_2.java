package day07_scanner_operators;

public class PreAndPost_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int messages = 10;
		messages++;      //11
		++messages;      //12
		System.out.println("Messages: " + messages);
		
		int readMessages = --messages;
		System.out.println("ReadMessages: " + readMessages);
		System.out.println("Messages: " + messages);
		
		
		int unreadMessages = readMessages--;
		System.out.println("unreadMessages: " + unreadMessages);  //11
		System.out.println("readMessages: " + readMessages); //10
		
		int total = unreadMessages++ + readMessages--; //11(unread) - 10 (read)
		
		System.out.println("unreadMessages: " + unreadMessages);
		System.out.println("readMessages: " + readMessages);
		System.out.println("total: " + total);
		
		int count = 20;
		int count2 = 10;
		        //30        //21 + 9
		int totalCount = ++count + --count2; 
		System.out.println("count: " + count); //21
		System.out.println("count2: " + count2); //9
		System.out.println("totalCount: " + totalCount); //30
		
		
		        //44     //21 + (+1) + 23
		int myCount = count++ + ++count;
		
		System.out.println("count: " + count);
		System.out.println("myCount: " + myCount);
		
		
		
	}

}
