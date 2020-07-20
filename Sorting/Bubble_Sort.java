package algorithms.Sorting;

public class Bubble_Sort 
{
	public static void main(String[] args) 
	{
		Bubble_Sort ob = new Bubble_Sort(); 
        int arr[] = {-1,1111,64,25,12,22,11};
        ob.printArray(arr);			
        ob.sort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr);				
	}
	private void sort(int[] arr) 
	{
		for(int i=0 ; i<arr.length-1 ; i++)
		{
			for(int j=0 ; j<arr.length-i-1 ; j++)
			{
				if( arr[j] > arr[j+1] )
				{
					System.out.println(arr[j]+" "+arr[j+1]);
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;					
				}				
			}			
		}		
	}

	private void printArray(int[] arr) 
	{
		for(int i=0 ; i<arr.length ; i++)
		     System.out.print(arr[i]+" ");		
	}
}
