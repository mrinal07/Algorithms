package algorithms.Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Bucket_Sort {
	public static void main(String[] args) {
		Bucket_Sort ob = new Bucket_Sort();
		double arr[] = { 0.897, 0.565, 0.656, 0.1234, 0.665, 0.3434, 0.1342 };

		System.out.println("Original array");
		printArray(arr);
		ob.sort(arr);

	}

	private void sort(double[] arr) {
		int len = arr.length;
		ArrayList<ArrayList<Double>> al = new ArrayList<ArrayList<Double>>();

		for (int i = 0; i < len; i++)
			al.add(new ArrayList<>());

		for (int i = 0; i < len; i++) {
			int temp = (int) (len * arr[i]);
			al.get(temp).add(arr[i]);
		} 

		for (int i = 0; i < len; i++)
			Collections.sort(al.get(i));

		int index = 0;

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < al.get(i).size(); j++)
				arr[index++] = al.get(i).get(j);
		}
		System.out.println("Sorted array");
		printArray(arr);
	}

	private static void printArray(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
}