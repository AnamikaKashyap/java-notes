package oops.interfaces;

public class Person implements Student, Youtuber {

	public static void main(String[] args) {
		
		Person obj = new Person();
		obj.Study();
		obj.makeVedio();
	}
	
	@Override
	public void Study() {
		System.out.println("person is studying");
	}
	
	@Override
	public void makeVedio() {
		System.out.println("person is making a good vedio");
	}
}
