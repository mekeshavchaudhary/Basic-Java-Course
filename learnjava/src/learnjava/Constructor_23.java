package learnjava;

class Students{
	private int roll;
	private String name;
	
	public Students(String myname,int myroll) {
		name =myname;
		roll = myroll;
	}
	public Students() {
		roll=18;
		name="Nitin";
	}
	
	void setroll(int n) {
		this.roll=n;
	}
	void setname(String n) {
		this.name=n;
	}
	int getroll() {
		return roll;
	}
	String getname() {
		return name;
	}
	
	
	
	
}


public class Constructor_23 {
	public static void main(String[] args) {
//		Students obj = new Students();
//		obj.setname("Keshav");
//		obj.setroll(18);
		
		Students obj=new Students("Aman", 18);
		System.out.println(obj.getroll());
		System.out.println(obj.getname());
		
		Students obj2=new Students();
		System.out.println(obj2.getroll());
		System.out.println(obj2.getname());
		
	}

}