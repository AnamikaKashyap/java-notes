package conditionalStatements;

public class IfElseIfClass {

	public static void main(String[] args) {
//	
//		int number = 10;
//		
//		if(number <= 10) {
//			System.out.println("number is less than or equal to 10");
//		}else if(number >10 && number <= 20) {
//			System.out.println("number is greater than 10 and less than 20");
//		}else if(number >20 && number <= 30) {
//			System.out.println("number is greater than 10 and less than 30");
//		}else {
//			System.out.println("number is greater than 30");
//		}

		int a = 15;
		int b = 8;
		
		int maxOfBothNumbers = 0;
		
		maxOfBothNumbers = a > b ? a : b ;
		
		System.out.println("max of both numbers is " +maxOfBothNumbers);
	}

}
