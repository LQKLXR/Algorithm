package leetcode.tag_string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
<a href="https://leetcode.cn/problems/word-break/description/">...</a>

139. 单词拆分

给你一个字符串 s 和一个字符串列表 wordDict 作为字典。请你判断是否可以利用字典中出现的单词拼接出 s 。

注意：不要求字典中出现的单词全部都使用，并且字典中的单词可以重复使用。



示例 1：

输入: s = "leetcode", wordDict = ["leet", "code"]
输出: true
解释: 返回 true 因为 "leetcode" 可以由 "leet" 和 "code" 拼接成。
示例 2：

输入: s = "applepenapple", wordDict = ["apple", "pen"]
输出: true
解释: 返回 true 因为 "applepenapple" 可以由 "apple" "pen" "apple" 拼接成。
     注意，你可以重复使用字典中的单词。
示例 3：

输入: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
输出: false


提示：

1 <= s.length <= 300
1 <= wordDict.length <= 1000
1 <= wordDict[i].length <= 20
s 和 wordDict[i] 仅由小写英文字母组成
wordDict 中的所有字符串 互不相同

 */
public class LeetCode139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        Set<String> dictSet = new HashSet<String>(wordDict);
        int length = s.length();
        boolean[] dp = new boolean[length + 1];
        dp[0] = true;
        // 把(0 , i)分成(0 , j - 1) (j , i) 两个字符串
        for (int i = 1; i <= length; i++) {
            // j 从 0 加到 i, 只要有一个满足, 就代表 i 可以被拆分
            for (int j = 0; j < i; j ++) {
                if (dp[j] == true && dictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[length];
    }


    public static void main(String[] args) {
        LeetCode139 object = new LeetCode139();
        boolean result1 = object.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat"));
        System.out.println(result1 == false);
        boolean result2 = object.wordBreak("applepenapple", Arrays.asList("apple", "pen"));
        System.out.println(result2 == true);
        boolean result3 = object.wordBreak("leetcode", Arrays.asList("leet", "code"));
        System.out.println(result3 == true);
    }
}
