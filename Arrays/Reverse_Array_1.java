package com.DSA.Data_Structures.Arrays;

public class Reverse_Array_1 
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5,6,7,8,9};
		reverse(arr);
	}
	private static void reverse(int[] arr) 
	{
		int len = arr.length-1;
		for(int i=0 ; i<arr.length/2 ; i++)
		{
			int temp = arr[i];
			arr[i] = arr[len];
			arr[len--] = temp;						
		}
		
		for(int i=0 ; i<arr.length ; i++)
		System.out.print(arr[i]+" ");
		
	}

}
