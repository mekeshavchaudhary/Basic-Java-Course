package learnjava;

class circle{
	private double radius;
	void setradius(double n) {
	 radius=n;
	}
	double getradius() {
		return radius;
	}
	double area() {
		return 3.14*radius*radius;
	}
	double circumfarence() {
		return 3.14*2*radius;
	}
}


public class randompractice_customclass_22 {
	public static void main(String[] args) {
		circle c=new circle();
		c.setradius(4.0);
		System.out.println("The Radius of circle is : " + c.getradius());
		System.out.println("so Area = " + c.area());
		System.out.println("and Circumfarence = " +c.circumfarence());
		
	}

}
