//find the first and last number in given number


import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int  last=n%10;
        int first=n;
        while(first>=10){
        first=first/10;
        }
        System.out.println("First number: "+first);
        System.out.println("Last number: "+last);
    }
}
