package java_program;


public class factorial {

	public static void main(String[] args) {
		int n=5;
		int factorial=1;
		if(n<0) {
			System.out.println("No");
			
		}else if(n==0) {
			System.out.println("hey");
			
		}else {
			for(int i=1;i<=n;i++) {
				factorial*=i;
			}
		}System.out.println(factorial);
		
		// TODO Auto-generated method stub

	}

}
