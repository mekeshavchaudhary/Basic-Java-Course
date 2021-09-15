package learnjava;

public class Continuearray {
	public static void main(String[] args) {
		//Array for different data type
		
		//1. For float
//		float [] marks = {98 , 47.5f , 99.2f , 86};
//   	System.out.println(marks.length);               //marks.length will give the lenght of array
//		System.out.println(marks[0]);
		
		//2. For String
//		String [] students = {"Keshav" , "Sanjay" , "Scout"};
//		System.out.println(students.length);
//		System.out.println(students[1]);
		
		
		//to print all the array
		int [] marks = {98 , 47 , 99 , 86};
		//1.
		System.out.println("printing using normal way :");
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		
		//2.
		System.out.println("Using for loop");
		for (int i=0 ; i<marks.length ; i++) {
			System.out.println(marks[i]);
		}
		//ques print them in reverse order
		System.out.println("Printing in reverse order :");
		for (int j =(marks.length-1) ; j>=0 ; j--) {
			System.out.println(marks[j]);
		}
		
		//3.
		System.out.println("Printing using for-each loop");
		for(int mark: marks){
		System.out.println(mark);
		}
	}
}
