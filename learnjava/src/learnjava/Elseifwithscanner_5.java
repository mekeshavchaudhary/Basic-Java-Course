package learnjava;
import java.util.Scanner;

public class Elseifwithscanner_5 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = a.nextInt();
		 if (age>40 && age<44) {
		 System.out.println("Your name is Jyoti chaudhary");}
		 else if (age>44 ) {
		 System.out.println("Your name is Sanjay chaudhary");}
		 else if (age == 21 ) {
		 System.out.println("Your name is Krishna chaudhary");}
		 else if (age == 20 ) {
		 System.out.println("Your name is Keshav chaudhary");}
	}

}
