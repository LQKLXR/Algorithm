package leetcode.tag_string;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.cn/problems/longest-substring-without-repeating-characters/">地址</a>

给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
示例 1:
输入: s = "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。

示例 2:
输入: s = "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。

示例 3:
输入: s = "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。

提示：
0 <= s.length <= 5 * 104
s 由英文字母、数字、符号和空格组成
 */

public class LeetCode03 {

    public int lengthOfLongestSubstring(String s) {
        // 特殊情况
        if (s == null || s.isEmpty()) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        // 一般情况下
        int result = 1;
        // 采用双指针的算法实现
        int leftIndex = 0;
        int rightIndex = 0;
        // 输入的字符串长度
        int inputSequenceLength = s.length();
        // 保存当前字符串的所有字符
        Set<Character> characters = new HashSet<>();
        // 先把首字母加进去
        characters.add(s.charAt(rightIndex));
        while (rightIndex != inputSequenceLength - 1) {
            rightIndex++;
            // 如果当前已经包括了最新的字符，左指针开始往右边移动
            while (characters.contains(s.charAt(rightIndex))) {
                characters.remove(s.charAt(leftIndex));
                leftIndex++;
            }
            characters.add(s.charAt(rightIndex));
            result = Math.max(result, characters.size());
        }
        return result;
    }

    public static void main(String[] args) {
        LeetCode03 object = new LeetCode03();
        int result1 = object.lengthOfLongestSubstring("abcabcbb");
        System.out.println(result1 == 3);
        int result2 = object.lengthOfLongestSubstring("bbbbb");
        System.out.println(result2 == 1);
        int result3 = object.lengthOfLongestSubstring("pwwkew");
        System.out.println(result3 == 3);
    }

}
