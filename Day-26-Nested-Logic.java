import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);
        int aDate = scanner.nextInt();
        int aMonth = scanner.nextInt();
        int aYear = scanner.nextInt();

        int eDate = scanner.nextInt();
        int eMonth = scanner.nextInt();
        int eYear = scanner.nextInt();

        int fine = 0;
        if(aYear > eYear)
            fine = 10000;
        else if(aYear == eYear)
        {
            if(aMonth > eMonth)
            fine = 500 * (aMonth-eMonth);
            else if(aMonth == eMonth)
            {
                if (aDate > eDate)
                    fine = 15 * (aDate - eDate);
            }
        }
        System.out.println(fine);
    }
}
