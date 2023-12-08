package day1;

public class Divisor {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
//		simple(40);
//		logEfficent(25);
		ascendingLogEff(40);
	}

	private static void ascendingLogEff(int n) {
		int i=1;
		while(i*i<=n)
		{
			if(n%i==0)
				System.out.print(i+" ");
			i++;
		}
		while(i>0)
		{
			if(n%i==0 && n/i != i)
			System.out.print(n/i+" ");
			i--;
		}
	}

	private static void logEfficent(int n) {
		for(int i=1; i*i<=n ;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
				if(i != n/i)
					System.out.print(n/i+" ");
			}
		}
	}

	private static void simple(int n) {
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.print(i+" ");
		}
	}

}
