//to display the following pattern.

****
****
****
****

  import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        int row,col;
        int n=cs.nextInt();
        for(row=1;row<=n;row++){
            for(col=1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
