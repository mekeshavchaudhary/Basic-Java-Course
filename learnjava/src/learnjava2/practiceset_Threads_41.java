package learnjava2;
class class1 extends Thread{
	public void run() {
		while(true) {
			System.out.println("Good Morning");
		}
	}
}

class class2 extends Thread{
	public void run() {
		while(true) {
			try {
			Thread.sleep(200);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("Welcome");
		}
	}
}

public class practiceset_Threads_41 {
	public static void main(String[] args) {
		
		class1 obj1 = new class1();
		class2 obj2 = new class2();
		
		obj1.start();
		obj2.start();
		
	}

}
