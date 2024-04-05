package com.java;

public class BinarySearch {
	
	
	public int LinearSearch(int[] dump, int F)
	{
		for(int i=0;i<dump.length;i++)
		{
			if(dump[i]==F)
			{
				return i;
			}
		}
		return -1;
	}
	
	public int BinarySearchs(int[] dump, int e, int r, int F)
	{
		while(e<=r)
		{
			int mid = (e+r)/2;
			if(dump[mid]==F)
			{
				return mid;
			}
			else if (dump[mid]>F)
			{
				r = mid-1;
			}
			else
			{
				e = mid+1;
			}
		}
		return -1;
		
	}
	
	
	

	public static void main(String[] args) {
		
	int[] array = {23,36,47,58,79,80};
	int L = array.length;
	int r = L-1;
	int e = 0 ;
	
	BinarySearch obj = new BinarySearch();
	System.out.println(obj.LinearSearch(array,47));
	System.out.println(obj.BinarySearchs(array, e, r, 79));
	

	}

}
