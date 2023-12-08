package bitwiseOperation;

import java.util.Arrays;

public class LonelyInteger {

	public static void main(String[] args) {
		int arr[]= {1,4,2,4,6,6,1};
		lonelyInteger(arr); 
		// using set 
		//third method is
		exorOperatorMethod(arr);
		
	}

	private static void exorOperatorMethod(int[] arr) {
		int temp = arr[0];
		for(int i = 1 ; i<arr.length ; i++)
		{
			temp ^= arr[i]; 
		}
		System.out.println(temp);
	}

	private static void lonelyInteger(int[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int i=0,n=arr.length;
		while(i<n-1)
		{
			if(arr[i] != arr[i+1])
			{
				System.out.println(arr[i]);
				return;
			}
			i +=2;
		}
		System.out.println(arr[i-1]);
	}

}
