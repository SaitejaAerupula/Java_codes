package java_program;
import java.io.*;
import java.util.*;

	
public class Digitpos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner s = new Scanner(System.in);
		        int n = s.nextInt();
		        int sum = 0;
		        int pos = 1;

		        while (n > 0) {
		            int digit = n % 10;
		            sum += (int) Math.pow(digit, pos);
		            n /= 10;
		            pos++;
		        }

		        System.out.println(sum);
		    }
		}
