package com.DSA.Data_Structures.Arrays;

public class Reversal_Array_Rotation 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,6,7};
		int k=8;
		int n = arr.length;
		k=k%n;
	// when value of k is greater than size of an array ,then using modulo we can iterate back to zero		
		reversal( arr , 0 , k-1 );
		reversal( arr , k , n-1 );
		reversal( arr , 0 , n-1 );
		
		for(int i=0 ; i<n; i++)
			System.out.print(arr[i]);
	}
	
	private static void reversal(int[] arr, int start, int end) 
	{		
		int temp=0;
		while(start < end)
		{
			temp = arr[start];			
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}	
}
