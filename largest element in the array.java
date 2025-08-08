//accept the array elements from the user and find the largest element in the array.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int large=a[0];
        for(i=1;i<n;i++){
            if(a[i]>large){
                large=a[i];
            }
        }
        
        System.out.println(large);
    }
}
