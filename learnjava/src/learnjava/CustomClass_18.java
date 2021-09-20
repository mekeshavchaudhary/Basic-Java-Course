package learnjava;
//creating class
class students{
	//attributes
	int roll;
	String name;
	//creating methods
	void printdetails() {
		System.out.println("My roll is " +roll);
		System.out.println("My name is " +name);
	}
	int getRoll() {
		return roll;
	}
	String getName() {
		return name;
	}
}


public class CustomClass_18 {
	public static void main(String[] args) {
		//creating object
		students person= new students();
		
		//setting attributes
		person.roll=18;
		person.name= "Keshav";
		
		
		
		
		//creating another object
		students person2 =new students();
		person2.roll =34;
		person2.name="Aman";
		
		//calling them
		person.printdetails();
		person2.printdetails();
		
		//calling another method
		int Roll = person.getRoll();
		System.out.println(Roll);
		
		String Name=person2.getName();
		System.out.println(Name);
	}

}
