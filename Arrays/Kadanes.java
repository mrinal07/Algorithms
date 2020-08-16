package algorithms.Arrays;

public class Kadanes 
{
	public static void main(String[] args) 
	{
		int [] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		// Find sum 
		System.out.println("sum => "+LargestSumContiguousSubArray(arr));
		// Find Indexes
		int result [] = LargestSumContiguousSubArrayIndexes(arr);		
		System.out.println("Start index '"+ result[0]+"' End index '"+result[1]+"'" );		
	}	

	private static int LargestSumContiguousSubArray(int[] arr) 
	{
		int max,curr;
		max = curr = arr[0];
		
		for(int i=1 ; i<arr.length ; i++)
		{
			curr += arr[i];
			if( curr > max )
				max = curr;
			if( curr < 0 )
				curr = 0;
		}		
		return max;		
	}
	private static int[] LargestSumContiguousSubArrayIndexes(int[] arr) 
	{
		int ans[] = new int[2];
		int max,curr,start=0,end=0,source=0;
		max = curr = arr[0];		
		
		for(int i=0 ; i<arr.length ; i++)
		{
			curr+=arr[i];
			if( curr > max )
			{
				max = curr;
				start = source;
				end = i;
			}
			if( curr < 0 )
			{
				curr = 0;
				source = i+1;
			}			
		}
		ans[0] = start;
		ans[1] = end;
			
		return ans;
	}

}
