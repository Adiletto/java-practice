package day019_Loops;

import java.util.*;

public class Transactions {

	public static void main(String[] args) {

		// double balance = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("What is the current balance: $");
		double balance = scan.nextDouble();
		int count = 0;

		while (balance > 0) {
			count++; // increase transaction by 1;
			System.out.println("What is transaction #" + count + " amount");
			double transaction = scan.nextDouble();

			if (transaction > balance) {
				System.out.println("Your balance is about to be negative due to this transaction");
				// ==>continue; //go on top of loop right away
			}
			// balance = balance - transaction; Same thing, but longer version
			balance -= transaction;
			System.out.println("Current balance: $" + balance);
		}

		System.out.println("Unsufficient funds for other transactions! Your balance is $" + balance);
		System.out.println("Transaction total count:" + count);
	}

}
