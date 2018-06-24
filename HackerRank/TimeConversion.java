// link to the problem : https://www.hackerrank.com/challenges/time-conversion/problem

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        
        char[] arr = s.toCharArray();
		int hh,mm,ss;
		hh = Integer.parseInt(Character.toString(arr[0]) + Character.toString(arr[1]));
		mm = Integer.parseInt(Character.toString(arr[3]) + Character.toString(arr[4]));
		ss = Integer.parseInt(Character.toString(arr[6]) + Character.toString(arr[7]));
        
        if (arr[8] == 'A')
		{
			if (hh == 12)
			{
				return "00:" + ((mm < 10)? "0" + Integer.toString(mm):Integer.toString(mm)) + ":" + ((ss < 10)? "0" + Integer.toString(ss):Integer.toString(ss));
			} else 
			{
				return ((hh < 10 && hh != 0)? "0" + Integer.toString(hh):Integer.toString(hh))  + ":" +  ((mm < 10)? "0" + Integer.toString(mm):Integer.toString(mm)) + ":" + ((ss < 10)? "0" + Integer.toString(ss):Integer.toString(ss));
			}
		} else if (arr[8] == 'P')
		{
			if (hh == 12)
			{
				return ((hh < 10 && hh != 0)? "0" + Integer.toString(hh):Integer.toString(hh)) + ":" + ((mm < 10)? "0" + Integer.toString(mm):Integer.toString(mm)) + ":" + ((ss < 10)? "0" + Integer.toString(ss):Integer.toString(ss));
			} else
			{
				return Integer.toString(hh+12) + ":" + ((mm < 10)? "0" + Integer.toString(mm):Integer.toString(mm)) + ":" + ((ss < 10)? "0" + Integer.toString(ss):Integer.toString(ss));
			}
		}
		
		return null;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
