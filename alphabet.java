//print the alphabet for n times


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        for(i=1;i<=n ; i++)
        {
              for(char ch='a' ; ch<='z' ; ch++)
              {
                  System.out.print(ch+" ");
              }
             System.out.println();   
        }
    }
}
