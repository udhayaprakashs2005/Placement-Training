//accept the string from the user and display the string in the password format without making any change in the input array



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();
        int l = pass.length();
        for(int i=1 ;i<=l;i++)
        {
          System.out.print("*");
        }
    }
}
