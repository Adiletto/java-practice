package homeWork_Assignments;
import java.util.*;
public class Assignment134_Chess {

	//public class Main {
	  public static void main(String[] args) {
	    String[][] chessBoard = new String[8][8];
	    //WRITE YOUR CODE HERE
	    for (int i = 0; i < chessBoard.length; i++) {
	      for (int j = 0; j <= i; j++) {
	        chessBoard [i][0] = (i+1)+"a";
	        chessBoard [i][1] = (i+1)+"b";
	        chessBoard [i][2] = (i+1)+"c";
	        chessBoard [i][3] = (i+1)+"d";
	        chessBoard [i][4] = (i+1)+"e";
	        chessBoard [i][5] = (i+1)+"f";
	        chessBoard [i][6] = (i+1)+"g";
	        chessBoard [i][7] = (i+1)+"h";
	        
	        
	      }
	    }
	    //DO NOT CHANGE
	    System.out.println(Arrays.deepToString(chessBoard));
	  }
	}

