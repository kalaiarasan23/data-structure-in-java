package arrays.Easy;

import java.util.Arrays;

public class Les06_LeftRotateAnArrayByDPlace {
	/*
	 * Problem Statement: 
	 * Given an array of integers, rotating array of elements by k elements either left or right.
	 * 
	 * 
	 * Example 1:
		Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
		Output: 6 7 1 2 3 4 5
		Explanation: array is rotated to right by 2 position .
		
	   Example 2:
		Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left 
		Output: 9 10 11 3 7 8
		Explanation: Array is rotated to right by 3 position.

	 * */
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7},k=3;
		reverse(arr,0,arr.length);
		reverse(arr,0,k);
		reverse(arr,k+1,arr.length);
		System.out.println(Arrays.toString(arr));
	}
	
	static void reverse(int arr[],int k,int n)
	{
		for(int i = k ;i<n/2;i++)
		{
			int temp = arr[i];
			arr[i] = arr[(n-1)-i];
			arr[(n-1)-i] = temp;
		}
	}
}
