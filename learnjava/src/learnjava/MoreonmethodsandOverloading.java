package learnjava;

public class MoreonmethodsandOverloading {
	static void mysum(int a) {
		a=98;
	}
	static void arr(int[] arr) {
		arr[0] = 98;
	}
	
	
	
	static void same() {
		System.out.println("1st type");
	}
	static void same(int a) {
		System.out.println(a+"nd type " );
	}
	static void same(int a , int b) {
		System.out.println( (a +b) +"rd type " );
	}
	public static void main(String[] args) {
//		//changing the integer using method
//		int x= 66;
//		mysum(x);
//		System.out.println(x);
//		//it will not change to 98 but in case of array
//		
//		
//		//changing any numb inside an array
//		int [] marks = {54,47,98};
//		arr(marks);
//		System.out.println(marks[0]);
//		//here marks[0] gets changed
		
		
		
		//example of method overloading(all same methods )
		same();
		same(2);
		same(1, 2);
		
		
	}

}
