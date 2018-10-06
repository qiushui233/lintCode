package Leetcode;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 */
public class leet014 {
    public String longestCommonPrefix(String[] strs) {
        /*if (strs == null || strs.length == 0){
            return "";
        }else if (strs.length == 1){
            return strs[0];
        }

        String minstr = strs[0];

        for (int i = 1; i < strs.length; i++) {
            if (minstr.length() > strs[i].length()){
                minstr = strs[i];
            }
        }


        String same = "";

        int i=0;
        int j=0;
        for (j = 0; j < minstr.length(); j++) {
            for (i = 0; i < strs.length; i++) {
                if (minstr.charAt(j) == strs[i].charAt(j)) {
                        same = minstr.substring(0, j);
                    }
            }
        }
        return same;*/

        if(strs==null||strs.length==0)
            return "";
        else if(strs.length==1)
            return strs[0];
        int min = 0;
        for(int i=1;i<strs.length;i++){
            if(strs[min].length()>strs[i].length())
                min = i;
        }
        int end = -1;
        for(int i=1;i<=strs[min].length();i++){
            String s = strs[min].substring(0,i);
            for(String str:strs)
                if(!str.startsWith(s)){
                    end = i-1;
                    i=strs.length+1;
                    break;
                }else if(i==strs[min].length())
                    end = i;
        }
        return end<=0?"":strs[min].substring(0,end);
    }
}
