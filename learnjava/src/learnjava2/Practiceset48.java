package learnjava2;

import java.util.Scanner;

public class Practiceset48 {
	public static void main(String[] args) {
		int [] marks= {44,43,42};
		Scanner sc= new Scanner(System.in);
		
		
		boolean flag= true;
		while(true) {
			System.out.println("Enter your Number");
			int number= sc.nextInt();
			System.out.println("Enter index of the array");
			int index = sc.nextInt();
			try {
				System.out.println(marks[index]/number);
				flag=false;
				
			} catch (Exception e) {
				System.out.println("Error Caught");
				
			}
		}
	}

}
