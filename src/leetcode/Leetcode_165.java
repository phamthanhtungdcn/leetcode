package leetcode;

public class Leetcode_165 {

	public static void main(String[] args) {
		String version1 = "1";
		String version2 = "1.1";
		
		System.out.println(compareVersion(version1, version2));
	}
	
    public static int compareVersion(String version1, String version2) {
    	String[] v1 = version1.split("\\.");
    	String[] v2 = version2.split("\\.");
    	int dotCount = Math.abs(v2.length - v1.length);
    	StringBuffer v2Raw = new StringBuffer(version2);
    	StringBuffer v1Raw = new StringBuffer(version1);		

    	if(v1.length > v2.length) {
    		for(int i = 0; i < dotCount; i++) {
    			v2Raw.append(".0");
    		}
    	} else if(v1.length < v2.length){
    		for(int i = 0; i < dotCount; i++) {
    			v1Raw.append(".0");
    		}
    	}
    	v1 = v1Raw.toString().split("\\.");
    	v2 = v2Raw.toString().split("\\.");
    	
    	for(int i = 0; i < v1.length; i++) {
    		if(Integer.parseInt(v1[i]) > Integer.parseInt(v2[i])) {
    			return 1;
    		} else if(Integer.parseInt(v1[i]) < Integer.parseInt(v2[i])){
    			return -1;
    		}
    		

    	}
    	
    	return 0;
    }
}
