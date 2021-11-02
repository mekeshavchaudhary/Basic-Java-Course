package learnjava;

import java.util.Random;
import java.util.Scanner;


public class RockPaperScissor_randomcode_21 {
	public static void main(String[] args) {
		System.out.println("Enter 0 for Rock , 1 for Paper and 2 for Scissor: ");
		Scanner sc= new Scanner(System.in);
		int myinput = sc.nextInt();
		Random rn = new Random();
		int yourinput = rn.nextInt(3);
		if (myinput>2) {
			System.out.println("You have entered a Wrong Choice");
		}
		else {			
			if(myinput==yourinput) {
				System.out.println("Its a Draw");
			}
			else if(myinput==0 && yourinput==2 || myinput==1 && yourinput==0 || myinput==2 && yourinput==1) {
				System.out.println("You Win");
			}
			else {
				System.out.println("You lose");
			}
		}
		if(yourinput==0){
            System.out.println("Computer choice: Rock");
        }
        else if(yourinput==1){
            System.out.println("Computer choice: Paper");
        }
        else if(yourinput==2){
            System.out.println("Computer choice: Scissors");
        }
		 
	
	}

}
