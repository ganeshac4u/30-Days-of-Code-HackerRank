import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String bin = Integer.toBinaryString(n);
        
        
        String[] arrOfBin = bin.split("0",0);
        int longSeq = 0;
        for(String s : arrOfBin)
        {
            longSeq = (s.length()>longSeq)?s.length():longSeq;
        }
        System.out.println(longSeq);
    }
}
