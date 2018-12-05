package Leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 *
 * 输入:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * 输出: ["1->2->5", "1->3"]
 *
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 */
public class leet257 {
    List<String> paths = new LinkedList<>();

     List<String> binaryTreePaths(TreeNode root) {



        if(root==null)
            return paths;
        String curPath="";
        serachTree(root, curPath);
        return paths;
    }

    public  void serachTree(TreeNode root,String currentPath) {
        currentPath+=root.val;
        if(root.left == null && root.right == null)
        {
            paths.add(currentPath);
            System.out.println(currentPath);
            return;
        }
        currentPath+="->";
        if(root.left!=null)
            serachTree(root.left, currentPath);
        if(root.right!=null)
            serachTree(root.right, currentPath);

    }

}
