package day1;

import java.util.Scanner;

public class ArmstrongNumberCount {
	
	public static void armstrongCount(int num) {
		
		int nb=-1, rem, res, OriginNb;
		
		while(num != 0) {
			
			nb++;
			OriginNb = nb;
			res = 0;
			
			while(nb != 0) {
				
				rem = nb % 10;
				res += rem * rem * rem;
				nb /= 10;
				
			}
			
			if(res == OriginNb) {
				
				System.out.print(OriginNb + " ");
				num--;
				
			}					
				
			nb = OriginNb;
			
		}	
	}

	public static void main(String[] args) {
		
		int num;
		
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
			
		armstrongCount(num);
			
	}
}
