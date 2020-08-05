package interviewQuestions;
import java.util.*;

public class RepeatEveryWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String n = sc.nextLine();
		
	if(n.isEmpty()) {
		System.out.println("Enter a valid string");
	}
		char p = ' ';
		for(int i = 0; i <n.length(); i++) {
			int count = 1;
			for(int j = i+1; j<n.length(); j++) {
				 
				if(n.charAt(i) == n.charAt(j)) {
					count = 2;
					p = n.charAt(j);
				}else {
					count = 1;
				}
				
				if(count == 2) {
					System.out.print(p);
				}
			}
			if(count == 2) {
				
			}else {
				System.out.print(n.charAt(i));
				System.out.print(n.charAt(i));
			}
			
			}
		}
		

	}


