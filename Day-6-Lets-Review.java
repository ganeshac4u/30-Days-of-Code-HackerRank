import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        String[] s = new String[t];        
        
        for(int i=0;i<t;i++)
        {
            s[i] = scan.nextLine();
            char[] c = s[i].toCharArray();
            StringBuilder s1 = new StringBuilder();
            StringBuilder s2 = new StringBuilder();
            for(int k=0;k<s[i].length();k++)
            {                
                if(k%2==0)
                    s1.append(c[k]);
                else
                    s2.append(c[k]);                
            }            
            System.out.println(s1.toString()+" "+s2);
        } 
        scan.close();        
    }
}