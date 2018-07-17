package lintCode;

import java.util.Arrays;

/**
 * 给定一个字符串和一个偏移量，根据偏移量旋转字符串(从左向右旋转)
 * 样例
 * 对于字符串 "abcdefg".
 * offset=0 => "abcdefg"
 * offset=1 => "gabcdef"
 * offset=2 => "fgabcde"
 * offset=3 => "efgabcd"
 * 挑战
 * 在数组上原地旋转，使用O(1)的额外空间
 */
public class test008 {

    public static void main(String[] args) {
        String s = "abcdefg";
        char[] str = {'a','b','c','d','e','f','g'};
        int iff = 3;
        rotateString(str,iff);
    }

    public static void rotateString(char[] str, int offset) {
        char[] a = new char[str.length];
        for (int i = 0; i < offset ; i++) {
            a[i] = str[i+4];
        }
        for (int i = offset; i <str.length ; i++) {
            a[i] = str[i-3];
        }
        String result = String.valueOf(a);
        System.out.println(result);
    }
}
