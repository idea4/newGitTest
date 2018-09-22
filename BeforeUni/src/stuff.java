
class Stats {    /// we are able to just write it as class, not public 
	
	int age;
	String name;
	
	void Speak () { 
		for (int i =0; i<3; i++) {
		
		System.out.println("hello my name is  " + name + age);
		
		}
	}
} 





public class stuff {

	public static void main(String[] args) {
		
	Stats person = new Stats();
	
	
	person.age = 34;
	person.name = "ted"; 
	person.Speak();
		
	
	
	Stats person2 = new Stats();
	person2.age = 34;
	person2.name = "john"; 
	person2.Speak();

	}

}
