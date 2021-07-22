/*
 *	Author : manan.panchal@stltech.in
 *	Version : 1.0
 *	Creation Time : 12th July, 2021
 *	Copyright : Sterlite Technologies Ltd.
 */


package com.phoenix.vehicles;

import com.phoenix.annotations.CopyrightInfo;

@CopyrightInfo(copyright = "Sterlite", author = "manan.panchal@stltech.in")
public class Car {
	
	private int id;
	
	@CopyrightInfo(author = "manan.panchal@stltech.in", version = 2.0)
	private String model;
	private float price;
	
	public static int count;
	
	public Car() {
		count++;
	}
		
	public Car(int id, String model, float price) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
		count++;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", price=" + price + "]";
	}

	// Overriding equals method of Object Class
	public boolean equals(Object ob) {
		
		if(ob instanceof Car) {
			Car car = (Car) ob;
			if(this.id == car.id && 
					this.model.equals(car.model) &&
						this.price == car.price)
				return true;
		}
		return false;
	}
	
	// Overriding hashCode method of Object Class
	public int hashCode() {
		
		return id + model.hashCode() + (int)price;
		
	}

}
