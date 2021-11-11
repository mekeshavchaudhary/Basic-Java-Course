package learnjava2;

public class FinallyBlock_47 {
	public static int divide() {
		try {
			int a=5;
			int b=0;
			int c=a/b;
			return c;
			
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("This is the end of this Function.");
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(divide());
		int a=6;
		int b=3;
		while(true) {
			
			try {
				System.out.println(a/b);
			} 
			catch (Exception e) {
				System.out.println(e);
				break;
			}
			finally {
				System.out.println("value of b is "+b);
			}
			b--;
		}
		
	}

}
