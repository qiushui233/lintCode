package lintCode;

/**
 * 对于一个给定的 source 字符串和一个 target 字符串，你应该在 source 字符串中找出 target 字符串出现的第一个位置(从0开始)。如果不存在，则返回 -1。
 * 在面试中我是否需要实现KMP算法？
 * 不需要，当这种问题出现在面试中时，面试官很可能只是想要测试一下你的基础应用能力。当然你需要先跟面试官确认清楚要怎么实现这个题。
 * 样例
 * 如果 source = "source" 和 target = "target"，返回 -1。
 * 如果 source = "abcdabcdefg" 和 target = "bcd"，返回 1。
 * 挑战
 * O(n2)的算法是可以接受的。如果你能用O(n)的算法做出来那更加好。（提示：KMP）
 */
public class test013 {

    public static void main(String[] args) {
        String s1 = "abcdabcdefg";
        String s2 = "bcd";

        System.out.println(strStr(s1,s2));
    }

    public static int strStr(String source, String target) {
        // write your code here

        if (source == "" && target == "") return 0;
        if (target == "") return 0;
        if (source == "") return -1;

        for (int i = 0; i < source.length() ; i++) {
            if (source.length() - i < target.length()) return -1;

            int k = i;
            int j = 0;

            while (source.charAt(k) == target.charAt(j)){
                k++;
                j++;
                if (j == target.length()) return 1;
            }
        }
        return -1;
    }
}
