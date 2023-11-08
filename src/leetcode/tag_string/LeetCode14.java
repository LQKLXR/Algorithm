package leetcode.tag_string;

/**
 * 14. 最长公共前缀

<a href="https://leetcode.cn/problems/longest-common-prefix/description/">...</a>
 编写一个函数来查找字符串数组中的最长公共前缀。

 如果不存在公共前缀，返回空字符串 ""。



 示例 1：

 输入：strs = ["flower","flow","flight"]
 输出："fl"
 示例 2：

 输入：strs = ["dog","racecar","car"]
 输出：""
 解释：输入不存在公共前缀。


 提示：

 1 <= strs.length <= 200
 0 <= strs[i].length <= 200
 strs[i] 仅由小写英文字母组成
 */
public class LeetCode14 {
    public String longestCommonPrefix(String[] strs) {
        // 记录最短的字符串的长度，每次只需要遍历到这个长度
        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.isEmpty())
                return "";
            minLength = Math.min(minLength, str.length());
        }
        StringBuilder stringBuilder = new StringBuilder();
        char curCharacter = 0;
        for (int i = 0; i <minLength; i++) {
            // 取出来第一个字符串的当前下标的字符
            curCharacter = strs[0].charAt(i);
            // 逐一与其他字符串当前下标的字符相比较
            for (String str : strs) {
                // 如果有一个不相等，证明不公共了，就直接返回之前的结果
                if (str.charAt(i) != curCharacter) {
                    return stringBuilder.toString();
                }
            }
            stringBuilder.append(strs[0].charAt(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        LeetCode14 object = new LeetCode14();
        String result = object.longestCommonPrefix(new String[]{"flower","flow","flight"});
        System.out.println(result);
    }
}
