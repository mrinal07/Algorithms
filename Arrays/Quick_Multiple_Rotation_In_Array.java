package com.DSA.Data_Structures.Arrays;

public class Quick_Multiple_Rotation_In_Array 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,6};
		int len = arr.length;
		
		 int arr2[] = {1, 3, 5, 7, 9};
		 len = arr2.length;
		
			System.out.print("Original Array=>\n");
		    for(int i=0 ; i<len ; i++)
			     System.out.print(arr2[i]+" ");
		    
		    System.out.println();
		    
		    int k2=5;
			rightRotate(arr2,k2,len);
//			int k=2;
//			leftRotate(arr,k,len);//			
//			k2=3;
//			rightRotate(arr2,k2,len);
//			k=3;
//			leftRotate(arr,k,len);
//			k2=4;
//			rightRotate(arr2,k2,len);
	}
	private static void rightRotate(int[] arr, int k, int len) 
	{
		if(k>len-1)
		k = k%len;
		
		int ktemp1=len-k;
		ktemp1 = ktemp1 %len;
		int ktemp2 = ktemp1;
		int j=0;
		for(int i = len-1 ; i >=0 ; i--)
		{
			if( ktemp1 < len )
			   System.out.print(arr[ktemp1++]+" ");
			else if( j < ktemp2 )
				System.out.print(arr[j++]+" ");
		}						
		
		System.out.println();
	}
	private static void leftRotate(int[] arr, int k, int len) 
	{
		for(int i=k ; i<len+k ; i++)
			System.out.print(arr[i%len]+" ");
		
		/*                                                OTHER METHOD
		    for(int i=0 ; i<len ; i++)
			System.out.print(arr[(i+k)%len]+" ");
		 */
		
		System.out.println("");
	}
}
