package Leetcode;

import java.util.Arrays;

/**
 *给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 *
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class leet001 {

    public static void main(String[] args) {
        int[] a = {3,2,4};
        int b = 6;

        twoSum(a,b);

//        for (int i = 0; i < c.length; i++) {
//            System.out.println(c[i]);
//        }

    }

    public static int[] twoSum(int[] nums, int target) {


        int[] to = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {

                    System.out.println(nums[i]);
                    System.out.println(nums[j]);

                    to[0] = i;
                    to[1] = j;
                    break;
                }
            }
//            if (nums[to[0]] + nums[to[1]] == target) break;
        }

        return to;
    }
}
