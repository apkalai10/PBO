package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ArrayUtils;

public class JavaList {

	public static void main(String[] args) {
  
		int[] num = {17,12,20,8,-17,10};
		String[] alpha = {"C","A","E","B","D"};
		
		List<String> alphalist = new ArrayList<String>(List.of(alpha));
		System.out.println(alphalist); // java9
		
		List<String> alphalist1 = new ArrayList<String>(Arrays.asList(alpha));
		System.out.println(alphalist1); // java 8 Stream
		
		ArrayList<String> alphalist2 = new ArrayList<String>();
		Collections.addAll(alphalist2, alpha);
		System.out.println(alphalist2); //collections
		
		List<String> alphalist3 = new ArrayList<String>();
		for(int i=0;i<alpha.length;i++)
		{
			alphalist3.add(alpha[i]);
		}
		System.out.println(alphalist3);
		
		List<Integer> numlist = new ArrayList<Integer>(Arrays.stream(num).boxed().collect(Collectors.toList()));
		System.out.println(numlist);
		
		Integer[] intlist = ArrayUtils.toObject(num);
		List<Integer> numlist1 = new ArrayList<Integer>(Arrays.asList(intlist));
		System.out.println(numlist1);
		
		
		//--------------------------------------------------------------------------//
		
	    List<String> days = new ArrayList<String>();
		days.add("SUN");
		days.add("SAT");
		days.add("MON");
		days.add("TUE");
		days.add("THU");
		days.add("WED");
		days.add("FRI");
		
		String[] daysarray = new String[days.size()];
		daysarray = days.toArray(daysarray);
		System.out.println(Arrays.toString(daysarray));
		
		
	}

}

