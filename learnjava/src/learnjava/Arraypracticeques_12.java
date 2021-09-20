package learnjava;

import java.util.Scanner;

public class Arraypracticeques_12 {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in)		
		//ques1 to get the sum of array
;
//		System.out.println("Enter any five numbers :");
//		float [] nums = new float[5];
//		nums[0] = sc.nextFloat();
//		nums[1] = sc.nextFloat();
//		nums[2] = sc.nextFloat();
//		nums[3] = sc.nextFloat();
//		nums[4] = sc.nextFloat();
//		
//		float sum = nums[0] + nums[2] + nums[1] + nums[3] + nums[4];
//		System.out.println(sum);
		
		//ques 2 to cheack wheather the value is in array
//		int [] nums= {2 , 3, 4, 5};
//		int a = sc.nextInt();
//		for(int element: nums) {
//			if (a==element) {
//				System.out.println("the value is present in the array");
//				  
//			}
//			if (a != element) {
//				System.out.println("the value is not present int the array");
//				break;
//				
//			}
//		}
    	
    	//ques3 adding and sub two matrixes
//    	int [][] mat1 = new int[2][2] ;
//    	int [][] mat2 = new int[2][2] ;
//        int [][] mat3 = new int[2][2] ;
//        
//        System.out.println("Enter the values of first matrix");
//        for (int i =0;i<2;i++) {
//        	for(int j=0;j<2;j++) {
//        		mat1[i][j] = sc.nextInt();
//        		
//        	}
//        }
//        
//        System.out.println("Enter the values of Second matrix");
//        for (int i =0;i<2;i++) {
//        	for(int j=0;j<2;j++) {
//        		mat2[i][j] = sc.nextInt();
//        	}
//        }
//        System.out.println("Adding.......");
//        for (int i =0;i<2;i++) {
//        	for(int j=0;j<2;j++) {
//        		mat3[i][j] = mat1[i][j] + mat2[i][j];
//        		 System.out.print(mat3[i][j] + "\t");
//        	}
//        	System.out.println("");
//        }
//       
//        System.out.println("subtracting.......");
//        for (int i =0;i<2;i++) {
//        	for(int j=0;j<2;j++) {
//        		mat3[i][j] = mat1[i][j] - mat2[i][j];
//        		 System.out.print(mat3[i][j] + "\t");
//        	}
//        	System.out.println("");
//        }
    	
    	  
    	  //ques printing array in reverse order
//    	  int [] num = {1,2,3,4,5};
//    	  int l = num.length;
//    	  int n=Math.floorDiv(l, 2);
//    	  int temp;
//    	  
//    	  for( int i=0;i<n;i++) {
//    		  
//    		  temp = num[i];
//    		  num[i] = num[l-1-i];
//    		  num[l-1-i] = temp;
//    		  
//    	  }
//    	  for (int element: num) {
//    		  System.out.print(element + " ");
//    	  }
    	
    	  
    	
    	//ques finding the largest number in the array
//    	int [] numbs = {1,4,56,78,3,2};
//    	  int max=0;
//    	  for (int e: numbs) {
//    		  if(e>max) {
//    			  max=e;
//    		  }
//    	  }
//    	  System.out.println("largest number in this array is : " +max);
    	
    	
    	 //ques to cheack weather the array is shorted 
//    	int [] numbs = {1,4,56,78,3,2};
//    	boolean isShorted=true;
//    	for (int i=0;i<(numbs.length-1);i++) {
//    		if(numbs[i]>numbs[i+1]) {
//    		isShorted= false;
//    		break;
//    		}
//    	}
//    	if(isShorted) {
//    		System.out.println("The array is Shorted");
//    	}
//    	else {
//			System.out.println("This Array is not Shorted");
//		}
	}
}
