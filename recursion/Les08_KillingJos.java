package recursion;

public class Les08_KillingJos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,1,2,3,4,5,6},k=3;
		int b=jos(7,k);
		System.out.println(a[b]);
	}

	private static int jos(int n, int k) {
		if(n==1)
			return 0;
		return (jos(n-1,k)+k)%n;
	}

}
