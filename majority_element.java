//find if a given integer x appears more than n/2 times in a sorted array of n integers.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int count=0,max=0,data=0,size=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n-1;i++){
           if(a[i]==a[i+1])
                count++;
            else{
                if(max<count){
                    max=count;
                    data=a[i];
                }
                count=1;
            }
        }
            if(max>size/2)
                System.out.println("The majority element is : "+data);
            else
                System.out.println("No majority found in array");
    }
}
