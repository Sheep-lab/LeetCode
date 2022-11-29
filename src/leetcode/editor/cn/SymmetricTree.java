package leetcode.editor.cn;
//给你一个二叉树的根节点 root ， 检查它是否轴对称。
// 示例 1：
//输入：root = [1,2,2,3,4,4,3]
//输出：true
// 示例 2：
//输入：root = [1,2,2,null,3,null,3]
//输出：false
// 提示：
// 树中节点数目在范围 [1, 1000] 内 
// -100 <= Node.val <= 100
// 进阶：你可以运用递归和迭代两种方法解决这个问题吗？ 
//
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 2200 👎 0

import javax.swing.tree.TreeNode;
import java.util.Deque;
import java.util.LinkedList;

public class SymmetricTree{
    public static void main(String[] args) {
        Solution solution = new SymmetricTree().new Solution();
        
    }
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root==null)
            return true;
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
        deque.offer(root.left);
        deque.offer(root.right);
        while (!deque.isEmpty()){
            TreeNode leftNode=deque.pop();
            TreeNode rightNode=deque.pop();
            if (leftNode==null&&rightNode==null)
                continue;
            if (leftNode==null||rightNode==null||leftNode.val!=rightNode.val){
                return false;
            }
            deque.offer(leftNode.left);
            deque.offer(rightNode.right);
            deque.offer(leftNode.right);
            deque.offer(rightNode.left);
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
