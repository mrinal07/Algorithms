package com.DSA.Data_Structures.Arrays;

public class Array_Rotation_Juggling 
{
	public static void main(String[] args) 
	{
				int arr1[] = {1,2,3,4,5,6,7,8,9,10};
				int arr2[] = {1,2,3,4,5,6,7,8,9,10};
				int n = arr1.length;
				int k=3;								
					
				System.out.println("ORIGINAL ARRAY=>");
				for(int i=0 ; i<n ; i++)				
					System.out.print(arr1[i]+" ");
				System.out.println(" ");
				leftRotate(arr1, k, n);								
				rightRotate(arr2, k, n);
	}
	static void leftRotate(int arr[] , int k , int n)
	{
		int GCD = gcd(k,n);
		
		int temp,j,d;
		
		for(int i=0 ; i<GCD ; i++)
		{			
			temp = arr[i];
			j = i;
			while(true)
			{
				d = (j+k)%n;
				
				if(d==i)break;
				
				arr[j] = arr[d];				
				j=d;
			}
			arr[j] = temp;
		}
		System.out.println("LEFT ROTATE by "+k+" =>");
		for(int i=0 ; i<n ; i++)				
			System.out.print(arr[i]+" ");
		
		System.out.println(" ");
	}
	static void rightRotate(int arr[] , int k , int n)
	{
		int GCD = gcd(k,n);
		int d,j1,j2,temp1,temp2;
		
		for(int i=0 ; i<GCD ; i++)
		{
			j1=i;d=i;
			temp1 = arr[i];
			while(true)			
			{
				j2 = (j1+k) %n;
				temp2 = arr[j2];
				arr[j2] = temp1;
				temp1 = temp2;
				j1 = j2;
				if(j2==d)break;
			}			
		}
		System.out.println("RIGHT ROTATE by "+k+" =>");
		for(int i=0 ; i<n ; i++)				
			System.out.print(arr[i]+" ");
	}	
	static int gcd(int a , int b)
	{
		if(b==0) return a;		
		else return gcd(b,a%b);
	}	
}
