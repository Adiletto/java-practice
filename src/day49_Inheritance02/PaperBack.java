package day49_Inheritance02;

public class PaperBack extends Book{

	private String pages;
	
	@Override
	public String toString() {
		//return "PaperBack [title | author | price | type | pages=" + pages + "]";
		return getTitle() + " | "+getAuthor() + " | " + getPrice() + " | " + pages;
		
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}
	
	
}
