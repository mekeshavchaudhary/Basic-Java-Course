package learnjava;

//class Circle{
//	int radius;
//	public int getRadius() {
//		return radius;
//	}
//	public void setRadius(int radius) {
//		this.radius = radius;
//	}
//	public double areaCircle() {
//		return (3.14*radius*radius);
//	}
//}
//class Cylinder extends Circle{
//	int height;
//	public int getHeight() {
//		return height;
//	}
//	public void setHeight(int height) {
//		this.height = height;
//	}
//	public double areaCylinder() {
//		return 2*3.14*radius*radius*height;
//	}
//	
//}

class Circle{
	int radius;
	public Circle(int a) {
		this.radius=a;
	}
	
	
	public Double getArea() {
		return 3.14*radius*radius;
	}
}

class Cylinder1 extends Circle{
	int height;
	public Cylinder1(int a , int h) {
		super(a);
		this.height = h;
	}
	
	
	public Double getArea() {
		return 2*3.14*radius*radius*height;
	}
}

public class Practiceques_30 {
	public static void main(String[] args) {
		Cylinder1 area =new Cylinder1(4,4);
//		area.setRadius(4);
//		area.setHeight(4);
//		System.out.println(area.areaCylinder());
		System.out.println(area.getArea());
		
	}

}
