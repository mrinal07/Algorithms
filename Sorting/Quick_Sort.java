package algorithms.Sorting;

public class Quick_Sort 
{
	public static void main(String[] args) 
	{
		Quick_Sort ob = new Quick_Sort(); 
        int arr[] = {-1,1111,64,25,12,22,11};
        
        ob.printArray(arr);			
        ob.sort(arr,0,arr.length-1);
        
        System.out.println("Sorted array"); 
        ob.printArray(arr);				
	}

	private void sort(int[] arr, int start, int end) 
	{
		if(start<end)
		{
			int pivot_pos = pivotAtProperPlace(arr,start,end); // find pivot and keep it at proper place
			
			sort(arr,start,pivot_pos-1); // left halve excluding pivot
			
			sort(arr,pivot_pos+1,end); // right halve excluding pivot
		}
	}

	private int pivotAtProperPlace(int[] arr, int start, int end) 
	{
		int pivot = arr[end]; // picking up any pivot element here i picked last element as pivot
		
		int i = (start-1);  
		int j = 0; 
		
		for( j=start ; j<end ; j++ )
		{
			if( arr[j] <= pivot ) // swap all element < pivot (when pivot is rightmost element)
			{
				i++;
				int temp = arr[i]; 
				arr[i] = arr[j];
				arr[j] = temp;				
			}
		}
		int temp = arr[i+1]; 
		arr[i+1] = arr[end];
		arr[end] = temp;
	
		return i+1;
		
	}

	private void printArray(int[] arr) 
	{
		for(int i=0 ; i<arr.length ; i++)
			System.out.print(arr[i]+" ");
		
			System.out.println();		
	}

}
