import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        LinkedList<Integer> val = new LinkedList<Integer>();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int v=0;
            for(int a=1;a<=n;a++)
            {
                for(int b=1;b<=n;b++)
                {   
                    if(a<b)
                    {
                        int tmp = a & b; 
                        if(tmp>v && tmp <k)
                            v = tmp;
                    }
                }
                
            }
            val.add(v);
        }
            for(Integer a : val)
            {
                System.out.println(a);
            }
               
    }
}
