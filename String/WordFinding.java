package dimond;

import java.util.ArrayList;
import java.util.List;

public class WordFinding {
	public static void main(String[] args) {
		String para="a for apple b for backd a forbc deck e abdfor egg", word="abc";
		List<Character> l=new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		boolean b =false;
		int i=0,j=0;
		while(i<para.length())
		{
			
			// if the we found the match enter into loop
			if(para.charAt(i) == word.charAt(j)) {
				l.add(word.charAt(j++)); 			// add into match and fixed list 
				sb.append(para.charAt(i++));
				
				while(i<para.length() && j<word.length() ) {    // enter into loop 
					
					if(para.charAt(i) == word.charAt(j))     // if == means add on l list
						l.add(word.charAt(j++));
					else if(l.contains(para.charAt(i)))    // else if the para[i] contains in break and remove elements from the list and sb
					{
						sb.delete(0, sb.capacity());
						l.removeAll(l);
						j=0;			// restart the j index;
						i--;              //   output loop must be increment, so we decrement the index i;
						break;
					}
					
					sb.append(para.charAt(i++)); // if we enter into this loop sb must be concat
				}
				
			}
			
			if(l.size() == word.length()) {
				System.out.println(sb);
				break;
			}
				
			i++;
		}
		if(l.size() != word.length()) {
			System.out.println("not found");
		}
	}
}
