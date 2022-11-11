package leetcode.editor.cn;
//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
// 示例 1：
// 输入：s = "We are happy."
//输出："We%20are%20happy."
// 限制：
// 0 <= s 的长度 <= 10000
// Related Topics 字符串 👍 365 👎 0

public class TiHuanKongGeLcof{
    public static void main(String[] args) {
        Solution solution = new TiHuanKongGeLcof().new Solution();
        
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String replaceSpace(String s) {
        if(s==null||s.length()==0)
            return s;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' ')
                sb.append("  ");
        }

        if (sb.length()==0)
            return s;
        int left=s.length()-1;
        s=s+sb.toString();
        int right=s.length()-1;
        char[] chars = s.toCharArray();
        while (left>=0){
            if (chars[left]==' '){
                chars[right--]='0';
                chars[right--]='2';
                chars[right]='%';
            }else
                chars[right]=chars[left];
            left--;
            right--;
        }
        return new String(chars);

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
