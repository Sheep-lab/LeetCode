package leetcode.editor.cn;
//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
// 示例 1：
// 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
//输出：[1,2,3,6,9,8,7,4,5]
// 示例 2：
// 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//输出：[1,2,3,4,8,12,11,10,9,5,6,7]
// 限制：
// 0 <= matrix.length <= 100 
// 0 <= matrix[i].length <= 100
// 注意：本题与主站 54 题相同：https://leetcode-cn.com/problems/spiral-matrix/
// Related Topics 数组 矩阵 模拟 👍 463 👎 0

import java.util.ArrayList;

public class ShunShiZhenDaYinJuZhenLcof{
    public static void main(String[] args) {
        Solution solution = new ShunShiZhenDaYinJuZhenLcof().new Solution();
        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=0;
        if (m!=0)//为了防止m=0时，matrix[0].length索引越界
            n=matrix[0].length;
        int[] list = new int[m*n];
        if (matrix==null||m==0||n==0)
            return list;
        int left=0,right=n-1;
        int top=0,bottom=m-1;
        int sum=0;
        while (left<=right&&top<=bottom){
            for (int j = left; j <=right; j++) {
                list[sum++]=matrix[top][j];
            }
            for (int i = top+1; i <=bottom ; i++) {
                list[sum++]=matrix[i][right];
            }
            if (left<right&&top<bottom){
                for (int j = right-1; j >left; j--) {
                    list[sum++]=matrix[bottom][j];
                }
                for (int i = bottom; i >top ; i--) {
                    list[sum++]=matrix[i][left];
                }
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
