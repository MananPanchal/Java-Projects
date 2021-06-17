package day1;

import java.util.Scanner;

public class StringReverse {
	
	public static String reverse(String str) {
		
		if(str == null) {
			return str;
		}
		
		String ans = "";
		
		for(int i=str.length()-1; i >= 0; i--) {
			
			ans = ans + str.charAt(i);
			
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		
		String str;
		
		System.out.print("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		System.out.println(reverse(str));

	}

}
