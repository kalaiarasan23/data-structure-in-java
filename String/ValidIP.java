package dimond;

import java.util.Arrays;

public class ValidIP {

	public static void main(String[] args) {
		String s="178.12..1";
		String[] parseIp= s.split("\\.");
		System.out.println(Arrays.deepToString(parseIp));
		System.out.println(Integer.parseInt(parseIp[0]));
	}

}
