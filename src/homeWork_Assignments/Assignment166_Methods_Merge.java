package homeWork_Assignments;

public class Assignment166_Methods_Merge {
	//class Main {
		  public static String mergeStrings(String one, String two) {
		    
			   String fin = "";
			    String urmat = "";
			    if (one.length() == two.length()) {
			      for (int i = 0; i < one.length(); i++) {
			        fin += one.charAt(i) +""+ two.charAt(i);
			      }
			    
			    }else if (one.length() > two.length()) {
			      
			      String bratan = one.substring(0, two.length());
			      String bratan2 = one.substring(two.length());
			      for (int i =0; i< bratan.length(); i++) {
			        urmat+=one.charAt(i)+""+two.charAt(i);
			        fin = urmat + bratan2;
			      }
			    }else if (one.length() < two.length()) {
			      
			      String eje = two.substring(0, one.length());
			      String eje2 = two.substring(one.length());
			      for (int i =0; i< eje.length(); i++) {
			        urmat+= two.charAt(i)+""+one.charAt(i);
			        fin = urmat+eje2;
			      }
			    }
			    
			    return fin;
			  }
			}