// reverse a string except the special characters


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] c=str.toCharArray();
        int left=0,right=c.length-1;
        while(left<right){
            if(!Character.isLetter(c[left])){
                left++;
            }
            else if(!Character.isLetter(c[right])){
                right--;
            }
            else{
                char temp=c[left];
                c[left]=c[right];
                c[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(new String(c));
    }
}
