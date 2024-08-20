package course.polymorphism;

public  class Cat extends DomesticAnimal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
		System.out.println("I can eat MEat and milk as well !!");
	}
	
	public static void main (String[] args) {
		
		Cat c = new Cat();
		c.setMinSpeed("24km/h");
		c.eat();
		c.run();
		
		
	}
	

}
