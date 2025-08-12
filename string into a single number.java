//convert the digits of the string into a single number


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    public static void main(String args[] ){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String replace=str.replaceAll("[a-zA-z]","");
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c>=48&&c<=57)
                System.out.print(c);
        }
       if(replace.length()==0)
           System.out.println(0);
    }
}
