// GCD of given two numbers


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=findGCD(a, b);
        System.out.println("GCD of two number is "+gcd);
}
    public static int findGCD(int a,int b){
        while (b != 0) {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
