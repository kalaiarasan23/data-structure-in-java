package recursion;

public class Les05_SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(9999));
	}

	private static int sum(int i) {
		if(i<=0)
			return 0;
			System.out.println(i);
		return sum(i/10) + (i%10);
		
	}

}
