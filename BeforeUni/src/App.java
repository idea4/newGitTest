
class Robots {
	
	public void speak(String text) {      // need a string varaible to use it 
		System.out.println(text);
	}
	
	
}
public class App {

	public static void main(String[] args) {
		Robots sam = new Robots();
		sam.speak("hi i m sam"); 
		

	}

}
