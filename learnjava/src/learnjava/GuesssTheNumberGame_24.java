package learnjava;

import java.util.Random;
import java.util.Scanner;

class Game{
	public Game() {
		Random a=new Random(100);
		int computerchoice= a.nextInt();
	}
	int takeuserinput() {
		Scanner sc = new Scanner(System.in);
		int myinput = sc.nextInt();
		return myinput;
	}
	
}

public class GuesssTheNumberGame_24 {
	public static void main(String[] args) {
		
	}

}
