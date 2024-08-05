package recursion;

public class Les11_LetterCombinationPhoneKeyPad {

	public static void main(String[] args) {
		String s="865",ans="", arr[]=new String[] {
				"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
				};
		
		combinationKeyPad(s,ans,arr);
		
	}

	private static void combinationKeyPad(String s, String ans, String[] keypad) {
		if(s.length()==0)
		{
			System.out.println(ans);
			return ;
		}
		
		int key = (int)( s.charAt(0) - '1');
		for(int i = 0; i<keypad[key].length(); i++) {
			combinationKeyPad(s.substring(1), ans+keypad[key].charAt(i), keypad);
		}
	}

}
