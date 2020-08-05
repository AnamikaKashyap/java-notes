package nestedForLoops;
import java.util.Scanner;
public class Pattern13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int columns = 0;
		int num=1;
		for(int i = 1;i<=n;i++) {
						for(int j = 1; j<=n-i+1;j++) {
							System.out.print("  ");
						}
						
							for(int j = 1; j<=i+columns;j++) {
								System.out.print(num++ +" ");
								
							}num = 1;
							columns++;
		System.out.println();
		}
	}

}
