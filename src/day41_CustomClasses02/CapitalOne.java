package day41_CustomClasses02;

public class CapitalOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount acc1 = new BankAccount ();
		acc1.accountHolder = "Bill Gates";
		acc1.accountNumber = 123456789;
		acc1.deposit(250);
		acc1.withdraw(100);
		acc1.showBalance();
		
		
		acc1.charge(50, "wooden spoon");
		acc1.showBalance();
		
	}

}
