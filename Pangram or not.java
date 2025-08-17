//to check whether a given string is Pangram or not


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        boolean[] letters=new boolean[26];
        int count=0;
        for(char c:str.toCharArray()){
            if(c>='a'&&c<='z'){
                int index=c-'a';
                if(!letters[index]){
                    letters[index]=true;
                    count++;
                }
            }
        }
        if(count == 26){
            System.out.println("Pangrams");
        }
        else{
            System.out.println("Not Pangrams");
        }
    }
}
