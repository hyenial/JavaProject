package course.mypackageB.Person;

public class Person {
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	private int age;
	private String gender;
	
	void sleep() {
		if(age<10) {
			System.out.println(name + " will sleep more than 12 hours in a day");
		} else if(age >=10 && age <=50 ) {
			System.out.println(name + " will sleem less than 10 ohurs in a day");			
		}else {
			System.out.println(name+ " will sleep avarage 10 hours in a day");
		}
	}
}