package bitwiseOperation;

public class ReverseBit {

	public static void main(String[] args) {
		int n=1,f=31,l=0,res=0;
		System.out.println(Integer.toBinaryString(n));
		while(f>l) {
			
			if((n & (1<<f)) !=0) {
				
				res+=f;
				}
			if((n & 1<<l) !=0 ) {
				
				res +=(1<<f);
			}
			System.out.println(res+" "+(1<<f)+" "+(1<<l));
			f--;
			l++;
		}
	}

}
