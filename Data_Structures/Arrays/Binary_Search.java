package com.DSA.Data_Structures.Arrays;

public class Binary_Search 
{
	public static void main(String[] args) 
	{
		int arr[] = {11,22,33,44,55,66,77,88};
		int n = arr.length;
		int find = 55;
		
//		binarySearch(arr,n,find);
		int ans = binaryRecursiveSearch(arr,0,n-1,find);
		if(ans == -1)
			System.out.println("Not found!");		    
		else			
		    System.out.println("Element is present at "+(ans)+" index");		
	}

	 static int binaryRecursiveSearch(int[] arr, int start, int end, int find) 
	{	
		if(end >= start)
		{			
			int mid = start+(end-start) / 2;
			
			if(arr[mid] == find) return mid;
			
			if(find > arr[mid]) return binaryRecursiveSearch(arr , mid+1 , end , find);
			
			if(find < arr[mid]) return binaryRecursiveSearch(arr , start , mid-1 , find);			
		}
		return -1;
	}	 
	private static void binarySearch(int[] arr, int n, int find) 
	{
		int start=0,end=n-1;
		int mid=0;
		int flag=0;
		while(start <= end)
		{
			mid = start + (end-start) / 2;
			if(arr[mid] == find)
			{
				System.out.println("Found element at "+(mid+1)+" position. ");
				flag=1;
				break;
			}
			if(find > arr[mid])			
			   start = start + 1;			
			if(find < arr[mid])			
				end = end -  1;	
		}
		if(flag == 0)System.out.println("Element not found !");
		
	}
}
