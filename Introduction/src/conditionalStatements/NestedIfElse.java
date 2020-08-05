package conditionalStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		
		int a = 12, b = 8, c = 10;
		int result = 0;
		
//		if(a > b) {
//			if(a > c) {
//				result = a;
//			}else {
//				result = c;
//			}
//		}else {
//			if(b > c) {
//				result = b;
//			}else {
//				result = c;
//			}
//		}
        result = a > b ? a > c ? a : c : b > c ? b : c;
		System.out.println("the greatest number is " +result);
	}

}
