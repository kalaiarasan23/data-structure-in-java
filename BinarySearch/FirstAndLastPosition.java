package arrayPrograms;

import java.util.Arrays;

/*
 * Input : a[]={5,7,7,8,8,10} target = 8
Output: 3,4


Input : a[]={5,7,7,8,8,10} target = 6
output: [-1,-1]
 
 */
public class FirstAndLastPosition {
	public static void main(String[] args) {
		int a[]={5,7,7,8,10}, target = 6;
		int b[]= findFirstAndLast(a,target);
		System.out.println(Arrays.toString(b));
		
	}

	private static int[] findFirstAndLast(int[] a, int target) {
		int l=0,h=a.length-1;
		while(l<=h)
		{
			int m = (l+h)/2;
			if(a[m]==target)
				return firstAndLast(a,m,target);
			else if(m > target)
				h= m-1;
			else
				l= m+1;
		}
		return new int[]{-1,-1};
	}

	private static int[] firstAndLast(int[] a, int m,int target) {
		int l1=0,h1=m-1,l2=m+1,h2=a.length-1,m1=m,m2=m;
		while(l1<=h1 && a[m1-1]==target)
		{
			m1 = (l1+h1)/2;
			if(a[m1]==target)
				break;
			else if(m1 > target)
				h1= m1-1;
			else
				l1= m1+1;
		}
		
		while(l2<=h2&& a[m+1]==target)
		{
			 m2 = (l2+h2)/2;
			if(a[m2]==target)
				break;
			else if(m2 > target)
				h2= m2-1;
			else
				l2= m2+1;
		}
		return new int[] {m1,m2};
	}
}
