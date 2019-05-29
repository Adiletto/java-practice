package day15_String_Manipulations;

import java.util.Scanner;

public class PseudoCode {

	public static void main(String[] args) {
	

		String emoji = ":)";
		Scanner scan = new Scanner (System.in);
		
		// ==, != CHECK IF IT DOES NOT EQUAL 2 CHARS
		
	if (emoji.length() != 2) {
		System.out.println("Invalid emoji");
		return; // stop execution
	}
		// if code reaches this point, then emoji is 2 chars
	// get first and second chars and assign to variables
	
	char first = emoji.charAt(0);
	char second = emoji.charAt(1);
	
	if (first == ':') {
		if (second == ')') {
			System.out.println("smile");
		}else if (second == '(') {
				System.out.println("sad"); //:(
			}else if (second == '/') {
				System.out.println("upset");
			} else if (second == 'p') {
				System.out.println("playful");
			}else {
				System.out.println("Unknown emoji");
			}
		
			
	}else if (first == ';') {
		
	}else if (first == '(') {
		
	}else if (first == '(') {
		
	}else if (first == ')') {
		
	} else {
		System.out.println("Invalid emoji");
	}
	
	
	
	}
}
