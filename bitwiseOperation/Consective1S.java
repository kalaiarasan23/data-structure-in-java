package bitwiseOperation;

public class Consective1S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		isConsective(110);
		trailingOfZero(8);
	}

	private static void trailingOfZero(int n) {
		System.out.println(n & (n-1));
	}

	private static void isConsective(int n) {
		int count=0;
		while(n!=0)
		{
			n=n & (n<<1);
			count++;
		}
		System.out.println(count);
	}

}
