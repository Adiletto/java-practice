package homeWork_Assignments;

public class Assignment116_UtopianTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		   int totalSize = 0;
		   
		for (int year = 1; year <= 3; year++) {
		     int size = 1;
		     totalSize += 1;
		     System.out.println("year "+year+" - growth 1 cm");
		     System.out.println("tree size: "+totalSize+" cm");
		}
		     for ( int year = 4; year <= 10; year++ ) {
		    	 int size = 2;
		    	 totalSize += 2;
		    	 System.out.println("year "+year+" - growth 2 cm");
			     System.out.println("tree size: "+totalSize+" cm");
		     }
	
		
	}

}
