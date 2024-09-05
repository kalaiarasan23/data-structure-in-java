package dimond;

import java.util.HashSet;
import java.util.Set;

public class SubsquenceCount {
	static Set<String> s = new HashSet<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st ="gfg";
		subSequence(st,"");
		System.out.println(s);
		System.out.println(s.size());
	}
	
	private static void subSequence(String s2, String string) {
		if(s2.equals(""))
		{
			s.add(string);
			return ;
		}
		subSequence(s2.substring(1), string+s2.charAt(0));
		subSequence(s2.substring(1), string);
	}

}
