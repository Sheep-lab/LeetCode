package leetcode.editor.cn;
//给定一棵二叉树的根节点 root ，请找出该二叉树中每一层的最大值。
// 示例1：
//输入: root = [1,3,2,5,3,null,9]
//输出: [1,3,9]
// 示例2：
//输入: root = [1,2,3]
//输出: [1,3]
// 提示：
// 二叉树的节点个数的范围是 [0,10⁴]
// -2³¹ <= Node.val <= 2³¹ - 1
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 284 👎 0

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class FindLargestValueInEachTreeRow{
    public static void main(String[] args) {
        Solution solution = new FindLargestValueInEachTreeRow().new Solution();
        
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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        if (root==null)
            return list;
        deque.offer(root);
        while (!deque.isEmpty()){
            int dequeSize=deque.size();
            int max=Integer.MIN_VALUE;
            for (int i = 0; i < dequeSize; i++) {
                TreeNode node=deque.poll();
                max=Math.max(max,node.val);
                if (node.left!=null)
                    deque.offer(node.left);
                if (node.right!=null)
                    deque.offer(node.right);
            }
            list.add(max);
        }
        return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
