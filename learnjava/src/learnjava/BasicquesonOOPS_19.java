package learnjava;
//Class 1
class Employee{
	int salary;
	String name;
	
	int getsalary() {
		return salary;
	}
	String getname() {
		return name;
	}
	String setname() {
		return "Keshav";
	}
}



//CLass2
class square{
	int side;
	
	int getcalculatingarear() {
		return side*side;
	}
	int getperimeter() {
		return 4*side;
	}
}

public class BasicquesonOOPS_19 {
	public static void main(String[] args) {

		
//Class 1		
		Employee person =new Employee();
		
		person.salary=24;
		person.name="krishna";
		
		int a = person.getsalary();
		System.out.println(a);
		
		String n = person.getname();
		System.out.println(n);
		
		String x = person.setname();
		System.out.println(x);
		
		
		
//Class 2
		square math =new square();
		math.side =4;
		System.out.println(math.getcalculatingarear());
		System.out.println(math.getperimeter());
	}

}
