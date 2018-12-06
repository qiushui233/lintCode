/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

示例:

输入: [-2,1,-3,4,-1,2,1,-5,4],
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
进阶:

如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 * @author 程浩洋
 *
 */
public class leet053 {
    public int maxSubArray(int[] nums) {
    	int n = nums.length;		//数组长度
        int[] dp = new int[n];	
        dp[0] = nums[0];			
        int max = dp[0];			//最大值初始值取数组第一个

        
        /*
         *  1. 要么加入之前的数组加和之中（跟别人一组）
			 2. 要么自己单立一个数组（自己单开一组）
		 	所以对于这个元素应该如何选择，就看他能对哪个组的贡献大。如果跟别人一组，能让总加和变大，还是跟别人一组好了；
			如果自己起个头一组，自己的值比之前加和的值还要大，那么还是自己单开一组好了。
			所以利用一个sum数组，记录每一轮sum的最大值，sum[i]表示当前这个元素是跟之前数组加和一组还是自己单立一组好，
         */
        for(int i = 1; i < n; i++){
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
