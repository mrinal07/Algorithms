package algorithms.Searching;

import java.util.Arrays;

public class Exponential_Search 
{
	public static void main(String[] args) 
	{
		Exponential_Search es = new Exponential_Search();
		
		int arr[] = {2, 3, 4, 10, 40};
		int len = arr.length;
		int find = 4;
		
		int index = es.exponentialSearch(arr,len,find);
		
		if(index < 0 )
			System.out.println("Not found");
		else
			System.out.println("Found at "+index);
	}
	 int exponentialSearch(int[] arr, int len, int find) 
	 {
		 if(arr[0] == find)
			 return 0;
		 
		 int i=1;		 
		 while( i<len && arr[i] <= find )		 
			 i = i * 2;
		 		 
      return binarySearch(arr,i/2,Math.min(i,len),find);		 	
	}
	 
	  int binarySearch(int[] arr, int start, int end, int find) 
	  {
		  if(start <= end)
		  {
			  int mid = ( (start + end-1 )/2);
			  if(arr[mid] == find)
				  return mid;
			  
			  if(find < arr[mid])
				  binarySearch(arr, start, mid-1, find);
			  if(find > arr[mid])
				  binarySearch(arr, mid+1, end, find);
		  }
		  
		  return -1;
	  }
	
}
