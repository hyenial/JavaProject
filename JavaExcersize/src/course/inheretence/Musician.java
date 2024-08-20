package course.inheretence;

public class Musician implements Human {
	
	Keyboard myKeyboard = new Keyboard();
	
//	public void playKeyboard () {
//		System.out.println("This is playing Keyboard");
//	}
	
	public void speak() {
		System.out.println("this talks in different ways!!");
	}
	
	public void walk() {
		System.out.println("This is how to musicianas  walkkkk!!");
	}
	
	public static void main (String[] args) {
		Musician  a = new Musician ();
		
//		a.playKeyboard();
//		a.walk();
//		a.speak();		
		a.myKeyboard.playSound();
		
		
		
	}	

}
