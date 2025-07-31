//Count the number of factors for the given number


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n,i,count=0;
        n = sc.nextInt();
        for(i=1 ; i<=n ; i++)
        {
            if(n%i ==0)
                 count++;
        }
    System.out.print(count);
    }
}
