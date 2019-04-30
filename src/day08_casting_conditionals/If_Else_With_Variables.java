package day08_casting_conditionals;

	public class If_Else_With_Variables {
		public static void main(String[] args) {
	
			int temperature = 45;
			if(temperature >= 65) {
				System.out.println("It is a nice Day! Let's code java");
			}else {
				System.out.println("Stay home and code java");
			}
			
			// 2 int variables, teamAScore, teamBScore;
			// put a condition. check if teamA won. "Team A won."
			    //"Team A won".
			    //Go to Team A!
			//else "team b won or it was a draw
			    //Go Teams!
			
			int teamAScore = 15;
			int teamBScore = 16;
			
			if (teamAScore > teamBScore) {
				System.out.println("Team A won!");
				System.out.println("Go Team A");
			}else {
				System.out.println("Team B won or it was a draw");
			    System.out.println("Go Team!");
			}
}
	
}
