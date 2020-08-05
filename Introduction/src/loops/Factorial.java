package loops;

public class Factorial {

	public static void main(String[] args) {
		
		int n = 3;
		int f =1;
		for(int i = n; i>= 1; i--) {
        f = f*i;
        }
        System.out.println(f);
}
}
