// to Validate given ISBN number



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine().trim();
        String isbn=input.replaceAll("-", "");
        if(isValidISBN10(isbn)||isValidISBN13(isbn)){
            System.out.println("ISBN Number is Valid");
        }
        else{
            System.out.println("ISBN Number is Not Valid");
        }
    }
    private static boolean isValidISBN10(String isbn){
        if(isbn.length()!=10)
            return false;
        int sum=0,digit;
        for(int i=0;i<10;i++){
            char c=isbn.charAt(i);
            if(i==9&&(c=='X'||c =='x')){
                digit=10;
            }
            else if(Character.isDigit(c)){
                digit=c-'0';
            }
            else{
                return false;
            }
            sum+=digit*(10 - i);
        }
        return sum%11==0;
    }
    private static boolean isValidISBN13(String isbn){
        if(isbn.length()!=13)
            return false;
        int sum=0;
        for(int i=0;i<13;i++){
            char c=isbn.charAt(i);
            if(!Character.isDigit(c))
                return false;
            int digit=c -'0';
            sum+=(i%2==0)?digit:digit*3;
        }
        return sum%10==0;
    }
}
