package algorithms.Searching;
// Find the number of zeroes
// Array consist of only 1's and 0's . 1's are left side and 0's are on right side
public class Count_Zeros 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,1,1,1,1,1,1,1,1,1,1,1, 0, 0, 0, 0};
		
		int result = findZero(arr,0,arr.length-1);
		if(result == -1)
			System.out.println("Zero is absent in array");
		else
			System.out.println("Count of Zero is "+(arr.length-result) );
	}

	private static int findZero(int[] arr,int start, int end) 
	{
		if( start <= end)
		{
			int mid = ( (start+end)/2);
			
			if(  mid == 0 || (arr[mid-1] == 1 && arr[mid]== 0 ) )
			{
				return mid;
			}
			if(arr[mid] == 1)
				return findZero(arr, mid+1, end);
			else
				return findZero(arr, start, mid-1);			
		}
		
		return -1;
	}
}
