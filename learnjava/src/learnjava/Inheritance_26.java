package learnjava;

class base{
	int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		System.out.println("this is x and  from base class");
		this.x = x;
	}
	
}
class derived4 extends base{
	int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		System.out.println("this is y and from derived class");
		this.y = y;
	}
}

public class Inheritance_26 {
	public static void main(String[] args) {
		
		base b =new base();
		b.setX(4);
		System.out.println(b.getX());
		
		
		derived4 d= new derived4();
		d.setX(5);
		System.out.println(d.getX());
		
		d.setY(6);
		System.out.println(d.getY());		
	}

}
