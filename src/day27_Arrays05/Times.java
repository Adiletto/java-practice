package day27_Arrays05;

public class Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declare 2 int arrays that can hold hour and min;
		int[] time1 = new int[2];// 0,0 by default
		int[] time2 = new int[2];// 0,0 by default

		// System.out.println(time1[0]); //0

		time1[0] = 19;
		time1[1] = 10;

		time2[0] = 11;
		time2[1] = 18;

		// Before comparing, check if both arrays have
		// valid hour/minute;

		if (time1[0] < 0 || time1[1] > 23) {
			System.out.println("Time1 has invalid hour");
			return;
		}

		if (time1[1] < 0 || time1[1] > 59) {
			System.out.println("Time1 has invalid minute");
			return;
		}

		if (time2[0] < 0 || time2[1] > 23) {
			System.out.println("Time2 has invalid hour");
			return;
		}

		if (time2[1] < 0 || time2[1] > 59) {
			System.out.println("Time2 has invalid minute");
			return;
		}
		
		System.out.println("*****COMPARE ARRAYS*****");
		
		//COMPARE ARRAYS and tell which one is earlier
		
		if (time1[0] < time2[0]) {
			System.out.println("Time1 is earlier");
		}else if (time2[0] < time1[0]) {
			System.out.println("Time2 is earlier");
		}else { //hours are equal. check minutes
			if (time1[1] < time2[1]) {
				System.out.println("Time1 is earlier");
			} else if (time2[1] < time1[1]) {
				System.out.println("Time2 is earlier");
			}else { //minutes are equal
				System.out.println("Same time!");
			}
		}
		
	}

}
