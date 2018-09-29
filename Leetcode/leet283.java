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

//        for (int i = 0,j = 1; i < nums.length; j++) {
//            if (nums[i] == 0){
//                if (nums[j] != 0){
//                    int t = nums[j];
//                    nums[j] = nums[i];
//                    nums[i] = t;
//                    i++;
//                }
//            }else {
//                i++;
//            }
//        }


        int lastNoneZeroIdx = 0;
        for(int idx = 0; idx < nums.length;idx++){
            if(nums[idx] != 0){
                nums[lastNoneZeroIdx] = nums[idx];   //吧不为零的数与零交换
                if(idx != lastNoneZeroIdx){
                    nums[idx] = 0;
                }
                lastNoneZeroIdx ++;
            }

        }


    }
}
