import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int lb=a[n-1];
        for(int i=n-2;i>=0;i--){
            if(a[i]>lb){
                 System.out.print(a[i] + " ");
               lb=a[i];
            }
        }
       
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
    }
}