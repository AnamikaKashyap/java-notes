package conditionalStatements;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		
		int dayOfWeak = 4;
		
		switch(dayOfWeak) {
		case 1:
			System.out.println("i'm on leave");
			break;
		case 2:
			System.out.println("i'm in office");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
			default:
				System.out.println("i don't know the day");
		}
	}

}
