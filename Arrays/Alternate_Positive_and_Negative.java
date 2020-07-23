package com.DSA.Data_Structures.Arrays;

public class Alternate_Positive_and_Negative 
{
	public static void main(String[] args) 
	{
		int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
		
		System.out.println("Original Array=> ");
		for(int j=0 ; j<arr.length ; j++)
			System.out.print(arr[j]+" ");
		
		arrange(arr,arr.length);
		
		System.out.println();
		
		System.out.println("Alternate Array=> ");
		for(int j=0 ; j<arr.length ; j++)
			System.out.print(arr[j]+" ");
	}
	private static void arrange(int[] arr, int length) 
	{
		int i=-1,temp=0;
		
		for(int j=0 ; j<length ; j++)
		{
			if(arr[j] < 0)
			{
				i++;
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}			
		}
		
		int neg = 0,pos = i+1;
		
		while(pos<length && neg<pos && arr[neg] < 0)
		{			
			temp = arr[pos];
			arr[pos] = arr[neg];
			arr[neg] = temp;
			neg+=2;
			pos++;
		}		
	}

}
