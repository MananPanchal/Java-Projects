package day1;
import java.util.Scanner;

public class Factorial {
	
	public static int fact(int num) {
		
		if(num < 0) {
			System.out.println("The Number is Negative, So you cant find its Factorial!");
			return 0;
		}
		else if(num == 0)
			return 1;
		else
			return num*fact(num-1);
	}
	
	public static void main(String[] args) {
		
		int res,num;
		
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		res = fact(num);
		if(res!=0)
			System.out.println("Factorial of " + num + " is : " + res);

	}

}
