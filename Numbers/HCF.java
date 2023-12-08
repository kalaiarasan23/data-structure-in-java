package day1;

public class HCF {

	public static void main(String[] args) {
//		normalMethod(14,24);
//		eucliddMethod(14,24);
//		gcd(7,2);
//		findLCM(7,3);
		easyLCM(3,8);
	}
		private static void easyLCM(int i, int j) {
			System.out.println(i*j/gcd(i,j));
		}

		private static int gcd(int i, int j) {
			while(i!=0 && j!=0)
			{
				if(i>j)
					i=i%j;
				else
					j=j%i;
			}
			System.out.println(i);
			return i;
		}

	private static void findLCM(int a, int b) {
		
		int res = Math.max(a, b);
		
		while(true)
		{
			if(res%a==0 && res%b==0)
				break;
			res++;
		}
			System.out.println(res);
	}

	private static void eucliddMethod(int a, int b) {
		while(a!=b)
		{
			if(a>b)
				a= a-b;
			else
				b= b-a;
		}
		System.out.println(a+" "+b);
	}

	private static void normalMethod(int n, int m) {
		int no = n>m ? n : m;
		while(no>0)
		{
			if(n%no==0 && m % no==0)
				break;
			no--;
		}
		System.out.println(no);
	}

}
