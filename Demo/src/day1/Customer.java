package day1;

public class Customer {
	
	private int custid;
	private String name;
	private int age;
	private String city;
	private int pinCode;
	
	Customer(){
		
	}

	Customer(int id, String nam, int ag, String cty, int pin){
		custid = id;
		name = nam;
		age = ag;
		city = cty;
		pinCode = pin;
	}
	
	public void setName(String nam) {
		name = nam;
	}
	
	public String getName() {
		return(name);
	}
	
	public void printDetails() {
		System.out.println("Customer Id : " + custid);
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("City : " + city);
		System.out.println("Pincode : " + pinCode);
	}

}
