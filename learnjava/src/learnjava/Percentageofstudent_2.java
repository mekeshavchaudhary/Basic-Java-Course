package learnjava;
import java.util.Scanner;

public class Percentageofstudent_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student Name:");
		String str1 = s.nextLine();
		
		System.out.println("Marks in subject1:");
		int a = s.nextInt();
		System.out.println("Marks in subject2");
		int b = s.nextInt();
		System.out.println("Marks in subject3:");
		int c = s.nextInt();
		System.out.println("Marks in subject4");
		int d = s.nextInt();
		System.out.println("Marks in subject4");
		int e = s.nextInt();
		
		float avg = (a+b+c+d+e)/5;
		System.out.println("The total percentage of student is:" + avg);
		
		
	}

}
