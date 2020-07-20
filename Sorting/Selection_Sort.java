package algorithms.Sorting;
/*
 Time Complexity: O(n2) as there are two nested loops.
 Auxiliary Space: O(1)
 
 The good thing about selection sort is it never makes more 
 than O(n) swaps and can be useful when memory write is a
  costly operation.
*/
public class Selection_Sort 
{
	public static void main(String[] args) 
	{
		Selection_Sort ob = new Selection_Sort(); 
        int arr[] = {-1,1111,64,25,12,22,11}; 
        ob.sort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 		
	}
	void printArray(int[] arr) 
	{	
		for(int i=0 ; i<arr.length ; i++)
		     System.out.print(arr[i]+" ");		
	}
	void sort(int[] arr)
	{
		for(int i=0 ; i<arr.length-1 ; i++)
		{
			int min = i;
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if( arr[min] > arr[j] )
				 min = j;				
			}			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}	
	}
}
