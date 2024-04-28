package leetcode;

public class Leetcode_28 {
	public static void main(String[] args) {
		System.out.println(strStr("leetcode", "leeto"));
	}
	
    public static int strStr(String haystack, String needle) {
    	for(int i = 0; i < haystack.length(); i ++) {
    		if(needle.length() >  haystack.length() - i) {
    			return -1;
    		}
    		
    		String subStr = haystack.substring(i, i+needle.length());
    		if(needle.equals(subStr)){
    			return i;
    		}
    	}
    	
        return -1;   
    }
}
