package arrays.Easy;

public class Les03_CheckIfAnArraySorted {
/*
 * Problem Statement: 
 * 		Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. 
 * If the array is sorted then return True, Else return False.
 * 
 * Example 1:
Input:
 N = 5, array[] = {1,2,3,4,5}
Output
: True.
Explanation:
 The given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True
 * 
 * */
	public static void main(String[] args) {
		int  array[] = {1,2,1,4,5};
		if(array[0]>array[1])
		{
			System.out.println(isDescendingOrder(array));
		}
		else
			System.out.println(isAscendingOrder(array));
	}

	private static boolean isDescendingOrder(int[] array) {
		for(int i=1;i<array.length;i++)
		{
			if(array[i-1]<array[i])
				return false;
		}
		return true;
	}
	private static boolean isAscendingOrder(int[] array) {
		for(int i=1;i<array.length;i++)
		{
			if(array[i-1]>array[i])
				return false;
		}
		return true;
	}

}
