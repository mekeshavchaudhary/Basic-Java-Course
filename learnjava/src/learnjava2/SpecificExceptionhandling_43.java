package learnjava2;

import java.util.Scanner;

public class SpecificExceptionhandling_43 {
	public static void main(String[] args) {
		int [] marks = {12,50,60};
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the index");
		 int index = sc.nextInt();
		 System.out.println("Enter the number");
		 int number = sc.nextInt();
		 
		 try {
			 int a = marks[index]/number;
			 System.out.println(a);
			
		} catch (ArithmeticException e) {
			System.out.println("we found an arithimatic exception");
			System.out.println(e);
		}
		 catch (ArrayIndexOutOfBoundsException e) {
			 System.out.println("there is arrayindexoutofboundexception");
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
