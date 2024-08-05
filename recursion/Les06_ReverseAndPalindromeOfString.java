package recursion;

public class Les06_ReverseAndPalindromeOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "malailam",s="";
		s=reverseString(s1,s,s1.length());
		
//		System.out.println(s);
		if(isPal(s1,0,s1.length()-1))
			System.out.println("palindrome");
		else
			System.out.println("not");
	}

	private static boolean isPal(String s1, int start,int end) {
		System.out.println(s1.charAt(start)+ " " +s1.charAt(end));
		if(s1.charAt(start) != s1.charAt(end))
		return false;
		if(start >= end)
			return true;
		return isPal(s1,start+1,end-1);
	}

	private static String reverseString(String string,String rev,int i) {
		if(i==0)
			return rev;
		System.out.println(rev);
		return reverseString(string,rev+string.charAt(i-1),i-1);
	}

}
