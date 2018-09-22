import java.util.Scanner;

public class Edscan {

	public static void main(String[] args) {

		System.out.println("enter a number between 1-10");
		
		Scanner keyboard = new Scanner(System.in);
		
		int num;
		num = (int) (Math.random() * 2 + 1);
		int guess = keyboard.nextInt();
		
		
		while (guess != num) {
		
		if (guess< num )  {
			System.out.println("Guess higher"); 
			guess = keyboard.nextInt();
			
			} else  {
				
			System.out.println("Guess lower");
			guess = keyboard.nextInt();}
		}
		
		if (guess == num ) {System.out.println("congrats");
		System.out.println("guess again");
		
		num = (int) (Math.random() * 2 + 1);
		guess = keyboard.nextInt();
		}
		
			
			
		
			}}
		
		
		
	
	
		
	
	

	


