import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String rev = "";
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            rev = ch + rev;
        }
        if (s1.compareTo(rev) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
