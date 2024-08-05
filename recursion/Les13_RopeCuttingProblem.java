package recursion;

public class Les13_RopeCuttingProblem {

	public static void main(String[] args) {
		int n=15;
		System.out.println(cuttingRope(n,5,7,8));
	}

	private static int cuttingRope(int n,int a,int b,int c) {
		if(n == 0) {
			return 0 ;
		}
		if(n < 0) {
			return -1;
		}
			int temp1 = cuttingRope(n-a, a, b, c);
			int temp2 = cuttingRope(n-b, a, b, c);
			int temp3 = cuttingRope(n-c, a, b, c);
			int pieces = Math.max(temp3,Math.max(temp2, temp1)); 
			
			if(pieces == -1)
				return -1;
			
			return pieces+1; 
	}	
/*	n=15
 *  temp 1= 
 * */
}
