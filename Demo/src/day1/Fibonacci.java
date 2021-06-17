package day1;

import java.util.Scanner;

public class Fibonacci {
	
	public static void fibo(int terms) {
		
		int First=0, Second=1, i=1;
		
		while(i <= terms) {
			
			System.out.print(First + " ");
			
			int Next = First + Second;
			First = Second;
			Second = Next;
			
			i++;
		}
	}

	public static void main(String[] args) {
		
		int num;
		
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		fibo(num);

	}

}
