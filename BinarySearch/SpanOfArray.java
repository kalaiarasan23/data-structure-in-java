package arrayPrograms;

public class SpanOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//span = max - min;
		int a[]= {20,42,6,25,30,88};
//		span(a);
//		secondLargest(a);
		ceilAndFloorNumberInSortedArray();
	}

	private static void ceilAndFloorNumberInSortedArray() {
		int a[]= {19,23,56,61,72,88,92};
		int find=100,l=0,h=a.length;
		int ceil=0,floor=0;
		boolean b=true;
		if(a[0]>= find)
		{
			ceil=floor=a[0];
			b=false;
		}
		else if(a[h-1] <= find)
		{
			ceil=floor=a[h-1];
			b=false;
		}
		
		while(h>=l && b==true)
		{
			System.out.println(l+" "+h);
			int m = (h+l)/2;
			if(a[m]==find)
			{
				ceil = floor = a[m];
				b=false;
			}
			else if(a[m]> find)
				h=m-1;
			else
				l=m+1;
			}
		
		if(ceil==0)
		{
			ceil =a[h];
			floor =a[l];
		}
		System.out.println(l+" "+h+" "+ceil+" "+floor);
		}
	
	private static void secondLargest(int[] a) {
		int sec=a[0],max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				sec=max;
				max=a[i];
			}
			else if(sec<a[i])
				sec=a[i];
			
		}
		System.out.println(sec+" "+max);
	}

	private static void span(int[] a) {
		int min=a[0],max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
				min=a[i];
			if(max<a[i])
				max=a[i];
		}
//		System.out.println("span value is "+(max-min));
	}

}
