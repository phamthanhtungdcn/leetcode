package leetcode;

import java.util.Arrays;

public class Leetcode_3075 {

	public static void main(String[] args) {
		int[] happiness = {2135218,73431904,92495076,77528042,82824634,3036629,28375907,65220365,40948869,58914871,57169530,89783499,19582915,19676695,11932465,21770144,49740276,22303751,80746555,97391584,95775653,43396943,47271136,43935930,59643137,64183008,8892641,39587569,85086654,5663585,82925096,24868817,95900395,48155864,74447380,7618448,63299623,91141186,33347112,81951555,52867615,92184410,7024265,85525916,29846922,59532692,47267934,6514603,1137830,97807470};
		int k = 41;
		System.out.println(maximumHappinessSum(happiness, k));
	}
	
    public static long maximumHappinessSum(int[] happiness, int k) {
    	Arrays.sort(happiness);
    	long sum = 0;
    	for(int i = 1; i <= k; i++) {
    		if(happiness[happiness.length - i] < 0) {
    			happiness[happiness.length - i] = 0;
    		}
    		
    		sum = sum + happiness[happiness.length - i];
    		if(happiness.length - i - 1 < 0) {
    			return sum;
    		}
    		
    		happiness[happiness.length - i - 1] = happiness[happiness.length - i - 1] - i;
    	}
    	
        return sum;
    }
}
