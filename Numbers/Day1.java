package day1;

public class Day1 {
	public static void main(String[] args) {
//		factorial(5);
//		countOfDigit(10000);
		trailingZero(200);
	}

	private static void trailingZero(int n) {
		int res =0,div=5 ;
		while(n>=div)
		{
			res += n/div;
			div *= 5;
		}
		System.out.println(res);
	}

	private static void countOfDigit(int n) {
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
			System.out.println(count);
	}

	private static void factorial(int n) {
		int mul=1;
		for(int i =1 ;i<=n ;i++)
			mul *=i;
		System.out.println(mul);
	}
}
