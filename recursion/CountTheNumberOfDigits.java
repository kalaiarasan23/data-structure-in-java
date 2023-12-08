package recursion;

public class CountTheNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count(1095443));
		
	}

	private static int count(int i) {
		System.out.println(i);
		if(i<=0)
			return 0;
		return count(i/10)+1;
	}

}
