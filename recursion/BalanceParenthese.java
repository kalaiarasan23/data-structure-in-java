package recursion;

public class BalanceParenthese {

	public static void main(String[] args) {
		int n=5;
		char ar[]= new char[n*2];
		balpare(ar,n,0,0,0);
	}

	private static void balpare(char[] ar, int n, int i, int o, int c) {
		if(i==ar.length)
		{
			System.out.println(ar);
			return;
		}
		
		if(o<n)
		{
			ar[i]='(';
			balpare(ar, n, i+1, o+1, c);
		}
		
		if(c<o)
		{
			ar[i]=')';
			balpare(ar, n, i+1, o, c+1);
		}
	}
}
