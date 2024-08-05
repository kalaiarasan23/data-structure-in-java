package recursion;

public class Les10_SubsequenceOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc",ans="";
		subsequenceOfString(s,ans);
		System.out.println("end");
	}

	private static void subsequenceOfString(String s, String ans) {
		if(s.equals(""))
		{
			System.out.println(ans);
			return;
		}
		subsequenceOfString(s.substring(1), ans+s.charAt(0)); // pick
		subsequenceOfString(s.substring(1), ans);	// not pick
	}	
		
	/*	first take the first function as pick
	 * s = bc		ans = a
	 * s = c	    ans = ab
	 * s = 			ans = abc   1st break happen and print the ans = abc
	 *
	 * not pick c
	 * s =  		ans = ab  	2nd break happen and print the ans = ab 
	 * 
	 * not pick b
	 * s = c		ans = a
	 * s = 			ans = ac 	3rd break happen and print the ans = ac
	 * 
	 * not pick c of not pick b
	 * s = 			ans = a		4th break happen and print the ans = a
	 * 
	 * Now came to top --> not pick a
	 * s = bc 		ans = 
	 * 
	 * pick b 
	 * s = c 		ans = b
	 * 
	 * pick c
	 * s =			ans = bc 	5th break happen and print the ans = bc
	 * 
	 * not pick c
	 * s = 			ans = b		6th break happen and print the ans = b
	 * 
	 * back to not pick b 		
	 * s = c 		ans=		
	 * pick c
	 * s = 			ans = c		7th break happen and print the ans = c
	 * not pick c
	 * s =          ans =		8th break happen and print the ans = 
	 *     		 
	*/
	
	

}
