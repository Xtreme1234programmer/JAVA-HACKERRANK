/*
Task:
In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below.

Input format:
There are three lines of input:
The first line contains an integer.
The second line contains a double.
The third line contains a String.
Output format:
There are three lines of output:
On the first line, print "String:" followed by the unaltered String read from stdin.
On the second line, print "Double:" followed by the unaltered double read from stdin.
On the third line, print "Int:" followed by the unaltered integer read from stdin.
Sample Input:
43
3.14
Welcome to the network.

Sample Output:
String: Welcome to the network.
Double: 3.14
Int: 43

Quick Bits:
Stdin: Standard Input
Stdout: Standard Output
Imports: java.util.*; (or) java.util.Scanner;

Program:
*/
import java.util.Scanner;

public class  Javastdinstdout2{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d=scan.nextDouble();
        String j=scan.nextLine();
        String s=scan.nextLine();
        scan.close();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

 