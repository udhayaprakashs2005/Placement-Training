// search for a character in a string


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char input=sc.next().charAt(0);
        sc.nextLine();
        String a=sc.nextLine();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==input){
                System.out.println("Present");
                return;
            }
        }
                        System.out.println("Not Present");
    }
}
