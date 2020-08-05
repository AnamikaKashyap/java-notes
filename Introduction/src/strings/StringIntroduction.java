package strings;

public class StringIntroduction {

	public static void main(String[] args) {
	
		String name = "                    Anamika                       Kashyap                      ";
		String anotherName = new String("Anamika");
		System.out.println(name == anotherName);
		System.out.println(name.charAt(0));
		System.out.println(name.length());
		System.out.println(name.substring(3,6));
		System.out.println(name.contains("Anam"));
		System.out.println(name.equals("Anamika Kashyap"));
		System.out.println(name.isEmpty());
		System.out.println(name.concat(" Kashyap"));
		System.out.println(name.replace('A','C'));
		System.out.println(name.indexOf('m'));
		System.out.println(name.trim());
	}

}
