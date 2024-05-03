package leetcode;

public class Leetcode_2441 {

	public static void main(String[] args) {
		int[] nums = {-1,2,-3,3,4};
		System.out.println(findMaxK(nums));
	}
	
    public static int findMaxK(int[] nums) {
    	int maxNumber = -1;
    	int maxNumberCurrent = 0;
        for(int i = 0; i < nums.length; i++) {
        	for(int j = 1; j < nums.length; j++) {
        		if(nums[i] + nums[j] == 0) {
        			maxNumberCurrent = nums[i] > nums[j]? nums[i]: nums[j];
        			maxNumber = maxNumber > maxNumberCurrent? maxNumber : maxNumberCurrent;
        		}
        	}
        }
    	
    	return maxNumber;
    }
}
