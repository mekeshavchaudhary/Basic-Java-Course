package learnjava2;

public class TryCatch_42 {
	public static void main(String[] args) {
		int a =1000;
		int b= 0;
		
		//without try
//		int c= a/b;
//		System.out.println(c);
		
		
		//with try		
		try {
			int c=a/b;
			System.out.println(c);
			
		} catch (Exception e) {
			System.out.println("The result is not found due to");
			System.out.println(e);
		}
		System.out.println("End of the Program");
	}

}
