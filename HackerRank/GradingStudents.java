// link to the problem : https://www.hackerrank.com/challenges/grading/problem

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    
	static final Scanner scan = new Scanner(System.in);
    
	static int[] gradingStudent(int[] grades)
	{
		for (int i = 0; i < grades.length; i++)
		{
			if (grades[i] > 37 && grades[i] != 100) grades[i] = grades[i] + ((grades[i]%5 >= 3)? (5 - (grades[i]%5)) : 0);
			else grades[i] = grades[i];
		}
		return grades;
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[Integer.parseInt(scan.nextLine().trim())];
		for (int i = 0; i < arr.length; i++)
			arr[i] = Integer.parseInt(scan.nextLine().trim());	
		for (int i : gradingStudent(arr))
			System.out.println(i);
	}
}
