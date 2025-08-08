//accept the array and position in which the new element to be inserted from the user and display the array.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,pos,data;
        int n=sc.nextInt();
        int a[]=new int[n+1];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        data=sc.nextInt();
        pos=sc.nextInt();
        for(i=n;i>=pos-1;i--){
            a[i]=a[i-1];
        }
        a[pos-1]=data;
        for(i=0;i<n+1;i++){
            System.out.print(a[i]+" ");
        }
    }
}
