package Leetcode;

/**
 * 翻转一棵二叉树。
 *
 * 示例：
 *
 * 输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 */
public class leet226 {
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            invertTreeNode(root);
        }
        return root;

    }
    public void invertTreeNode(TreeNode root) {

        if (root != null) {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;

            invertTree(root.left);
            invertTree(root.right);
        }
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}