import java.util.Scanner;

public class Find {

	public static void main(String[] args) {

Scanner input = new Scanner (System.in);

	System.out.println("enter a command");
	String text = input.nextLine(); 
	
	switch(text) { 
	case "start" :
		System.out.println("Machine has started");
		break;
		
		
	case "stop" :
		System.out.println("Machine has stopped");
		break;
		
		
		default: System.out.println("command not recognised");
		text = input.nextLine();
		
		
		
	}
	

	}

}
