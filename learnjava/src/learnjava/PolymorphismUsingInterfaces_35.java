package learnjava;

//code copied from file33...
class MyCellphone2{
	void call(int num) {
		System.out.println("Calling" + num);
	}
	void Pickcall() {
		System.out.println("Connecting...");
	}
}

interface myNetwork2{
	String[] networklist();
	void connectnetwork();
}


interface camera2{
	void takepic();
	void takeselfie();
	
	//we can create a private method in interface which is only accessible for the interface only 
	private void greet() {
		System.out.println("Good morning");
	}
	
	//We can create a default method in any interface and also we can over write this method in implimenting class
	default void recordingvideo() {
		//here we are using greet as it is not accessible from other class
		greet();
		System.out.println("Recording video....");
	}
}


class MySmartPhone2 extends MyCellphone2 implements myNetwork2, camera2{

	@Override
	public void takepic() {
		System.out.println("Taking Picture...");
		
	}

	@Override
	public void takeselfie() {
		System.out.println("Taking selfie....");
		
	}

	@Override
	public String[] networklist() {
		System.out.println("Getting Network list");
		String[] networklist = {"Airtel","Idea", "voda"};
		return networklist;
	}

	@Override
	public void connectnetwork() {
		System.out.println("Connecting to network....");
		
	}
//	public void recordingvideo() {
//		System.out.println("Recording video in implimenting class");
//	}
	
}


public class PolymorphismUsingInterfaces_35 {
	public static void main(String[] args) {
		camera2 obj = new MySmartPhone2();
		//this can only access methods of interface camera
		
//		obj.connectnetwrok();   ----throws error.
		
		
	}

}
