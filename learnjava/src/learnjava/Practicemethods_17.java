package learnjava;

public class Practicemethods_17 {
	//method to print table
	static void multiplication(int a) {
		int multi;
		for (int i=1;i<=10;i++) {
			multi= a*i;
			System.out.printf("%d x %d = %d" ,a,i,multi);
			System.out.println("");
			
		}
	}
	//method to print patter       *
    //							   **
	//	                           ***
	static void pattern1(int n) {
		for (int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return n+sum(n-1);
	}
	static void pattern2(int n) {
		for (int i=n;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	//fibunacchi series
	static int fib(int n) {
		if(n==1) {
			return 0;
		}
		else if (n==2) {
			return 1;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}
	//claculating avg using varargs
	static int average(int ...arr) {
		int sum=0;
		for(int a: arr) {
			sum = (sum +a);
		}
		int x=sum/arr.length ;
		return x;
	}
	//ques 2 using recursion
	static void ques2_rec(int n) {
		if(n>0) {
			ques2_rec(n-1);
			for(int i=0;i<n;i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	//explaning
	// ques2_rec(3)
    // ques2_rec(2) + 3 times star and new line
    // ques2_rec(1) + 2 times star and new line + 3 times star and new line
    // ques2_rec(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line

	public static void main(String[] args) {
//       multiplication(5);	
//		pattern1(5);
//        System.out.println(sum(4));
//		pattern2(5);
//		System.out.println(fib(5));
//		System.out.println(average(5,3));
		ques2_rec(3);
	}

}
