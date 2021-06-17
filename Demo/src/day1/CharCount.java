package day1;

import java.util.Scanner;

public class CharCount {
	
	public static int countChar(String str,char ch) {
		
		int count = 0;
		
		for(int i=0; i < str.length(); i++) {
			
			if(str.charAt(i) == ch) {
				
				count++;
				
			}
			
		}
		return count;
	}

	public static void main(String[] args) {
		
		String str;
		char ch;
		
		System.out.print("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		System.out.print("Enter the character : ");
		ch = sc.next().charAt(0);
		
		System.out.println(countChar(str,ch));
		
	}

}
