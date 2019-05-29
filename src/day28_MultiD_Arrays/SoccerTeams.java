package day28_MultiD_Arrays;

import java.util.Arrays;

public class SoccerTeams {

	public static void main(String[] args) {
		
		// declare multiD array with 
		
		String [] [] teams = new String [2] [6];
		teams [0] [0] = "Mirlan Murzaev";
		teams [0] [1] = "Vitalii Luks";
		teams [0] [2] = "Zemlyanuhin";
		teams [0] [3] = "Valerii Kichin";
		teams [0] [4] = "Captain Azamat Baimatov";
		teams [0] [5] = "Tursunali Rustamov";
		
		
		teams [1] [0] = "Messi";
		teams [1] [1] = "Ronaldo";
		teams [1] [2] = "Salah";
		teams [1] [3] = "Ronaldinho";
		teams [1] [4] = "Murzaev";
		teams [1] [5] = "Arshavin";
		
		System.out.println("Forward of the first team:");
		System.out.println(teams [0][0]);
		
		System.out.println(teams [0][5]); //Murodil
		System.out.println(teams [1][5]); //Arshavin
		
		//print how many rows/teams/arrays
		
		System.out.println("Number of rows: "+teams.length);
		System.out.println("Number of player in Kyrgyz Team: "+ teams[0].length);
		System.out.println("Number of player in Dream Team: "+ teams[1].length);
		
		System.out.println(Arrays.deepToString(teams));
		
		System.out.println();
		System.out.println("****** MULTI-D ARRAYS with INTegers ******");
		
		
		int nums [][] = new int [3][4];
		
		nums [0] [0] = 01111;
		nums [0] [1] = 01112;
		nums [0] [2] = 01113;
		nums [0] [3] = 01114;
		
		nums [1] [0] = 01115;
		nums [1] [1] = 01116;
		nums [1] [2] = 01117;
		nums [1] [3] = 11118;
		
		nums [2] [0] = 21119;
		nums [2] [1] = 01120;
		nums [2] [2] = 01121;
		nums [2] [3] = 01122;
		
		//System.out.println("Zip code city1 in VA: "+nums[0][1]);
		System.out.println(Arrays.deepToString(nums));
		
		System.out.println(Arrays.toString(nums[0]));
		
		int [] [] scores = {{3, 5, 10}, {6,4,2,12}};
		
		System.out.println("Days played/Number of arrays: " + scores.length);
		System.out.println("Number of values in Day 1: " + scores[0].length);
		System.out.println("Number of values in Day 2: " +scores[1].length);
		
		int [] []values = new int [4][];
		values [0] = new int [] {12, 345, 1};
		values [1] = new int [] {712, 23345, 1231, 32, 456, 123, 10, 67, 1,45};
		
		values [2] = new int [2];
		values [2][0]=55;
		values [2][1]=90;
		
		values[3] = new int [] {5, 23, 1, 5, 7};
		
		System.out.println(Arrays.deepToString(values));
		
	}
	
}
