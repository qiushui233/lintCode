package lintCode;

/**
 * 设计一个算法，并编写代码来序列化和反序列化二叉树。将树写入一个文件被称为“序列化”，读取文件后重建同样的二叉树被称为“反序列化”。
 * 如何反序列化或序列化二叉树是没有限制的，你只需要确保可以将二叉树序列化为一个字符串，并且可以将字符串反序列化为原来的树结构。
 *
 * 给出一个测试数据样例， 二叉树{3,9,20,#,#,15,7}，表示如下的树结构：
 *   3
 *  / \
 * 9  20
 *   /  \
 *  15   7
 * 我们的数据是进行BFS遍历得到的。当你测试结果wrong answer时，你可以作为输入调试你的代码。
 * 你可以采用其他的方法进行序列化和反序列化。
 */
public class test007 {

    /**
     * This method will be invoked first, you should design your own algorithm
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    public String serialize(TreeNode root) {
        // write your code here
    }

    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in
     * "serialize" method.
     */
    public TreeNode deserialize(String data) {
        // write your code here
    }
}

class TreeNode {
     public int val;
     public TreeNode left, right;
     TreeNode(int val) {
          this.val = val;
          this.left = this.right = null;
     }
 }