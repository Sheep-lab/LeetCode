package leetcode.editor.cn;
//给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
// 示例 1：
//输入：root = [3,9,20,null,null,15,7]
//输出：[[3],[9,20],[15,7]]
// 示例 2：
//输入：root = [1]
//输出：[[1]]
// 示例 3：
//输入：root = []
//输出：[]
// 提示：
// 树中节点数目在范围 [0, 2000] 内 
// -1000 <= Node.val <= 1000
// Related Topics 树 广度优先搜索 二叉树 👍 1513 👎 0

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal{
    public static void main(String[] args) {
        Solution solution = new BinaryTreeLevelOrderTraversal().new Solution();
        
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null)
            return new ArrayList<List<Integer>>();
        ArrayList<List<Integer>> reslist = new ArrayList<List<Integer>>();
        checkFun(reslist,root,0);
        return reslist;
    }

    public void checkFun(List<List<Integer>> list,TreeNode root,Integer deep){
        if (root==null)
            return;
        deep++;
        if (list.size()<deep){
            List<Integer> arrayList = new ArrayList<Integer>();
            list.add(arrayList);
        }
        list.get(deep-1).add(root.val);
        checkFun(list,root.left,deep);
        checkFun(list,root.right,deep);


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
