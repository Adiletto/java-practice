package day49_Inheritance02;

public class BarnesAndNobles {

	public static void main(String[] args) {
		
		EBook ebook = new EBook();
		ebook.setTitle("\"Introduction to Java\"");
		ebook.setAuthor("W. Savitch");
		ebook.setPages(1016);
		ebook.setPrice(170);
		ebook.setSize(500);
		ebook.setType("Tech Book");
		
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAuthor());
		ebook.readEBook(10);
		ebook.readEBook(621);
		
		
		AudioBook abook = new AudioBook();
		abook.setTitle("\"OCA Preparation\"");
		abook.setAuthor("Jeanne");
		abook.setNarrator("Marufjon");
		abook.listen();
		
		PaperBack pb = new PaperBack();
		pb.setAuthor("Malcolm Gladwell");
		pb.setTitle("Outliers");
		pb.setType("Biography");
		pb.setPrice(20);
		pb.setPages("304");
		System.out.println(pb.toString());
	}
}

