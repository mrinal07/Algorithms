package com.DSA.Data_Structures.Arrays;

import java.util.Arrays;

public class Large_Three_In_Array 
{
	public static void main(String[] args) 
	{
		int[] arr = {12, 13, 1, 10, 34, 1,13,12,1,1,1,1,333,33};
		int n = arr.length;
		
		largeThree(arr,n);
	}
	private static void largeThree(int[] arr, int n) 
	{		
		Arrays.sort(arr);
		
		int count=0;
		
		System.out.println("Three large elements => ");
		for(int i=n-1 ; i>=0 ; i--)
		{
			if(count < 3 && arr[i] != arr[i-1])
			{
				count++;
				System.out.print(arr[i]+" ");
			}
		}		
	}
}
