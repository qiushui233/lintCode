package Leetcode;

import java.util.Arrays;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
public class leet283 {

    public static void main(String[] args) {
        int[] a = {0,1,0,3,12};

        moveZeroes(a);

        for (int b: a
             ) {
            System.out.print(b + " ");
        }

    }

    public static void moveZeroes(int[] nums) {
        Arrays.sort(nums);


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                int t = nums[nums.length - 1 - i];
                nums[i] = t;
                nums[nums.length - 1 - i] = nums[i];
            }
        }


    }
}
