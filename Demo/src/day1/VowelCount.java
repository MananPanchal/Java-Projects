package day1;

import java.util.Scanner;

public class VowelCount {
	
	public static int countVowels(String str) {
		
		int count=0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
				count++;
			
		}
		
		return count;
	}

	public static void main(String[] args) {
		
		String str, str2;
		int res;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the String : ");
		
		str = sc.nextLine();
		
		str2 = str.toLowerCase();
		
		res = countVowels(str2);
		
		System.out.println("So " + str + " have " + res + " vowels.");

	}

}
