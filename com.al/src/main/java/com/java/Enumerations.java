package com.java;

enum status
{
	ONE,
	TWO,
	THREE
}

public class Enumerations {

	public static void main(String[] args) {
		status sts = status.valueOf("ONE");// The valueOf() method returns the value of given constant enum.
		System.out.println(sts);
		
		for (status s : status.values())//The values() returns an array of all enum constants.
		{
			System.out.println(s);
			
		}

	}

}
