package learnjava;

public class Breakandcontinue {
	public static void main(String[] args) {
		int i=0;
// Break Statement
// 1
//		for(i=0; i<5 ; i++) {
//			System.out.println(i);
//			System.out.println("My java");
//			if (i==3) {
//				break;
//			}
//		}
//		System.out.println("Loop ends here due to \"Break\"");
		
// 2
//		while(i<5) {
//			System.out.println(i);
//			if (i==3) {
//				break;
//			}
//			i++;
//		}
//		System.out.println("Loop ends here due to \"Break\"");
		
//3 example
//		do {
//			System.out.println(i);
//			if (i==3) {
//				break;
//			}
//		i++;	
//		} while (i<5);
//		
		
		for(i=0; i<5 ; i++) {
		if (i==3) {
			continue;
		}
		System.out.println(i);
		System.out.println("My java");
	}
	System.out.println("Loop Leave 3 due to  \"Continue\"");	
		
		}
		
	}


