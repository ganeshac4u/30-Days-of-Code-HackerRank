import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        LinkedList<String> pList = new LinkedList<String>();
        for(int i=0;i<n;i++)
        {
            int p = scan.nextInt();
            String pCheck="Prime";
            if(p==1)
                pCheck = "Not prime";
            else{
            for(int j=2;j<=Math.sqrt(p);j++)
            {
                if(p%j==0)
                {
                pCheck = "Not prime";
                break;
                }
            }
                }
            pList.add(pCheck);
        }
        for(String s:pList)
        {
            System.out.println(s);
        }
    }
}
/*

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int total = scanner.nextInt();
        int next = 0;
        boolean isPrime = true;
    
        for (int i=0; i<total; i++){
            next = scanner.nextInt();
            
            if (next <= 1) {
                System.out.println("Not prime");
            } else {
               isPrime = true;
            
                for (int j=2; j<Math.sqrt(next); j++){
                    if (next%j == 0){
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Not prime");
                } 
            }
        }
        scanner.close();
    }
}*/
