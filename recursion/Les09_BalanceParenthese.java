package recursion;

public class Les09_BalanceParenthese {

	public static void main(String[] args) {
		int n=3;
		char ar[]= new char[n*2];
		balpare(ar,n,0,0,0);
	}

	private static void balpare(char[] ar, int n, int count, int open, int close) {
		if(count==ar.length)
		{
			System.out.println(ar);
			return;
		}		
		if(open<n)
		{
			ar[count]='(';
			balpare(ar, n, count+1, open+1, close);
		}
		
		if(close<open)
		{
			ar[count]=')';
			balpare(ar, n, count+1, open, close+1);
		}
	}
}
