//perfect square or not.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=(int)Math.sqrt(n);
        if(ans*ans==n)
            System.out.println("Perfect Square");
        else
            System.out.println("Not");
    }
}
