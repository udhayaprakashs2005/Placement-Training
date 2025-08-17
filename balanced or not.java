// to check whether brackets are balanced in expression



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine().trim();
        if(isBalanced(input)){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Unbalanced");
        }
    }
    private static boolean isBalanced(String expr){
        Stack<Character> stack=new Stack<>();
        for(char c:expr.toCharArray()){
            if(c=='('){
                stack.push(c);
            }
            else if (c==')'){
                if(stack.isEmpty())
                    return false;
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
