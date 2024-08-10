package arrays.Easy;

import java.util.Arrays;

public class Les07_MovesZeroToEnd {

	public static void main(String[] args) {
		int arr[] = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1},i=0,j=1;
		while(j<arr.length )
		{
			if(arr[i] != 0)
				i++;
			if(arr[j] == 0)
				j++;
			if(arr[i] == 0 && arr[j]!=0)
			{
				swap(arr,i,j);
				i++;
				j++;
			}
			
			// swap condition get last make a good answer
		}
		System.out.println(Arrays.toString(arr) +" "+i+" "+j); 
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}


}
