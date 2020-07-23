package com.DSA.Data_Structures.Arrays;

import java.util.HashSet;

public class SumPair_In_Array 
{
	public static void main(String[] args) 
	{
		int A[] = { 1, 4, 45, 6, 10, 8 }; 
        int n = 16; 
        printpairs(A, n);  		
	}
	private static void printpairs(int[] a, int n) 
	{
		HashSet<Integer> s = new HashSet<Integer>();
		
		for(int i=0 ; i<a.length ; i++)
		{
			int temp = n - a[i];
			if(s.contains(temp))
			{
				System.out.println("Found pair "+a[i]+" & "+temp);				
			}
			else
			{
				s.add(a[i]);
			}
			
		}
		
	}
}
