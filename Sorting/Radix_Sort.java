package algorithms.Sorting;

import java.util.Arrays;

public class Radix_Sort 
{
	public static void main(String[] args) 
	{
		Radix_Sort ob = new Radix_Sort(); 
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};
        
          printArray(arr);			
          ob.sort(arr);
        
          System.out.println("Sorted array");
          printArray(arr);		
	}

	private void sort(int[] arr) 
	{
		int max = Arrays.stream(arr).max().getAsInt();
		
		for(int i=1 ; max/i > 0 ; i=i*10) // every loop increment in multi of 10 to get place values		
			countSort(arr,i);
	}

	private void countSort(int[] arr, int exp) 
	{
		int len = arr.length;
		int countArray[] = new int[10];
		int output[] = new int[len];
		
		for(int i=0 ; i<len ; i++)
			++countArray[ (arr[ i ]/exp)%10 ];
		
		for(int i=1 ; i<10 ; i++)
			countArray[i] += countArray[i-1];
		
		for(int i=len-1 ; i>=0 ; i--)
		{
			output[ countArray[ (arr[i]/exp)%10 ]-1  ] = arr[i];
			countArray[ (arr[i]/exp)%10 ]--;
		}
		for(int i=0 ; i<len ; i++)
			arr[i] = output[i];
	}

	private static void printArray(int[] arr) 
	{
		for(int i=0 ; i<arr.length ; i++)
			System.out.print(arr[i]+" ");
		
			System.out.println();			
	}	
}
