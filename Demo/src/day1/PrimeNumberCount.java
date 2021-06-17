package day1;
import java.util.Scanner;

public class PrimeNumberCount {
	
	public static void primeCount(int count) {
		
		for(int i=2; i<=count; i++) {
			
			int c=0;
			for(int j=1; j<=i; j++) {
				if(i%j == 0) {
					c++;
				}
			}
			
			if(c == 2)
				System.out.print(i + " ");
			
		}
		
	}

	public static void main(String[] args) {
		
		int num;
		
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		primeCount(num);
		
		
	}

}
