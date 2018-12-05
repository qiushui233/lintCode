package Leetcode;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 */
public class leet020 {
    public boolean isValid(String s) {
        if (s == null || s == "") return true;
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack();

        //if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') return false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }else if (s.charAt(i) == ')'){
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }else if (s.charAt(i) == ']' ){
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }else if (s.charAt(i) == '}'){
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }else {
                return false;
            }
        }

        if (stack.isEmpty()) return true;
        else return false;
    }
}
