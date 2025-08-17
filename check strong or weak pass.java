//to check whether it is strong or weak



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String password=sc.nextLine();
        boolean hasUpper=false;
        boolean hasLower=false;
        boolean hasDigit=false;
        boolean hasSpecial=false;
        for(char ch:password.toCharArray()){
            if(Character.isUpperCase(ch)){
                hasUpper=true;
            }
            else if(Character.isLowerCase(ch)){
                hasLower=true;
            }
            else if(Character.isDigit(ch)){
                hasDigit=true;
            }
            else{
                hasSpecial=true;
            }
        }
        if(password.length()>=10&&hasUpper&&hasLower&&hasDigit&&hasSpecial){
            System.out.println("Strong password");
        }
        else{
            System.out.println("Weak password");
        }
    }
}
