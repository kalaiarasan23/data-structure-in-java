package recursion;

public class Les02_Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factors(5));
	}

	private static int factors(int i) {
		if(i==1)
			return 1;
		return i*factors(i-1);
	}

}
