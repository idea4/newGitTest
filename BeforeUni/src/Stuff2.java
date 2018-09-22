class Person {
	int age;
	int speed;

	int calculateYearsToRetirement () { 
		int YearsLeft =65 -age;     // nice to have this here 
		return YearsLeft;
	}
	
	int TimeToLiftOff () {    // return 
		int Time = 100 - speed;
		return Time;
		
	}
	
	int getAge() {  //getter 
		return age;// should be lower case first letter 
	}
	}
	

public class Stuff2 {
public static void main(String[] args) {
		Person person = new Person ();
		
		person.age = 45;   // setter 
		int Years = person.calculateYearsToRetirement();
		System.out.println(Years);
		
		person.speed=34;
		int times = person.TimeToLiftOff();
		System.out.println(times);
		
		int hisAge = person.getAge();   /// seems to be always good to reference it to something 
		System.out.println(hisAge);

	}

}
