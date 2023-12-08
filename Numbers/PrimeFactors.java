package day1;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simplePrimeFactor(78);
	}

	private static void simplePrimeFactor(int n) {
		int i=2;
		while(i*i<=n) 
		{
			while(n%i==0)
			{
				System.out.print(i+" "+n/i+"\n");
				n=n/i;
			}
		i++;
		}
		
		// if it is prime number, n will greater then 1
		if(n>1)
			System.out.print(n);
	}

}
