package learnjava2;

import java.util.Scanner;

public class NestedTryCatch_44 {
	public static void main(String[] args) {
		int [] marks = {12,13,14};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index");
		int index = sc.nextInt();
		boolean flag = true;
		while(true) {
		
		try {
			System.out.println("Welcome");
			try {
				System.out.println(marks[index]);
				flag = false;
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Index is out of bound");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		}
		
	}

}
