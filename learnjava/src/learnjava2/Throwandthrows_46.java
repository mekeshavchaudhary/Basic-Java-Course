package learnjava2;

class Negativeradiusexception extends Exception{
	public String toString() {
		return "Radius cant be negative";
	}
	
	public String getMessageS() {
		return "radius cant be negative";
	}
}

public class Throwandthrows_46 {
	public static double area(int r) throws Negativeradiusexception  {
		if(r<0) {
			throw new Negativeradiusexception();
		}
		double area = Math.PI *r*r;
		return area;
	}
	
	
	
	
	public static int divide(int a,int b) throws ArithmeticException {
		int result= a/b;
		return result;
		
	}
	
	
	
	public static void main(String[] args) {
		try {
//			System.out.println(divide(4, 0));
			System.out.println(area(-1));
			
			
		} catch (Exception e) {
			System.out.println("Exception Caught");
		}
		
	}

}
