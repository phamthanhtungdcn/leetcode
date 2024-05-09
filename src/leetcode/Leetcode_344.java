package leetcode;

public class Leetcode_344 {

	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		reverseString(s);
//		System.out.println(new String(s));
	}
	
    public static void reverseString(char[] s) {
    	char temp;
        int i = 0; 
        int j = s.length;
        while(i < j/2) {
        	temp = s[i];
        	s[i] = s[j - i - 1];
        	s[j - i - 1] = temp;
        	i++;
        }
    }
}
