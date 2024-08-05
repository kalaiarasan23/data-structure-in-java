package recursion;

public class Les16_PowerOfNumber {
	public static void main(String[] args) {
		long a=powerOfNumber(5,8,1);
		System.out.println(a);
		System.out.println(powerOfNumber(5,8));
	}
// x^y = x^y-1 * x
	private static long powerOfNumber(int p, int n) {
		if(n==0)
		return 1;
		System.out.println(p);
		return powerOfNumber(p, n-1)*p;
	}

	private static long powerOfNumber(long p, int n,long ans) {
		if(n == 0)
			return ans;
		System.out.println(ans);
		return powerOfNumber(p, n-1,p*ans);
	}
}
