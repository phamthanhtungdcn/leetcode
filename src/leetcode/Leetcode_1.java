package leetcode;

public class Leetcode_1 {

	public static void main(String[] args) {
		int[] nums = {2,5,5,11};
		int target = 10;
		
		int[] results = twoSum(nums, target);
		for(int result : results) {
			System.out.println(result);
		}
	}
	
    public static int[] twoSum(int[] nums, int target) {
    	int[] result = null;
    	
    	for(int i = 0; i < nums.length; i++) {
    		for(int j = i+1; j < nums.length; j++) {
    			if(nums[i] + nums[j]==target) {
    				result = new int[2];
    				result[0] = i;
    				result[1] = j;
    				return result;
    			}
    		}
    	}
    	
    	return result;
    }

}
