package leetcode.editor.cn;
//给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
// 如果数组中不存在目标值 target，返回 [-1, -1]。
// 你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。 
//
// 示例 1：
//输入：nums = [5,7,7,8,8,10], target = 8
//输出：[3,4] 
//
// 示例 2：
//输入：nums = [5,7,7,8,8,10], target = 6
//输出：[-1,-1] 
//
// 示例 3：
//输入：nums = [], target = 0
//输出：[-1,-1] 

// 提示：
// 0 <= nums.length <= 10⁵ 
// -10⁹ <= nums[i] <= 10⁹ 
// nums 是一个非递减数组 
// -10⁹ <= target <= 10⁹ 
//
// Related Topics 数组 二分查找 👍 1960 👎 0

public class FindFirstAndLastPositionOfElementInSortedArray{
    public static void main(String[] args) {
        Solution solution = new FindFirstAndLastPositionOfElementInSortedArray().new Solution();
        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int leftBorder = getLeftBorder(nums, target);
        int righBorder = getRighBorder(nums, target);
        if (leftBorder==-2||righBorder==-2)
            return new int[]{-1,-1};
        else if (righBorder-leftBorder>=0)
            return new int[]{leftBorder,righBorder};
        else
            return new int[]{-1,- 1};
    }

    public int getLeftBorder(int[] nums, int target){
        int left=0,right=nums.length;
        int leftBorder=-2;
        while (left<right){
            int mid=left+(right-left)/2;
            if(target<=nums[mid]){//只有取等号，遇到相同值的时候right才能一直往左边推进，当right取到最后一个相等的值即为左边界
                right=mid;
                leftBorder=right;
            }else
                left=mid+1;
        }
        return leftBorder;
    }

    public int getRighBorder(int[] nums, int target){
        int left=0,right=nums.length;
        int righBorder=-2;
        while (left<right){
            int mid=left+(right-left)/2;
            if (target>=nums[mid]){
                left=mid+1;
                righBorder=left;
            }else
                right=mid;
        }
        return righBorder-1;//区间采用的左闭右开，最右边是取不到的
    }
}


//leetcode submit region end(Prohibit modification and deletion)

}
