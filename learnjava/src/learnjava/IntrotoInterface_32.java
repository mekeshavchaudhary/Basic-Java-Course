package learnjava;

interface Car{
	void Break(int decrement);
	void speeUp(int increment);
}

interface Horn{
	void blowHorn();
	void clearWindow();
}

class Audi implements Car,Horn{

	@Override
	public void Break(int decrement) {
		System.out.println("Speed Decreasing");
		
	}

	@Override
	public void speeUp(int increment) {
		System.out.println("Speed Increasing");
	}

	@Override
	public void blowHorn() {
		System.out.println("Blowing Horn");
		
	}

	@Override
	public void clearWindow() {
		System.out.println("Clearing Window");
		
	}
	
}

public class IntrotoInterface_32 {
	public static void main(String[] args) {
		Audi obj = new Audi();
		obj.Break(2);
		obj.blowHorn();
		
		
		
	}

}
