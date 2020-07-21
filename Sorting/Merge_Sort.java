package algorithms.Sorting;

public class Merge_Sort
{
	public static void main(String[] args) 
	{
		Merge_Sort ob = new Merge_Sort(); 
        int arr[] = {-1,1111,64,25,12,22,11};
        
        ob.printArray(arr);			
        ob.sort(arr,0,arr.length-1);
        
        System.out.println("Sorted array"); 
        ob.printArray(arr);				
	}

	private void sort(int[] arr , int start , int end) 
	{	
		if(start < end)
		{
			int mid = (start+end)/2;
			
			sort(arr,start,mid); // left halve
			sort(arr,mid+1,end); // right halve
			
			mergeSort(arr, start, end, mid); // joining left & right halves
		}
		
	}
	private void mergeSort(int[] arr , int start , int end , int mid) 
	{
		int s1 = mid - start+1; // imp line
		int s2 = end- mid;
		
		int L[] = new int[s1];
		int R[] = new int[s2];
		
		for(int i=0 ; i<s1 ; i++)
			L[i] = arr[i+start]; // imp line
		
		for(int i=0 ; i<s2 ; i++)
			R[i] = arr[mid+i+1]; // imp line
		
		int i=0,j=0,k=start; // imp line
		while( i<s1 && j<s2 )
		{
			if( L[i] <= R[j] )
			{
				arr[k] = L[i];
				i++;
				k++;
			}
			else
			{
				arr[k] = R[j];
				j++;
				k++;
			}
		}
		while( i < s1 )
		{
			arr[k] = L[i];
			k++;
			i++;
		}
		while( j < s2 )
		{
			arr[k] = R[j];
			k++;
			j++;
		}
	}

	private void printArray(int[] arr) 
	{
		 for(int i=0 ; i<arr.length ; i++)
			System.out.print(arr[i]+" ");
		
			System.out.println();		
	}
}
