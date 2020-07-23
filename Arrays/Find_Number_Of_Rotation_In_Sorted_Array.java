package com.DSA.Data_Structures.Arrays;

public class Find_Number_Of_Rotation_In_Sorted_Array 
{
	public static void main(String[] args) 
	{
		int arr[]={8,7,6,5,1,2,3,4};
		int result = find(arr,0,(arr.length-1) );
		System.out.println(result);
	}
	private static int find(int[] arr, int start, int end) 
	{
		if (end < start) return 0;
		
		if(start == end) return start;
		
		int mid = (start+end) / 2;
		
		if(arr[mid+1] < arr[mid]) return mid+1;
		
		if(arr[mid-1] > arr[mid]) return mid;
		
		if(arr[mid] < arr[end]) return find(arr,start,mid-1);
		
		else return find(arr,mid+1,end);		
		
	}
}
