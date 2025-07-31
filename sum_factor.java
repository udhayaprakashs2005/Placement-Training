//Find the sum of factors of the given number.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,sum=0;
        n = sc.nextInt();
        for(i=1 ; i<=n ; i++)
        {
            if(n%i ==0)
                sum = sum+i;
        }
    System.out.print(sum);
    }
}
