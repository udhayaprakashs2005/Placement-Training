// to validate the given email



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String email=sc.nextLine().trim();
        if(isValidEmail(email)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
    private static boolean isValidEmail(String email){
        String regex="^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        return email.matches(regex);
    }
}
