//accept the array and count the number of odd and even numbers in the given array


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int odd=0,even=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]%2==0)
                even++;
            else
                odd++;
        }
       
         System.out.println("Odd = "+odd);
         System.out.println("Even = "+even);
    }
}
