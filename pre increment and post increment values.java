//pre increment and post increment values

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int a1=++a;
        int b2=b++;
        System.out.println("Pre increment:"+a1);
        System.out.println("Post increment:"+b2);
        System.out.println("Final values:"+a+" "+b);
        
    }
}
