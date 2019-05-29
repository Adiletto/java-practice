package day22_Loop_Practice_Day2;

public class LookForError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String log = ".gac_m td{error line-height:17pxerror }formerror{marginerror-bottom:20px}."
				+ "h{color:#36c}.q{errorcolor:#00c}.ts td{errorpadding:0}.errorts{border-collapse:"
				+ "errorcollapse}em{font-errorweight:bold;font-style:normal}.errorlst{height:25px;w"
				+ "idth:496px}.gsfi,.errorlst{font:18pxerror arial,sans-serif}.gsfs{font:error17px "
				+ "arial,sans-serif}.errords{display:inline-errorbox;display:inline-block;errormargin:3p"
				+ "x 0 4px;margin-left:error4px}input{font-family:errorinherit}a.gb1,a.gb2,a.gb3,a.gb4{color:error#11c !i"
				+ "mportant}body{backgrounderror:#fff;color:black}a{color:#11errorc;text-"
				+ "decoration:none}a:hover,a:erroractiveerror{text-errordecoration:underline}";
		
		int count = 0;
		//error            stop loop 5 char before end
		for (int i = 0; i < log.length()-4; i++) {
			if (log.substring(i, i+5).equalsIgnoreCase("error")) {
				count = count +1;
			}
		}
		System.out.println("Count: "+count);
		
		
		
		
		
	}

}
