package nestedForLoops;
import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		for(int i = n; i >= 1; i--) {
			for(int i = 1; i <= n; i++) {
				
//				for(int j = 1; j <= i; j++) {
					for(int j = 1; j <= n-i+1; j++) {
					
					System.out.print("* ");
				}
				System.out.println();
		}
	}

}
