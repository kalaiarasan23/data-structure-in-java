package day1;

public class PrimeNumberClass {

	public static void main(String[] args) {
//		System.out.println( isPrimeNumberNormal(97));
//		System.out.println(sqrtMethod(97));
//		System.out.println(effientMethod(97));
		booleanArraymethod(50);
	}

	private static void booleanArraymethod(int n) {
		boolean[] prime = new boolean[n+1];
		for(int i=2 ; i<=n ;i++)
		{
			if(prime[i] == false)
			{
				for(int j=i*2 ; j<=n ; j=j+i)
					prime[j] = true;
			}
		}
		
		for(int i=2 ;i<=n; i++)
		{
			if(prime[i]==false)
				System.out.println(i);
		}
	}

	private static boolean effientMethod(int n) {
		if(n==1)
			return false;
		if(n==2 || n==3)
			return true;
		if(n%2==0 || n%3==0)
			return false;
		for(int i=5 ; i*i<=n ; i += 6)
			if(n%i==0 || n%(i+2)==0)
				return false;
		return true;
	}

	private static boolean sqrtMethod(int n) {
			for(int i = 2;i<=n/2;i++)
				if(n%i==0)
					return false;
				return true;
	}

	private static boolean isPrimeNumberNormal(int n) {
		for(int i = 2;i<=n/2;i++)
			if(n%i==0)
				return false;
			return true;
	}

}
