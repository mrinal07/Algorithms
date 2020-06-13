package com.DSA.Data_Structures.Arrays;

public class BinarySearch_RotateArray 
{
	public static void main(String[] args) 
	{
		int arr[] = {3,4,5,6,7,8,1,2};
		int key = 2;
		int n = arr.length;
		
		int result = find(arr,0,n-1,key);
		
		System.out.println("index"+result);				
	}
	private static int find(int[] arr, int start, int end, int key) 
	{	
		if(start > end) 
			return -1;
		
		int mid = (start+end) / 2;
			
		if(key == arr[mid] ) 
			return mid;
		
		if(arr[start] <= arr[mid] ) // ie first half is sorted
		{
			if(key >= arr[start] && key <= arr[mid] )			
				return find(arr,start,mid-1,key);			
			else
				return find(arr,mid+1,end,key);			
		}
		else // if first half is not sorted then second half is must sorted!!!!
		{
			if(key >= arr[mid] && key <= arr[end] )			
				return find(arr,mid+1,end,key);			
			else
				return find(arr,start,mid-1,key);			
		}
	}
}
