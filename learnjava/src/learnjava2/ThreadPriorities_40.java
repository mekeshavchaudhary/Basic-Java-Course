package learnjava2;

class mythread extends Thread{
    public mythread(String name) {
		super(name);
	 }
    
    public void run() {
   	 while(true) {
   		 System.out.println("you are "+ this.getName());
   	 }
    }
	
}

public class ThreadPriorities_40 {
	public static void main(String[] args) {
		
		mythread t1 = new mythread("Keshav");
		mythread t2 = new mythread("Aman");
		mythread t3 = new mythread("Mohit");
		mythread t4 = new mythread("Aradhaya");
		
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