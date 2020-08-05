package nestedForLoops;
import java.util.Scanner;
public class Pattern14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int columns = 0;
		int num = 1;
		for(int i = 1;i<=n;i++) {
						for(int j = 1; j<=n-i+1;j++) {
							System.out.print("  ");
						}
						
							for(int j = 1; j<=i+columns;j++) {
								
								if(j==1 || j==i+columns){System.out.print(num +" ");}
								else{System.out.print("0 ");}
								
							}
							num++;
							columns++;
		System.out.println();
		}
	}

}
