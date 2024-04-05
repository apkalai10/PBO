package com.java;

import java.util.Arrays;

public class LinearSearch {
	
	public void BubbleSort(int[] dump)
	{
		int temp;
		for(int i =0;i<dump.length;i++)
		{
			for(int j=0;j<dump.length-1;j++)
			{
				if(dump[j]>dump[j+1])
				{
					temp = dump[j];
					dump[j] = dump[j+1];
					dump[j+1]=temp;
				}
			}
		}
		
		
		
		
		
	}

	
	
	
	



	public static void main(String[] args) {
		LinearSearch LS = new LinearSearch();
		int[] num = {1,-1,2,5,0,3,-2};
		LS.BubbleSort(num);
		System.out.println(Arrays.toString(num));
		
		

	}

}
