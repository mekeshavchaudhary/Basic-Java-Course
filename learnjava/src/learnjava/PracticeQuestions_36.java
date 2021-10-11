package learnjava;

abstract class pen{
	abstract void write();
	abstract void refil();
}

class Fountainpen extends pen{

	@Override
	void write() {
		System.out.println("Start Writing");
		
	}

	@Override
	void refil() {
		System.out.println("Refilling");
		
	}
	
	void changenib() {
		System.out.println("Changing Nib");
	}
}

public class PracticeQuestions_36 {
	public static void main(String[] args) {
		
		Fountainpen obj = new Fountainpen();
		obj.write();
		obj.changenib();
		obj.refil();
		
	}

}
