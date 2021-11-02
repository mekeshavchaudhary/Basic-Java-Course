package learnjava;

class Myrunnable implements Runnable{
	@Override
	public void run() {
		int i=0;
		while(i<100) {
		System.out.println("i am 1");
		}
	}
}

class Myrunnable2 implements Runnable{
	@Override
	public void run() {
		int i=0;
		while(i<100) {
		System.out.println("i am 2");
		}
	}
}

public class MYRunnable_38 {
	public static void main(String[] args) {
		
		Myrunnable obj = new Myrunnable();
		Thread t1 = new Thread(obj);
		Myrunnable2 obj2 = new Myrunnable2();
		Thread t2 = new Thread(obj2);
		
		
		t1.start();
		t2.start();
		
	}

}
