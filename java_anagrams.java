/*
 Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description
Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a : the first string
string b : the second string
Returns
boolean: If a and b are case-insensitive anagrams, return true. Otherwise, return false.

Input Format
The first line contains a string a.
The second line contains a string b.

Constraints
1 <= length(a), length(b) <= 50
Strings a and b consists of English alphabetic characters.
The comparison should NOT be case sensitive.
Sample Input 0
 anagram
 margana
Sample Output 0
 Anagrams
 */
import java.io.*;
import java.util.*;
class Solution{

   static boolean isAnagram(String string1, String string2) {
    if (string1.length() != string2.length()) {
        return false;
    }
    char[] a1 = string1.toLowerCase().toCharArray();
    char[] a2 = string2.toLowerCase().toCharArray();
    Arrays.sort(a1);
    Arrays.sort(a2);
    return Arrays.equals(a1, a2);
}

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
