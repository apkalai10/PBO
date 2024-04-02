package com.java;

public class MethodOverriding extends MethodOverloading{
	
	public int mark(int T,int E)
	{
		return T/E;
	}
	
	 public static void ap ()
	{
		System.out.println("Arun");
	}

	public static void main(String[] args) {
		MethodOverriding obj1 = new MethodOverriding();
		System.out.println(obj1.mark(100, 100));
		obj1.ap();

	}

}
