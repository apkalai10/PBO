package com.handwork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		//How to find duplicates in Java array
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("-2");
		list.add("3");
		list.add("1");
		list.add("4");
		list.add("-2");
		
        for(int i=0;i<list.size();i++)
        {
        	
        	for (int j=i+1;j<list.size();j++)
        	{
        		
        	     if(list.get(i)==list.get(j))
        	     {
        		System.out.println(list.get(j));
        	     }
        	     else
        	     {
        	    	// System.out.println(list.get(i) +" not equal to "+list.get(j));
        	     }
            }
        	

        }
		/*
		 * //Duplicate elements from array using HashSet data Set<String> set = new
		 * HashSet<String> (); for (String string : list) { if(set.add(string)==false) {
		 * System.out.println(string); } }
		 */
        
        
	}

}
