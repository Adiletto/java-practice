package day023_Agenda_Loop_Review;

public class NestedLoop {

	public static void main(String[] args) {

		// outer loop will repeat printing of letter as many times as we want
		// in this case, we are gonna print 3 times
		// so we are repeating inner loop 3 times
		for (int i = 0; i < 5; i++) {
			// write a for loop, that will print letter from a to z.
			
			//i -- it's an index
			//if index id even, print from z to a
			if (i % 2 == 0) {
			for (char letter = 'A'; letter <= 'Z'; letter++) {
				System.out.print(letter);
			}
			//of index is odd (it means 1, 3, 5) print from z to a
			}else {
				for (char letter = 'Z'; letter >= 'A'; letter--) {
					System.out.print(letter);
				}
			}
			System.out.println();
			System.out.println("*********************");
		}
	}

}
