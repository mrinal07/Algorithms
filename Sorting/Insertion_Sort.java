package algorithms.Sorting;

public class Insertion_Sort 
{
	public static void main(String[] args) 
	{
		Insertion_Sort ob = new Insertion_Sort(); 
        int arr[] = {4,3,2,1};
        ob.printArray(arr);			
        ob.sort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr);				
	}
	private void sort(int[] arr) 
	{
		for(int i=1 ; i<arr.length ; i++)
		{	
			int j = i-1;
			int key = arr[i];		
			
			while( j>=0 && key < arr[j] )
			{				
				arr[ j+1 ] = arr[j];			
				j--;
			}
			arr[j+1] = key;			
		}		
	}
	private void printArray(int[] arr) 
	{
		for(int i=0 ; i<arr.length ; i++)
		     System.out.print(arr[i]+" ");
		
		System.out.println();
	}
}
