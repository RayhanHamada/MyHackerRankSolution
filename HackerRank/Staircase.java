// link to the problem : https://www.hackerrank.com/challenges/staircase/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        
        for (int i = n; i > 0; i--)
        {
            for (int j = i-1; j > 0; j--)
            {
                System.out.print(" ");    
            }
      
            for (int k = 0; k < n-i+1; k++)
            {
                System.out.print("#");
            }
      
            if (i > 0)
            {
                System.out.print("\n");
            }else
            {
                System.out.print("");
            }
        }   
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
