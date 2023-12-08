package recursion;

public class SumOfAllElementsInArray {

	public static void main(String[] args) {
		
		int a[]= {1,6,2,3,4,5},s = sumArray(a,0);
		System.out.println(s);
	}

	private static int sumArray(int[] a,int start) {
		if(start ==a.length)
			return 0;
		return sumArray(a, start+1)+a[start];
	}

}
