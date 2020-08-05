package nestedForLoops;
import java.util.Scanner;
public class Pattern11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int rows = 2*n-1;
		
		int num = 1;
        for(int i = 1;i <= rows; i++) {
			    if(i<=n) {
									for(int j = 1; j<=n-i;j++) 
									{
										System.out.print("  ");
									}
									
									
									for(int j = 1; j <= i;j++)
									{
										System.out.print("* ");
									}
			             }
			    else {
							    	for(int j = 1; j<=i-n;j++) 
									{
										System.out.print("  ");
									}
									
							    	
									for(int j = n-num; j >= 1;j--)
									{
										System.out.print("* ");
									}
									num++;
			    }                    
			System.out.println();
						
		}
	}

}