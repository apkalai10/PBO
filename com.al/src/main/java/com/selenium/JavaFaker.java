package com.selenium;

import java.util.Locale;

import com.github.javafaker.Faker;

public class JavaFaker {

	public static void main(String[] args) {
	Locale local = new Locale("en-IND");
		
		Faker fake = new Faker(local);
		
		fake.name().fullName();
		fake.name().prefix();
		fake.name().bloodGroup();
		fake.name().firstName();
		fake.name().lastName();
		fake.name().nameWithMiddle();
		fake.name().suffix();
		fake.name().username();
		
		
		
		System.out.println(fake.address().cityName());
		System.out.println(fake.company().bs());
		System.out.println(fake.phoneNumber().phoneNumber());
		System.out.println(fake.country().currency());

	}

}
