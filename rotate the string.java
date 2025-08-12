// accept the string and rotate the string n times


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        int len=str.length();
        n=n%len;
        String s=str.substring(n)+str.substring(0,n);
        System.out.println(s);
    }
}
