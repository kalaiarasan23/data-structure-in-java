package bitwiseOperation;

public class DeciToBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		decToBin(45);
		binToDec("101101");
	}

	private static void binToDec(String s) {
		int result=0,power2=1;
		for(int i=s.length()-1 ;i>=0 ; i--)
		{
			if(s.charAt(i) == '1')
				result += power2;
			power2*=2;
		}
		System.out.println(result);
	}

	private static void decToBin(int n) {
		String b ="";
		while(n>=1) {
		int x = n%2;
		n=n/2;
		b=x+b;
		}
		System.out.println(b);
	}

}
