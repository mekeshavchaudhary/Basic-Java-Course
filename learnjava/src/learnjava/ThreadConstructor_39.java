package learnjava;

class myThread extends Thread{
	public myThread(String name) {
		super(name);
		System.out.println(name);
	}
	
	public void run() {
		
		int i=0;
		while(i<10) {
			System.out.println("I am 1");
			i++;
		}
	}
	
}

public class ThreadConstructor_39 {
	public static void main(String[] args) {
		myThread obj = new myThread("Keshav");
		myThread obj2 = new myThread("Vikrant");
		obj.start();
		
		System.out.println("The id of my thread is " +   obj.getId());
		System.out.println("The name of my thread is " + obj.getName());
		System.out.println("The id of my thread is " +   obj2.getId());
		System.out.println("The name of my thread is " + obj2.getName());
	}

}
