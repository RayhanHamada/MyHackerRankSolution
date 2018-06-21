// link to the problem : https://www.hackerrank.com/challenges/plus-minus/problem?h_r=next-challenge&h_v=zen

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        float[] count = new float [3]; // inisiasi array float dgn size 3
        
        for (int a : arr){
            
            if (a < 0)
                count[1]++;
            else if (a > 0)
                count[0]++;
            else
                count[2]++;
        }
        
        for (float i : count) System.out.println(i/arr.length);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
