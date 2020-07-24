package algorithms.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

/*Counting sort is a sorting technique based on keys between
 *a specific range. It works by counting the number of objects
 *having distinct key values (kind of hashing). Then doing some
 *arithmetic to calculate the position of each object in the output sequence.*/

public class Counting_Sort 
{
	public static void main(String[] args) 
	{
		Counting_Sort ob = new Counting_Sort();
		
        //for positive numbers
		
        /*int arr[] = {8,7,9,3,4,1,5,8,4,2,11,12,100};       
        ob.printArray(arr);			
        ob.sortPos(arr);*/        
        
        // for negative numbers with pos/neg
		
        int arr[] = {-5, -10, 0, -3, 8, 5, -1, 10};
        ob.printArray(arr);
        ob.sortNegWithPos(arr);
        
	}
	
	private void sortPos(int[] arr) 
	{	
		int max = Arrays.stream(arr).max().getAsInt();		
			
		int countArray[] = new int[ max+1 ];
		
		for(int i=0 ; i<arr.length ; i++) // increment count for each pos element
			++countArray[ arr[i] ];
		
		for(int i=1 ; i<countArray.length ; i++)// sum of previous with current
			countArray[i] += countArray[i-1];
		
		int new_arr[] = new int[ arr.length ];
		
		for( int i=new_arr.length-1 ; i>=0 ; i-- )
		{
			new_arr[ countArray[ arr[ i ] ]-1   ] = arr[i];// fetching from countArray => new_array
			--countArray[ arr[i] ]; 
		}				
		System.out.println("Sorted array");
		printArray(new_arr);
	}

	private void sortNegWithPos(int[] arr) 
	{
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		
		int range = max-min+1; // range from -10 to 10 including 0 ie = 21 size()
		
		int countArray[] = new int[range]; // 21 size		
		
		/*subtract each element with minimum element from array
         ex:- arr[0] = -5 & min = -10
         subtract arr[0] - min = -5 - (-10) = 10 (th index now here you put 
         the sub number....repeat this process for all)*/
		
		for(int i=0 ; i<arr.length ; i++)// imp logic
			countArray[ arr[i] - min ]++; 
		
		for(int i=1 ; i<countArray.length ; i++) // sum of previous with current
			countArray[i] += countArray[i-1];
		
		int new_arr[] = new int[ arr.length ]; 
		
		for(int i=arr.length-1 ; i>=0 ; i--)  // fetching from countArray => new_array
		{
			new_arr[ countArray[ arr[i] - min ] -1 ] = arr[i]; 
			countArray[ arr[i]-min ]--;
		}
        System.out.println("Sorted array");
		printArray(new_arr);
		
	}

	private void printArray(int[] arr) 
	{
		for(int i=0 ; i<arr.length ; i++)
			System.out.print(arr[i]+" ");
		
			System.out.println();		
	}
	
}
