package java_program;

import java.io.*;
import java.util.*;
public class DigitRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int low = s.nextInt();
        int high = s.nextInt();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            if (digit >= low && digit <= high) {
                sum += digit;
            }
            n /= 10;
        }

        System.out.println(sum);
    }
}


	