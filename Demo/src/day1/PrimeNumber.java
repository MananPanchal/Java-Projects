package day1;
import java.util.Scanner;

public class PrimeNumber {

	public static String prime(int num) {
		
		if(num == 1) {
			return(num+ " is neither prime nor not prime.");
		}
		boolean flag = false;
		for(int i=2; i<=num/2; i++) {
			if(num%i == 0) {
				flag = true;
				break;
			}
		}
		
		if(!flag)
			return(num+ " is a Prime Number!");
		else
			return(num+ " is not a Prime Number!");
	}
	
	
	public static void main(String[] args) {
		
		int num;
		
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		System.out.println(prime(num));
		
	}

}
