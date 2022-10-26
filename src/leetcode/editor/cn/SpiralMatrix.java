package leetcode.editor.cn;
//给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
// 示例 1：
//输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
//输出：[1,2,3,6,9,8,7,4,5]
// 示例 2：
//输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//输出：[1,2,3,4,8,12,11,10,9,5,6,7]
// 提示：
// m == matrix.length 
// n == matrix[i].length 
// 1 <= m, n <= 10 
// -100 <= matrix[i][j] <= 100
// Related Topics 数组 矩阵 模拟 👍 1246 👎 0

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix{
    public static void main(String[] args) {
        Solution solution = new SpiralMatrix().new Solution();
        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int m = matrix.length;
        int n = matrix[0].length;
        if (matrix == null || m == 0 || n == 0)
            return list;

        int left = 0, right = n - 1, top = 0, bottom = m - 1;
        while (left <= right && top <= bottom) {
            for (int j = left; j <= right; j++)
                list.add(matrix[top][j]);
            for (int i = top + 1; i <= bottom; i++)
                list.add(matrix[i][right]);
            if (left < right && top < bottom) {
                for (int j = right - 1; j > left; j--)
                    list.add(matrix[bottom][j]);
                for (int i = bottom; i > top; i--)
                    list.add(matrix[i][left]);
            }
            left++;
            top++;
            right--;
            bottom--;
        }

        return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
