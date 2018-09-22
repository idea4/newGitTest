import java.util.Scanner;

public class scansD {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);    /// input is an arbirtary name , remember the system.in
		int value = 0;
		do { 
			System.out.println( "enter a num");
			value = scanner.nextInt();   // only exist in brackets 
			
		}
		
		while (value !=5);    /// can't have a space between !=
		
		System.out.println("got 5");

	}

}
