
public class Loops {

	public static void main(String[] args) {
// dont use while(true) 
		int value = 0;

		while (value < 5) {
			System.out.println("no");
			value++;

			while (value < 3) {     /// so it actually keeps going down here when the value is below 5, 
				System.out.println("go");
				value++;

			}

		}

	}

}


