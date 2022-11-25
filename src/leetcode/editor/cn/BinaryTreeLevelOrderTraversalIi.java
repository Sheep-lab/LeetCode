package leetcode.editor.cn;
//给你二叉树的根节点 root ，返回其节点值 自底向上的层序遍历 。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
// 示例 1：
//输入：root = [3,9,20,null,null,15,7]
//输出：[[15,7],[9,20],[3]]
// 示例 2：
//输入：root = [1]
//输出：[[1]]
// 示例 3：
//输入：root = []
//输出：[]
// 提示：
// 树中节点数目在范围 [0, 2000] 内 
// -1000 <= Node.val <= 1000 
// 
//
// Related Topics 树 广度优先搜索 二叉树 👍 632 👎 0

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalIi{
    public static void main(String[] args) {
        Solution solution = new BinaryTreeLevelOrderTraversalIi().new Solution();
        
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root==null)
            return new ArrayList<List<Integer>>();
        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
        checkFun(list,root,0);
        ArrayList<List<Integer>> reslist = new ArrayList<List<Integer>>();
        for (int i = list.size()-1; i >=0 ; i--) {
            reslist.add(list.get(i));
        }
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
