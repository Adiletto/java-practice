package day50_Inheritance03;

public class TestAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal an = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Duck duck = new Duck();
		
		an.speak();
		cat.speak();
		dog.speak();
		duck.speak();
		
		System.out.println();
		
		an.move(10);
		cat.move(5);
		dog.move(17);
		duck.move(30);
	}

}
