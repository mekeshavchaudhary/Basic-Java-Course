package learnjava;

class MyCellphone{
	void call(int num) {
		System.out.println("Calling" + num);
	}
	void Pickcall() {
		System.out.println("Connecting...");
	}
}

interface myNetwork{
	String[] networklist();
	void connectnetwork();
}


interface camera{
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


class MySmartPhone extends MyCellphone implements myNetwork, camera{

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

public class ExampleofInterface_33 {
	public static void main(String[] args) {
		MySmartPhone obj = new MySmartPhone();
		
		obj.recordingvideo();
		String[] ar = obj.networklist();
		for(String item: ar ) {
			System.out.println(item);
		}

		
	}

}
