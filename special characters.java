// count the special characters in the given string


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int u=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!Character.isLetterOrDigit(s.charAt(i))){
                u++;
            }
        }
            System.out.println(u);
        }
}
