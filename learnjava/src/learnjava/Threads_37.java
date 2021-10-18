package learnjava;

class Mythreads extends Thread{
	int i=0;
	public void run2() {
		while(i<10) {
			System.out.println("I am 1");
			i++;
		}
	}
	
	
	public void run() {
		System.out.println("I am keshav");
	}
}
class mythread2 extends Thread{
	int i=0;
	public void run() {
		while(i<10) {
			System.out.println("I am 2");
			i++;
		}
	}
}

public class Threads_37 {
	public static void main(String[] args) {
		
		Mythreads obj1 = new Mythreads();
		mythread2 obj2 = new mythread2();
		
		obj1.start();
		obj2.start();
		
	}

}
