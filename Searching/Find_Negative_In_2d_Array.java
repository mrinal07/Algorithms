package algorithms.Searching;

public class Find_Negative_In_2d_Array
 {
	public static void main(String[] args) 
	   {
		   int arr[][] = {  {4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}  };
		    
		   Find_Negative_In_2d_Array obj = new Find_Negative_In_2d_Array();
		   System.out.println(obj.countNegatives(arr));
	   }
    public int countNegatives(int[][] grid) 
    {        
        int sum=0,temp=0;
        for(int i=0 ; i<grid.length ; i++)
        {
            if( grid[i][grid[i].length-1] < 0 )
            {                
                temp = bs( grid[i],0,grid[i].length-1 );  
                
                if(temp >= 0)
                  sum = sum + (grid[i].length - temp);            
            }
        }
        return sum;
    }
    int bs(int arr[] , int start , int end)
    {           
        if(start <= end)
        {   
            int mid = (start+end)/2;
            if( ( mid==0 && arr[mid] < 0) ||  mid >= start && arr[mid] < 0 && arr[mid-1] >= 0 )
                return mid;                  
            if( mid <= end && arr[mid] >= 0 && arr[mid+1] < 0 )
                return mid+1;                  
            if( arr[mid] >= 0   )
                return bs(arr,mid+1,end);
            else
                return bs(arr,start,mid-1); 
        }           
        return -1;                              
    }
}