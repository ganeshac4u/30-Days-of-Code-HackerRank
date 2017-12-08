import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        String emailRegex = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegex);

        ArrayList<String> names = new ArrayList<String>();

        for(int i=0;i<N;i++)
        {
            String name = in.next();
            String email = in.next();
            Matcher matcher = pattern.matcher(email);

            if(matcher.find())
                names.add(name);
        }

        Collections.sort(names);
        for(String name: names)
            System.out.println(name);
    }

}
