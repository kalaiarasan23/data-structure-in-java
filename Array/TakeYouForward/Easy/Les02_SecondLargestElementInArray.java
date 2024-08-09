package arrays.Easy;

public class Les02_SecondLargestElementInArray {

	/* Problem Statement: Given an array, find the second smallest and second largest element in the array. 
	 * Print ‘-1’ in the event that either of them doesn’t exist.
	 * 
	 * Example 1:
		Input:
		 [1,2,4,7,7,5]
		Output:
		 Second Smallest : 2
			Second Largest : 5
		Explanation:
		 The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2
		
		Example 2:
		Input:
		 [1]
		Output:
		 Second Smallest : -1
			Second Largest : -1
		Explanation:
		 Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present
	 * */
	
	public static void main(String[] args) {
		int arr[] = {1},secLargest,secSmallest,min,max;
		secLargest=max=-1;
		secSmallest=min=Integer.MAX_VALUE;
		for(int i =0; i<arr.length; i++) {
			if(max<arr[i])
			{
				if(secLargest < max)
					secLargest =max;
				max = arr[i];
			}
			else if(secLargest < arr[i] && max > arr[i] )
				secLargest = arr[i];
			
			if(min>arr[i])
			{
				if(secSmallest > min)
					secSmallest = min;
				min = arr[i];
			}
			else if(secSmallest > arr[i] && min < arr[i] )
				secSmallest = arr[i];
			
			System.out.println(secLargest+" "+secSmallest);
		}
		if(secSmallest == Integer.MAX_VALUE)
			secSmallest =-1;
		System.out.println(secLargest+" "+secSmallest);
	}

}
