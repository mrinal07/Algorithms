package com.DSA.Data_Structures.Arrays;

public class Reverse_Array_2
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("ORIGINAL ARRAY=>");
		for(int i=0 ; i<arr.length ; i++)
			System.out.print(arr[i]+" ");
		System.out.println(" ");
		
		iterative_reverse(arr);
		
		System.out.println("ITERATIVE APPROACH=>");
		for(int i=0 ; i<arr.length ; i++)
			System.out.print(arr[i]+" ");
		
		System.out.println(" ");
		
		 int arr2[]={1,2,3,4,5,6,7,8,9,10};
		recursive_reverse(arr2,0,arr2.length-1);
		
		System.out.println("RECURSIVE APPROACH=>");
		for(int i=0 ; i<arr2.length ; i++)
			System.out.print(arr2[i]+" ");
	}

	private static void recursive_reverse(int[] arr2,int start , int end)
	{
		if(start>end)
			return;
		else
		{
			int temp = arr2[start];
			arr2[start] = arr2[end];
			arr2[end] = temp;
			recursive_reverse(arr2, start+1, end-1);
		}
		
	}

	private static void iterative_reverse(int[] arr) 
	{
		int start =0 , end =arr.length-1;
		
		while(start < end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}		
	}
}
