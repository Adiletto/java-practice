package day50_Inheritance03;

public class AppsFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IphoneApp iApp = new IphoneApp();
		IphoneApp iApp2 = new IphoneApp("Uber");

		AndroidApp andApp = new AndroidApp();
		AndroidApp andApp2 = new AndroidApp("Lyft");

		System.out.println(iApp.getName());
		System.out.println(iApp2.getName());

		System.out.println(andApp.getName());
		System.out.println(andApp2.getName());
		
		App.count = 33;
		System.out.println(IphoneApp.count);
		AndroidApp.count = 100;
		
		System.out.println("App.count: " + App.count);
		System.out.println("IphoneApp.count: " + IphoneApp.count);
		System.out.println("AndroidApp.count: " + AndroidApp.count);
		
		App.build("\"Swift\"");
		IphoneApp.build("\"Objective C\"");
		AndroidApp.build("\"Java\"");
		andApp2.build("\"JS\"");

	
	}
}
