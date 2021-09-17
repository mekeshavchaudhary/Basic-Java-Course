package learnjava;

public class Recursion {
	//normal method for factorial
	static int factorial1(int n) {
		if (n==0 || n==1) {
			return 1;
		}
		else {
			int result=1;
			for (int i=1;i<=n;i++) {
				result = result*i;
			}
			return result;
		}
		
	}
	
	static int factorial(int n) {
		if (n==0 || n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(factorial(4));
		System.out.println(factorial1(4));
		
	}

}
