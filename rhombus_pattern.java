//tp print the rhombus pattern 

    *****
   *****
  *****
 *****
*****


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++)
                System.out.print(" ");
                for(int star=1;star<=n;star++)
                    System.out.print("*");
        
                  System.out.println();
        }
             
            }
       
        
    
}
