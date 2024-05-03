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
    	String[] raw;
    	
    	if(v2.length > v1.length) {
    		raw = v2;
    		v2 = v1;
    		v1 = raw;
    	}
    	
    	for(int i = 0; i < v1.length; i++) {
    		if(i > v2.length -1) {
        		if(Integer.parseInt(v1[i]) > 0) {
        			return 1;
        		} else if(Integer.parseInt(v1[i]) < 0){
        			return -1;
        		}
    		} else {
        		if(Integer.parseInt(v1[i]) > Integer.parseInt(v2[i])) {
        			return 1;
        		} else if(Integer.parseInt(v1[i]) < Integer.parseInt(v2[i])){
        			return -1;
        		}
    		}
    		

    	}
    	
    	return 0;
    }
}
