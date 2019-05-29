package day51_Inheritance04;

public class Yoga extends Exercise{
	public int perform(int minutes) {
		System.out.println("Yoga");
		return minutes * 5;
	}
}
