package com.DSA.Data_Structures.Arrays;

import java.util.HashSet;

public class Replace_with_indexes
{
	public static void main(String[] args) 
	{
		int arr[] = {-1, -1, 6, 1,9, 3, 2, -1, 4,-1};
		arrange(arr);
	}
	private static void arrange(int[] arr) 
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0 ; i<arr.length ; i++)
			 hs.add(arr[i]);
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(hs.contains(i)) System.out.print(i+" ");
			else System.out.print(-1+" ");
		}
		
	}
}
