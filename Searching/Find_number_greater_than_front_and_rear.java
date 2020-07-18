package algorithms.Searching;

/*
Let's call an array A a mountain if the following properties hold:
1)A.length >= 3
2)There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].
 */

public class Find_number_greater_than_front_and_rear 
{
	public static void main(String[] args) 
	   {
		   int arr[] = {  0,2,1,0 };
		    
		  Find_number_greater_than_front_and_rear obj = new Find_number_greater_than_front_and_rear();
		   System.out.println(obj.peakIndexInMountainArray(arr) );
	   }
	public int peakIndexInMountainArray(int[] A) 
    {
        return bs(A,0,A.length-1);        
    }
    int bs(int arr[] , int start , int end)
    {
        if( start <= end )
        {
            int mid = (start+end)/2;
            
            if( arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1] )
                return mid;
            
            if( arr[mid] > arr[mid+1] && arr[mid] < arr[mid-1] )
                return bs(arr , start ,mid-1);
            else
                return bs(arr , mid+1 ,end);
        }
        return -1;
    }

}
