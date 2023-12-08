package recursion;

public class KillingJos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,1,2,3,4,5,6},k=3;
		int b=jos(10,2);
		System.out.println(b);
	}

	private static int jos(int n, int k) {
		if(n==1)
			return 0;
		System.out.println(n+" "+k);
		return (jos(n-1,k)+k)%n;
	}

}
