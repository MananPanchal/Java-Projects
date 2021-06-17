package day1;

import myPack.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.setName("John Doe");
		System.out.println(c1.getName());
		
		System.out.println();
		
		Customer c2 = new Customer(3, "John", 22, "Ahmd", 38001);
		c2.printDetails();
		
	}

}
