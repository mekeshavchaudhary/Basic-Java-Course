package learnjava;

public class Varargs {

//method example one	
//	static int sum(int ...arr) {
//		//vailable as int [] arr
//		int value=0;
//		for(int a: arr) {
//			value += a;
//		}
//		return value;
//	}
	
	static int sum(int x,int ...arr) {
		int value=x;
		for(int a: arr) {
			value += a;
		}
		return value;
	}
	public static void main(String[] args) {
		
		System.out.println("the sum of 1 is :" + sum(1));
		System.out.println("the sum of 1,2,3 is :" + sum(1,2,3));
		System.out.println("the sum of 40,2,3,4,5 is :" + sum(40,2,3,4,5));
	}

}
