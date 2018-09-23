package Leetcode;

/**
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 *
 * 示例 1:
 *
 * 输入: 1
 * 输出: true
 * 解释: 20 = 1
 * 示例 2:
 *
 * 输入: 16
 * 输出: true
 * 解释: 24 = 16
 * 示例 3:
 *
 * 输入: 218
 * 输出: false
 */
public class leet231 {
    public boolean isPowerOfTwo(int n) {

        int m = 2;

        if (n <= 0) return false;
        if (n == 1) return true;



        while (n % m == 0){
            if (n == m) return true;
            m *= 2;
        }
        return false;
    }
}
