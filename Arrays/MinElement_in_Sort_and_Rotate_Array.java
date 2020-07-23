package com.DSA.Data_Structures.Arrays;

public class MinElement_in_Sort_and_Rotate_Array 
{
	public static void main(String[] args) 
	{
		int arr [] ={3, 4, 5, 1, 2};
		int n = arr.length;
		
		int result = findMin(arr,0,n-1);
		
		System.out.println(result);
				
	}

	private static int findMin(int[] arr, int start, int end) 
	{
		int mid = (start+end) / 2 ;
		
		if(start > end)
			return arr[0];
		
		if(start == end) return arr[start];
		
		if(arr[mid] > arr[mid+1])
			return arr[mid+1];
		
		if( arr[mid] < arr[mid-1])
			return arr[mid];
		
		if(arr[mid] < arr[end])
			return findMin(arr, start,mid-1);
		else
			return findMin(arr, mid+1,end);
		
	}
}
