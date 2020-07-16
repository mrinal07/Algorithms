import java.util.*;
// Find the element that appears once in sorted array
class Find_Unique_Number_In_Array
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	     int tc = sc.nextInt();

	     while(tc-->0)
	     {
	         int n = sc.nextInt();
	         int arr[] = new int[n];
	         for(int i=0 ; i<n ; i++)
	            arr[i] = sc.nextInt();

	         int num = BS(arr,0,n-1);
	         System.out.println(num);
	     }
	}

	private static int BS(int[] arr, int start, int end)
	{
		if( start <= end)
		{
			if(start == end)
				return arr[start];

			int mid = (start+end)/2;
			if( mid %2 == 0)
			{
				if( arr[mid+1] == arr[mid]  )
				       return BS(arr,mid+2,end);
				else
				       return BS(arr,start,mid);
			}
			else
			{
				if( arr[mid-1] == arr[mid]  )
				       return BS(arr,mid+1,end);
				else
				       return BS(arr,start,mid-1);
			}
		}
		return -1;
	}

}
