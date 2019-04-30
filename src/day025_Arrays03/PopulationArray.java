package day025_Arrays03;

public class PopulationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] population = new int [5];
		 population [0] = 5000;
		 population [1] = 10000;
		 population [2] = 7000;
		 population [3] = 4455;
		 population [4] = 8907;
		 
		 //int [] population = {5000, 10000, 7000, 4455, 8907};
		 
		 System.out.println("City 4 population: "+population [4]);
		 System.out.println("City 3 population: "+population [3]);
		 System.out.println("City 1 population: "+population [1]);
		 System.out.println("City 0 population: "+population [0]);
		 System.out.println("City 2 population: "+population [2]);
		 
		 System.out.println();
		 
		 
		 int idx = 0;
		 System.out.println("City 0 population: "+population [idx]);
		 
		 
		  String str = "abc";
		 System.out.println("City 1 population: "+population [str.length()]);
		 
		 
		 String [] cities = {"Miami", "London", "Tokyo", "Rome", "NYC" };
		 
		 //Population of  Miami is 5000;
		//Population of  London is 10000;
		//Population of  Tokyo is 7000;
		//Population of  Rome is 4455;
		//Population of  NYC is 8907;
		 
		 System.out.println("Population of " + cities [0]+" is "+population[0]);
		 System.out.println("Population of " + cities [1]+" is "+population[1]);
		 System.out.println("Population of " + cities [2]+" is "+population[2]);
		 System.out.println("Population of " + cities [3]+" is "+population[3]);
		 System.out.println("Population of " + cities [4]+" is "+population[4]);
		 
		 
		 
		 
		 
	}

}
