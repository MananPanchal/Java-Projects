package day1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void mulTable(int n) {
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(n + " * " + i + " = " + n*i);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int num;
		
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		mulTable(num);

	}

}
