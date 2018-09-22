import java.util.Scanner;

public class Scans {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);    /// input is an arbirtary name , remember the system.in
		
		System.out.println("enter a number"); 
		
		int value = scanner.nextInt();  
		
		while(value !=5) {
			System.out.println("enter again");
			value=scanner.nextInt();					/// this was the problem i was facing, we msut write it was value = again tot he scanner 
		}
		System.out.println ("you got 5");
		 
	
		 
	}
}
		 
			 
			 
		 
		 
	
		
		 
		 
		
			
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
	


