package arrayPrograms;

public class BitonicArray {

	public static void main(String[] args) {
		int b[] = {1,2,6,7,10,14,11,9,8,4,3};
//		int b[] = {55,32,23,21,12,11,13,15,24,35,65};
		int key =14;
		// find bitonic index
		int bitonic =findBitonic(b);
		System.out.println(bitonic);
		if(b[bitonic]==key)
			System.out.println("true");
		else
		{
			if(b[bitonic]>b[bitonic-1])
			{
				if(ascendingBinarySearch(b,0,bitonic-1,key) |descendingBinarySearch(b,bitonic+1,b.length-1,key))
					System.out.println("true");
				else
					System.out.println("false");
			}
			else
			{
				if(descendingBinarySearch(b,0,bitonic-1,key) | ascendingBinarySearch(b,bitonic+1,b.length-1,key)) System.out.println("true");
				else System.out.println("false");
			}
		}
	}

	private static boolean descendingBinarySearch(int[] b, int l, int h,int key) {
		while(l<=h)
		{
			int m=(l+h)/2;
			if(b[m]==key)
				return true;
			if(key>m)
				l=m+1;
			else
				h=m-1;
		}
		return false;
	}

	private static boolean ascendingBinarySearch(int[] b, int l,int h, int key) {
		
		while(l<=h)
		{
			int m=(l+h)/2;
			if(b[m]==key)
				return true;
			if(key>m)
				l=m+1;
			else
				h=m-1;
		}
		return false;
	}

	private static int findBitonic(int[] a) {
		int l=0,h=a.length-1;
		while(l<=h)
		{
			int m=(l+h)/2;
			if(a[m] > a[m-1] && a[m]> a[m+1] || a[m] < a[m-1] && a[m] < a[m+1])
				return m;
			else if(a[m]> a[m-1] && a[m] < a[m+1])
				l=m+1;
			else
				h=m-1;
		}
		
		return -1;
	}

}
