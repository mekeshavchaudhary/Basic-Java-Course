package learnjava;

public class IntrotoMethods_13 {
	
	    //creating a method
	static int logic(int x , int y) {
		int z;
		if (x>y) {
			z= x-y;
		}
		else {
			z=x+y;
		}
		return z;
	}
	public static void main(String[] args) {
//		int a=5 ;
//		int b=7 ;
//		int c;
//	    //calling a method
//		c = logic(a, b); 
		System.out.println(logic(3,4));
		
		/*
		 * now if we remove static from the above method the calling it is not possible
		 * fot that we use Method invocation using object creation 
		 * what we do is we write
		 * IntrotoMethods obj= new IntrotoMethods();
		 * now we can call it like 
		 * c= obj.logic(a,b);
		 */
//		System.out.println(c);
	}

}
