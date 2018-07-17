package lintCode;
/**
 * 给你一个整数n. 从 1 到 n 按照下面的规则打印每个数：
 * 如果这个数被3整除，打印fizz.
 * 如果这个数被5整除，打印buzz.
 * 如果这个数能同时被3和5整除，打印fizz buzz.
 * 样例
 * 比如 n = 15, 返回一个字符串数组：
 * [ "1", "2", "fizz",
 *   "4", "buzz", "fizz",
 *   "7", "8", "fizz",
 *   "buzz", "11", "fizz",
 *   "13", "14", "fizz buzz"]
 * 挑战  Can you do it with only one if statement?
 */

import java.util.ArrayList;
import java.util.List;

public class test009 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int n = 15;
        list = fizzBuzz(n);
        System.out.println(list);
    }

    public static List<String> fizzBuzz(int n) {
        // write your code here
        String three = "fizz";
        String five = "buzz";
        String both = "fizz buzz";
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 ==0 && i % 5 == 0){
                list.add(both);
            }else if (i % 3 == 0){
                list.add(three);
            }else if (i % 5 == 0){
                list.add(five);
            }else {
                String s = ""+i;
                list.add(s);
            }
        }
        return list;
    }
}
