package Leetcode;

/**
 *
 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。

 示例 1:

 输入: nums = [1,2,3,1], k = 3
 输出: true
 示例 2:

 输入: nums = [1,0,1,1], k = 1
 输出: true
 示例 3:

 输入: nums = [1,2,3,1,2,3], k = 2
 输出: false
 */
public class leet219 {

    public static void main(String[] args) {
        int[] a = {99,99};

        System.out.println(containsNearbyDuplicate(a,2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        if (nums.length == 0 || nums.length == 1) return false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                {
                    if (j-i == k)
                        return true;
                }
            }
        }
        return false;
    }
}
