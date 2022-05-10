package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle{
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	
	public Honda(String modelName, String registrationNumber, String ownerName, int speed){
		this.modelName=modelName;
		this.registrationNumber=registrationNumber;
		this.ownerName=ownerName;
		this.speed=speed;
	}
	
	
	
	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return this.modelName;
	}



	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return this.registrationNumber;
	}



	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return this.ownerName;
	}



	public int getSpeed() {
		return this.speed;
	}

	
	
	public void radio() {
		System.out.println("Yes");
	}

}
