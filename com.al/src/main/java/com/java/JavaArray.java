package com.java;

import java.util.Arrays;

public class JavaArray {
	
	
	public static void main(String[] args) {
	 
		
		//Arrays are used to store multiple values in a single variable
		 byte data[] = new byte[4];
		 data[0]=1;
		 data[1]=2;
		 data[2]=3;
		 System.out.println("Byte "+Arrays.toString(data));
		 short[] data1 = new short[3];
		 data1[0]=12;
		 data1[1]=23;
		 data1[2]=26;
		 //data1[3]=45; //ArrayIndexOutOfBoundsException
		 System.out.println("Short "+Arrays.toString(data1));
		 
		 int[] data2 = {30, 40, 20, 10};
		 System.out.println("Int "+Arrays.toString(data2));
		 
		 long[] data3 = {3000, 405678, 2012345, 106589};
		 System.out.println("Long "+Arrays.toString(data3));
		 
		 float[] amount = {12.65f,34.66f,87.34f};
		 System.out.println("Float "+Arrays.toString(amount));
		 
		 double[] amount1 = {150.76,125.34};
		 System.out.println("Double "+Arrays.toString(amount1));
		 
		 char[] initial = {'A','E'};
		 System.out.println("Char "+Arrays.toString(initial));
		
		 boolean[] status = {true,false,true};
		 System.out.println("Boolean "+Arrays.toString(status));
		 
		 String[] color = {"Red","Black","Orange"};
		 System.out.println("String "+Arrays.toString(color)); //// to print an array
		
		

		//1.Access the Elements of an Array
		System.out.println("Access a specific Element of an Array "+color[2]);
		
		//2.Change an Array Element
		color[2]="Blue";
		System.out.println("Change an Array Element "+Arrays.toString(color));
		
		//3.Array Length
		System.out.println("Fetch Array's Length "+color.length);
		
		//4.Clone
		String[] color2 = color.clone();
		System.out.println("Clone "+Arrays.toString(color2));
		
		
		//Loop Through an Array
		System.out.println("Return array's element using for loop");
		for (int i=0;i<color.length;i++)
		{
			System.out.println(color[i]);
		}
		
		System.out.println("Return array's element using for each");
		for (String colorone : color) {
			System.out.println(colorone);
		}
		
		//Adding an element in an array
		 int n = color.length;
		 String[] newArray = new String [n+1];
		 for(int x=0;x<n;x++)
		  {
			  newArray[x] = color[x];
		  }
		 newArray[n] ="Green";
		 System.out.println("Adding an element in an array "+Arrays.toString(newArray));
		 
		
		//---------------------------Two-dimensional array,-----------------------------------------//
		
		String[][] days= {{"MON","TUE","WED"},{"THU","FRI","SAT","SUN"}};
		//Access the Elements of a multidimensional array
		System.out.println(days[1][3]);
		
		//Change a multidimensional array element
		days[1][3] = null;
		
		// to print a multidimensional array
		System.out.println(Arrays.deepToString(days));
		
	
		
		//Loop Through a Multi-Dimensional Array
	    for(int a=0;a<days.length;a++)
	     {
		  for(int b=0;b<days[a].length;b++)
		  {
			  System.out.println(days[a][b]);
		  }
	     }
		
	
	 
	}

}
