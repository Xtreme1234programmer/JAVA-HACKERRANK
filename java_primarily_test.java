import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Solution11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger num=sc.nextBigInteger();
        boolean b=num.isProbablePrime(10);
        if(b==true)
        {
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
          sc.close();
    }
  
}