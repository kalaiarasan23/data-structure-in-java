package arrays.Easy;

import java.util.Arrays;

public class Les05_LeftRotateAnArrayByOnePlace {

	/*Problem Statement: Given an array of N integers, left rotate the array by one place.
	 * 
	 * Example 1:
		Input:
		 N = 5, array[] = {1,2,3,4,5}
		Output:
		 2,3,4,5,1
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5},temp=arr[0];
		for(int i=0;i<arr.length-1;i++)
			arr[i]=arr[i+1];
		arr[arr.length-1] = temp;
		System.out.println(Arrays.toString(arr));
	}

}
