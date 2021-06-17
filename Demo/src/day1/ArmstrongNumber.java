package day1;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void armstrong(int num) {
		
		int OriginNb, rem, res = 0;
		
		OriginNb = num;
		
		while(OriginNb != 0) {
			
			rem = OriginNb % 10;
			res += rem * rem * rem;
			OriginNb /= 10;
			
		}
		
		if(res == num)
			System.out.println(num + " is an Armstrong Number!");
		else
			System.out.println(num + " is not an Armstrong Number!");
		
	}

	public static void main(String[] args) {
		
		int num;
		
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		armstrong(num);

	}

}
