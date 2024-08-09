package arrays.Easy;

public class Les01_LargestElementInArray {
	
//	Input:
//		 arr[] = {2,5,1,3,0};
//		Output:
//		 5
//		Explanation:
//		 5 is the largest element in the array. 
//
//		Example2:
//		Input:
//		 arr[] = {8,10,5,7,9};
//		Output:
//		 10
//		Explanation:
//		 10 is the largest element in the array.
	
	public static void main(String[] args) {
		int arr[] = {8,10,5,7,9},largest=arr[0];
		 
		for(int i =0 ; i<arr.length; i++)
		{
			if(largest < arr[i])
				largest=arr[i];
		}
		System.out.println(largest);
	}

}
