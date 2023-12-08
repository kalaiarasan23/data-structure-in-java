package bitwiseOperation;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		firstSetBit(40);
//		maskFindAlgo(40);
//		countNoSetBit(15);
		powerOf2(33);
	}

	private static void powerOf2(int i) {
		System.out.println((int)Math.floor(Math.log10(i)/Math.log10(2)));
	}

	private static void countNoSetBit(int n) {
		int c=0;
		while(n!=0)
		{
			n &= n-1;
			c++;
		}
		System.out.println(c);
	}

	private static void maskFindAlgo(int n) {
		// find mask value
		int mask = n & (n-1);
//		System.out.println(mask);
//		System.out.println(n ^ mask);// here we got int value of 1000
		
//		change the value to position
		System.out.println((int)(Math.log10(n^mask)/ Math.log10(2))+1);
		
	}

	private static void firstSetBit(int n) {
		int m = 1, pos =1;
		if(n==0)
			System.out.println(0);
		while((n & m) == 0)
		{
			m = m<<1;
			pos++;
		}
		System.out.println(pos);
	}

}
