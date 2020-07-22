package algorithms.Sorting;

public class Heap_Sort 
{
	public static void main(String[] args) 
	{
		Heap_Sort ob = new Heap_Sort(); 
        int arr[] = {-1,1111,64,25,12,22,11};
        
        ob.printArray(arr);			
        ob.sort(arr);
        
        System.out.println("Sorted array"); 
        ob.printArray(arr);				
	}

	private void sort(int[] arr) 
	{
		int len = arr.length;
		
		for(int i=len/2-1 ; i>=0 ; i--)
			heapify(arr,i,len);
		
		for(int i = len-1 ; i>0 ; i--)
		{
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapify(arr, 0, i);
		}
		
	}

	private void heapify(int[] arr, int i, int len) 
	{
		// MAX HEAP APPROACH
		
		int largest = i;
		int left = (2*i)+1 , right = (2*i)+2 ;
		
		if( left < len && arr[left] > arr[largest] ) largest = left;
		
		if( right < len && arr[right] > arr[largest] ) largest = right;
		
		if( largest != i )
		{
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(arr, largest, len);
		}
		 
	}

	private void printArray(int[] arr) 
	{
		for(int i=0 ; i<arr.length ; i++)
			System.out.print(arr[i]+" ");
		
			System.out.println();		
	}
	 
} 