package recursion;


public class PrintNNumbers {

	public static void main(String[] args) {
		forwardprint(5);
}
		
		

	private static void forwardprint(int i) {
		if(i==0 )
			return;
		forwardprint(i-1);
		System.out.print(i+" ");	
	}

}
