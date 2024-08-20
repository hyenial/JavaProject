package course.inheretence;

public class Artists implements Human {
	
	public void walk() {
		System.out.println("This is how artisttss to walk");
	}
	
	public void speak() {
		System.out.println("This is how an artist able to speak!!");
	}
	
	public void preparePainting() {
		System.out.println("this is artisit preparing for painting");
	}
	
	public  static void main(String[] args) {
		Artists a = new Artists();
		
		a.preparePainting(); //this method is created for only this class 
		a.walk();
		a.speak();
		
	}

}
