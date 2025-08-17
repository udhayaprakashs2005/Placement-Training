//to check the IP address is validate or not



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String ip=sc.nextLine();
        String[] parts=ip.split("\\.");
        if(parts.length!=4){
            System.out.println("Invalid");
            return;
        }
        boolean isValid=true;
        for(String part:parts){
            if(!part.matches("\\d+")){
                isValid=false;
                break;
            }
            try{
                int num=Integer.parseInt(part);
                if(num<0||num>255){
                    isValid=false;
                    break;
                }
                if(part.length()>1&&part.startsWith("0")){
                    isValid=false;
                    break;
                }
            }
            catch(NumberFormatException e){
                isValid=false;
                break;
            }
        }
        System.out.println(isValid ?"Valid":"Invalid");
    }
}
