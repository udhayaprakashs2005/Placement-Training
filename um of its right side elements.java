//accept the elements into an array and replace every element in the array with the sum of its right side elements


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            sum=sum+a[i];
        }
        for(int i=0;i<n;i++){
            sum=sum-a[i];
            System.out.print(sum+" ");
        }
           
    }
}
