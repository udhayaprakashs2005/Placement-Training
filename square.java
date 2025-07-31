//find the square number of N



import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=0){
            System.out.println("Sqaure of number: "+n*n);
        }
        else 
        System.out.println("Invalid Number");
    }
}
