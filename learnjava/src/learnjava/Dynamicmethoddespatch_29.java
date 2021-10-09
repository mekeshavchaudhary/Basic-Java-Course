package learnjava;

class phone{
	public void welcome() {
		System.out.println("Wlcome User");
	}
	
	public void on() {
		System.out.println("Turning on...");
	}
}

class smartphone extends phone{
	public void welcome2() {
		System.out.println("Welcome2 User");
	}
	public void on() {
		System.out.println("Turning on..");
	}
}

public class Dynamicmethoddespatch_29 {
	public static void main(String[] args) {
		//phone objPhone = new phone();
		phone obj = new smartphone();
		
		obj.on();
		//objPhone.on();
		
	}
	
}
