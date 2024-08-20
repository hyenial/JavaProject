package course.polymorphism;

public class WildAnimal extends Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("I will eat MEAT");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I will running at "+ getMinSpeed());		

		
	}
	

}
