/*
 * 	Author : manan.panchal.stltech.in
 * 	Date of Creation : 8th June, 2021
 * 	Version : 1.8
 * 	Copyright : Sterlite Technologies Ltd.
 */


package day1;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean checkPalindrome(String str) {
		
		String ans = "";
		
		for(int i=str.length()-1; i >= 0; i--) {
			
			ans = ans + str.charAt(i);
			
		}
		
		if(ans.contains(str)) 
			return true;
		else
			return false;
		
	}

	public static void main(String[] args) {
			
		String str;
		boolean flag;
		
		System.out.print("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		flag = checkPalindrome(str);
		
		if(flag)
			System.out.print("So " + "'" + str + "'" + " is a Palindrome!");
		else
			System.out.print("So " + str + " is not a Palindrome!");

	}

}
