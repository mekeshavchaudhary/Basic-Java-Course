package learnjava;


abstract class Base{
	public Base() {
		System.out.println("I am from base class");
	}
	void print() {
		System.out.println("I am printing..");
	}
	abstract public void greet();
	abstract public void greet2();
}

class derived extends Base{
	@Override
	public void greet() {
		System.out.println("Good morning");
	}
	
	public void greet2() {
		System.out.println("Good afternoon");
	}
}

class derived2 extends Base{

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void greet2() {
		// TODO Auto-generated method stub
		
	}
	
}

abstract class derived3 extends Base{
	public void meth2() {
		System.out.println("I am from derived3");
	}
}

public class AbstractClass_31 {
	public static void main(String[] args) {
		//lets try to create object
//		Base b =new Base();             ----throw error
		derived  d  = new derived();
		derived2 d2 = new derived2();
//		derived3 d3 = new derived3();   ----throw error	
		
	}

}
