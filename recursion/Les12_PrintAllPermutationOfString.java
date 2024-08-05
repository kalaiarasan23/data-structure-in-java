package recursion;

import java.util.Arrays;

public class Les12_PrintAllPermutationOfString {

	public static void main(String[] args) {
		char[] s = new char[] {'a','b','c'};
		permutation(s,0);
	}

	private static void permutation(char[] s, int fixedIndex) {
		if(fixedIndex == s.length-1)
		{
			System.out.println(s);
			return;
		}
		
		for(int i=0;i<s.length;i++)
		{
			swap(s, fixedIndex, i); // swap the fixed position with variable position
			permutation(s, fixedIndex+1);
			swap(s, fixedIndex, i); // re swap to orginal position
		}	
	}

	private static void swap(char[] s, int fixedIndex, int i) {
		char temp = s[i];
		s[i]= s[fixedIndex];
		s[fixedIndex]=temp;
	}
}
