//Find all the prime factors of the given number.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i=2,count=0;
        n = sc.nextInt();
        while(n>1)
        {
            if(n%i==0)
            {
                count++;
                n = n/i;
            }
            else
            {
                if(count>=1)
                System.out.println(i+"->"+count);
                count=0;
                i++;
            }
        }
         System.out.println(i+"->"+count);
    }
}
