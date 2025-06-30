import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int max=a[n-1];
        int sm=0;
        int f=0;
        for(int i=n-2;i>=0;i--){
                if(a[i]!=a[n-1]){
                    sm=a[i];
                    f=1;
                    break;
                 
            }
            }   
        if(f==0){
            System.out.print("No Second Max");
        }else{
            System.out.println(sm);
        }
                    
        }
    }

            