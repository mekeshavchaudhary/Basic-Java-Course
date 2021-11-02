package learnjava;


class myTThread extends Thread{
    public myTThread(String name) {
		super(name);
	 }
    
    public void ru() {
   	 while(true) {
   		 System.out.println("you are "+ this.getName());
   	 }
    }
	
}

public class ThreadPriorities_40 {
	public static void main(String[] args) {
		
		myTThread t1 = new myTThread("Keshav");
		myTThread t2 = new myTThread("Keshav");
		myTThread t3 = new myTThread("Keshav");
		myTThread t4 = new myTThread("Keshav");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t4.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		
	}

}
