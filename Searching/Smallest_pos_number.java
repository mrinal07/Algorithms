package algorithms.Searching;
//Java Program to find the smallest 
//positive missing number 
import java.util.Arrays; 
public class Smallest_pos_number { 

 static int solution(int[] A) 
 { 
     int n = A.length; 

     // To mark the occurrence of elements 
     boolean[] present = new boolean[n + 1];
     
     // Mark the occurrences 
     for (int i = 0; i < n; i++) {

         // Only mark the required elements 
         // All non-positive elements and 
         // the elements greater n + 1 will never 
         // be the answer 
         // For example, the array will be {1, 2, 3} 
         // in the worst case and the result 
         // will be 4 which is n + 1 
         if (A[i] > 0 && A[i] <= n) 
         {
        	 System.out.print(A[i]+" ");
        	 present[A[i]] = true;
         }
              
     }
     System.out.println();
     for (int i = 0; i < n; i++)
    	 System.out.print(present[i]+" ");

     // Find the first element which didn't 
     // appear in the original array 
     for (int i = 1; i <= n; i++) 
         if (!present[i]) 
             return i; 

     // If the original array was of the 
     // type {1, 2, 3} in its sorted form 
     return n + 1; 
 } 

 public static void main(String[] args) 
 { 
     int A[] = { -10, 1, 3, -20 }; 
     System.out.println(solution(A));     
 } 
} 
//T