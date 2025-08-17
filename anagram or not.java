//to check the given string is anagram or not


import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String in1=sc.nextLine();
        String in2=sc.nextLine();
        String out1=in1.trim();
        String out2=in2.trim();
        String s1=in1.replaceAll("\\s+", "").toLowerCase();
        String s2=in2.replaceAll("\\s+", "").toLowerCase();
        if(s1.length()!=s2.length()){
            System.out.println(out1 + " and " + out2 + " are Not Anagrams.");
            return;
        }
        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a, b)){
            System.out.println(out1 + " and " + out2 + " are Anagrams.");
        }
        else{
            System.out.println(out1 + " and " + out2 + " are Not Anagrams.");
        }
    }
}
