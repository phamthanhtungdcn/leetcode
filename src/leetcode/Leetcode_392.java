package leetcode;

public class Leetcode_392 {

	public static boolean isSubsequence(String s, String t) {
        char[] sString = s.toCharArray();
		char[] tString = t.toCharArray();
		
		int count = 0;
		for(int i = 0; i < tString.length; i++) {
			if(sString.length > count && tString[i] == sString[count]) {
				count++;
			}
		}
		
		return count == s.length();
	}
}
