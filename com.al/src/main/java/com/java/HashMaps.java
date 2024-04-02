package com.java;

import java.util.HashMap;

import org.testng.annotations.Test;

public class HashMaps {

	
	@Test
	public void data()
	{
		
		HashMap<String, String> data = new HashMap<String, String>();
		data.put("TN", "Tamilnadu");
		data.put("KL", "Kerala");
		data.put("AP", "Andhra Pradesh");
		System.out.println(data);
		System.out.println(data.size());
		
		
	}

}
