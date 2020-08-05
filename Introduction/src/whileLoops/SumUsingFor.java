package whileLoops;
import java.util.Scanner;
public class SumUsingFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sum = 0;
		
	for(int temp = n;temp > 0;temp /= 10) {
			int lastDigit = temp % 10;
			sum +=lastDigit;
			System.out.println(lastDigit+ " " +temp+ " " +sum);	
	}
		System.out.println("The sum of digits of " +n+ " is " +sum);
		
			}

}
