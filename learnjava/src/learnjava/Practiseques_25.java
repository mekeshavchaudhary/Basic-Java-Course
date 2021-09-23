package learnjava;

class Cylinder{
	private double radius;
	private double height;
	
	
	//using getter setter
	void setRadius(int newRadius) {
		radius = newRadius;
	}
	void setHeight(int newHeight) {
		height=newHeight;
	}
	double getRadius() {
		return radius;
	}
	double getHeight() {
		return height;
	}
	double area() {
		return 2*3.14*radius*radius*height;
	}
	double getvolume() {
		return 4/3*(3.14*radius*radius*radius);
	}
	//using constructor
	public Cylinder(double myHeight , double myradius) {
		height=myHeight;
		radius=myradius;
	}

	
}
class rectangle{
	private double length;
	private double breadth;
	
	double area() {
		return length*breadth;
	}
	double circumfarence() {
		return 2*(length+breadth);
	}
	public rectangle() {
		this.length=4;
		this.breadth=5;
	}
	public rectangle(double mylength, double mybreadth) {
		length=mylength;
		breadth=mybreadth;
}
	
}



public class Practiseques_25 {
	public static void main(String[] args) {
//when using getter setter
//		Cylinder obj =new Cylinder();
//		
//		obj.setRadius(4);
//		obj.setHeight(5);
//		System.out.println("radius= "+obj.getRadius());
//		System.out.println("Height = "+obj.getHeight());
//		System.out.println("The volume of the cylinder is : "+obj.getvolume());
//		System.out.println("The area of the cylinder is"+obj.area());

//using constructor
//		Cylinder obj = new Cylinder(5, 4);
//		System.out.println("radius= "+obj.getRadius());
//		System.out.println("Height = "+obj.getHeight());
//		System.out.println("The volume of the cylinder is : "+obj.getvolume());
//		System.out.println("The area of the cylinder is"+obj.area());

		
		rectangle obj = new rectangle();
		System.out.println(obj.area());
		
		rectangle obj2 = new rectangle(4, 5);
		System.out.println(obj2.area());
		
	}

}
