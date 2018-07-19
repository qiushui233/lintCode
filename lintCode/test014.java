package lintCode;

/**
 * 给定一个排序的整数数组（升序）和一个要查找的整数target，用O(logn)的时间查找到target第一次出现的下标（从0开始），如果target不存在于数组中，返回-1。
 * 样例
 * 在数组 [1, 2, 3, 3, 4, 5, 10] 中二分查找3，返回2。
 * 挑战
 * 如果数组中的整数个数超过了2^32，你的算法是否会出错？
 */
public class test014 {
    public static void main(String[] args) {
        int[] a = {1,4,4,5,7,7,8,9,9,10};
        int tar = 1;
        System.out.println(binarySearch(a,tar));
    }

    public static int binarySearch(int[] nums, int target) {
        // write your code here
        return search(nums,target,0,nums.length-1);
    }

    public static int search(int[] nums,int target, int first, int last){
        if (first == last){
            if (nums[first] == target){
                return first;
            }else {
                return -1;
            }
        }else {
            int mid = (first + last) / 2;
            if (target == nums[mid]) {
                if(search(nums,target,first,mid) == -1)//查找前一半有没有相同的数
                    return nums[mid];
                else
                    return search(nums,target,first,mid);
            }else if (target > nums[mid]){
                return search(nums,target,mid + 1,last);
            }else if (target < nums[mid]){
                return search(nums,target,first,mid);
            }
            return -1;
        }
    }
}
