package arrayPrograms;


public class CountOfSmallOrEqual {
	public static void main(String[] args) {
		int b[]= {2,6,12,18,21,24,26,26,26,26,33,42},find=25;
		System.out.println(countSearch(b,find));
	}

	private static int countSearch(int[] b, int find) {
		int l=0,h=b.length-1,m = 0;
		while(l<=h)
		{
			 m = (l+h)/2;
			if(b[m]== find)
			{
				break;
			}
			else if(b[m] > find)
				h=m-1;
			else
				l=l+1;
		}
		
		if(b[m]!=find) // element is not present
			return m+1;
		
		while(m<b.length-1) // if the element is present and dulplicates are available
		{
			if(b[m+1]!=find)
				return m;
			m++;
		}
		return -1;
	}
}