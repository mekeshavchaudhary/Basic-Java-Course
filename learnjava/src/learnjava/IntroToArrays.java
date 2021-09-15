package learnjava;

public class IntroToArrays {
	public static void main(String[] args) {
		/* suppose a classroom of 50 students and we have to store marks for all students
		 * so for that that we have two option
		 * 1. create 50 variables 
		 * 2. use arrays to store them(recommended)
		 */
		int [] marks = new int[5];   // just taking example of 5 students
		//to store the values
		
		// to write an array we can also use
		//1.
		//int [] marks;
		// marks = new int[5];
		//2.
		//int [] marks = {100 , 80 , 70 , 10, 90};
		marks[0] = 100;
		marks[1] = 80;
		marks[2] = 70;
		marks[3] = 10;
		marks[4] = 90;
		//marks[5] = 96;  it will throw an error as 6th one is out of length for array
		//values are stored now
		
		System.out.println(marks[1]);
		
		
		
		
	}

}
