//to check whether the string is isogram or not


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        boolean[] seen=new boolean[26];
        boolean isIsogram=true;
        for(char c:str.toCharArray()){
            if(c>='a'&&c<='z'){
                int index=c-'a';
                if(seen[index]){
                    isIsogram=false;
                    break;
                }
                seen[index]=true;
            }
        }
        if(isIsogram){
            System.out.println("ISOGRAM");
        }
        else{
            System.out.println("NOT ISOGRAM");
        }
    }
}

