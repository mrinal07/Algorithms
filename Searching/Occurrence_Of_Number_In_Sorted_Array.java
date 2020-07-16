package algorithms.Searching;
//  Count number of occurrences (or frequency) in a sorted array
public class Occurrence_Of_Number_In_Sorted_Array 
{
	public static void main(String[] args) 
	{
		int arr[] = {1, 2, 2, 3, 3, 3,3,3,3,3};
		int find = 3;
		int result = findOccurrence(arr,arr.length,find);
		if(result == -1)
			System.out.println(find+" is absent in array");
		else
			System.out.println("Count of "+find+" is "+result);
	}

	private static int findOccurrence(int[] arr, int length, int find) 
	{		
		return findOccurrenceOfNumber(arr,0, length-1,find);
	}

	private static int findOccurrenceOfNumber(int[] arr, int i, int j, int find) 
	{
		int left=0 , right=0;
		
		left = leftFirstOccurrence(arr,0,j,find);
		if(left == -1)
			return -1;
		
		right = rightFirstOccurrence(arr,left,j,find);
				
		
		return right - left + 1;
	}

	private static int leftFirstOccurrence(int[] arr, int start, int end, int find) 
	{
		if( start <= end )
		{
			int mid = (start+end) /2;
			
			if( mid == 0 ||  (arr[mid] == find && find > arr[mid-1]) )			
				return mid;			
			else if(find > arr[mid])
				return leftFirstOccurrence(arr, mid+1, end, find);
			else
				return leftFirstOccurrence(arr, start, mid-1, find);
		}
		return -1;
	}
	private static int rightFirstOccurrence(int[] arr, int start, int end, int find) 
	{
		if(start <= end)
		{
			int mid = (start+end)/2;
			
			if(mid == arr.length-1 || ( arr[mid] == find && find < arr[mid+1]) )			
				return mid;			
			else if( find < arr[mid] )
				return rightFirstOccurrence(arr, start, mid-1, find);
			else
				return rightFirstOccurrence(arr, mid+1,end, find);			
		}
		return -1;
	}
}
