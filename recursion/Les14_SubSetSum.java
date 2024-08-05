package recursion;

public class Les14_SubSetSum {

	public static void main(String[] args) {
		int arr[] = {10,20,15,5},sum=25;
		int n = setSum(arr,sum,0);
		System.out.println(n);
		System.out.println(fun(95));
		
	}
	
	static int fun(int n) 
	{ 
	    if (n > 100) 
	        return n - 10; 
	  
	    // A recursive function passing parameter 
	    // as a recursive call or recursion 
	    // inside the recursion 
	    return fun(fun(n + 11)); 
	} 
	  
	
	private static int setSum(int[] arr, int sum,int i) {
		if(sum==0)
			return 1;
		if(sum<0)
			return 0;
		if(i==arr.length)
			return 0;
		return setSum(arr, sum-arr[i], i+1)+setSum(arr, sum, i+1);
	}

}
