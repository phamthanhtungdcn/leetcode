package leetcode;

public class Leetcode_28 {
	public static void main(String[] args) {
		System.out.println(strStr("uusadbutsad", "sad"));
//		System.out.println(strStr("leetcode", "leeto"));
	}

	public static int strStr(String haystack, String needle) {
		char[] h = haystack.toCharArray();
		char[] n = needle.toCharArray();
		
		for (int i = 0; i < h.length; i++) {
			for(int j = 0; j < n.length; j++) {
				if (h[i] == n[i]) {

				}
			}
		}
		
		return -1;
	}
}
