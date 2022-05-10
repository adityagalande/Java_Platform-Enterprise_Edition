package com.test.vehicle;

import com.automobile.fourwheeler.Ford;
import com.automobile.fourwheeler.Logan;
import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class Test {

	public static void main(String[] args) {
		
		Hero hero = new Hero("Hero i-smart 110 2s", "MP65MD5060", "Ranveer Singh", 90);
		System.out.println(hero.getModelName());
		System.out.println(hero.getRegistrationNumber());
		System.out.println(hero.getOwnerName());
		System.out.println(hero.getSpeed());
		hero.radio();
		
		System.out.println("------------------------------------------------------------");
		
		Honda honda = new Honda("Honda CB Hornet 160R", "M15FZ5101", "Arijeet Singh", 110);
		System.out.println(honda.getModelName());
		System.out.println(honda.getRegistrationNumber());
		System.out.println(honda.getOwnerName());
		System.out.println(honda.getSpeed());
		honda.radio();
		
		System.out.println("------------------------------------------------------------");
		
		Logan logan = new Logan("Mahindra Logan", "M15FD5103", "Udhaam Singh", 180);
		System.out.println(logan.getModelName());
		System.out.println(logan.getRegistrationNumber());
		System.out.println(logan.getOwnerName());
		System.out.println(logan.getSpeed());
		logan.gps();

		System.out.println("------------------------------------------------------------");
		
		Ford ford = new Ford("Ford Ecosport", "MP68MC6060", "KJS Singh", 170);
		System.out.println(ford.getModelName());
		System.out.println(ford.getRegistrationNumber());
		System.out.println(ford.getOwnerName());
		System.out.println(ford.getSpeed());
		ford.tempControl();
	}

}
