package oops.inheritance;

public class Teacher extends Person {
	
	public void teach() {
		System.out.println(name+ " is teaching");
	}

	public void eat() {
		System.out.println("teacher" +name+ "eating");
	}
	
	public static void laughing() {
		System.out.println("teacher is laughing");
	}
}
