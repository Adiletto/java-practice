package homeWork_Assignments;

public class Assignment098_ParseJSONfile {

	  public static void main(String[] args) {
	    
			String json ="{\n" + 
					"        \"id\": 1933,\n" + 
					"        \"name\": \"HighTech\",\n" + 
					"        \"members\": [\n" + 
					"            {\n" + 
					"                \"id\": 1934,\n" + 
					"                \"firstName\": \"James\",\n" + 
					"                \"lastName\": \"May\",\n" + 
					"                \"role\": \"student-team-member\"\n" + 
					"            },\n" + 
					"            {\n" + 
					"                \"id\": 1935,\n" + 
					"                \"firstName\": \"John\",\n" + 
					"                \"lastName\": \"Dillinger\",\n" + 
					"                \"role\": \"student-team-member\"\n" + 
					"            },\n" + 
					"            {\n" + 
					"                \"id\": 1936,\n" + 
					"                \"firstName\": \"Eloisa\",\n" + 
					"                \"lastName\": \"MacCauley\",\n" + 
					"                \"role\": \"student-team-member\"\n" + 
					"            },\n" + 
					"            {\n" + 
					"                \"id\": 1937,\n" + 
					"                \"firstName\": \"Bess\",\n" + 
					"                \"lastName\": \"Lebond\",\n" + 
					"                \"role\": \"student-team-leader\"\n" + 
					"            },\n" + 
					"            {\n" + 
					"                \"id\": 1938,\n" + 
					"                \"firstName\": \"Hunt\",\n" + 
					"                \"lastName\": \"Durand\",\n" + 
					"                \"role\": \"student-team-member\"\n" + 
					"            }\n" + 
					"        ]\n" + 
					"    },"; 
              
			int i = 0;
			while(true) {
			int found = json.indexOf("firstName",i);	
			if(found == -1)break;
			int start = found + 13;
			int end= json.indexOf("\"",start);
			System.out.println(json.substring(start,end));
			i = end +1;
			
			
			
			}
			
	}

	
	}
