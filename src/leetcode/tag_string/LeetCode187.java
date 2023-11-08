package leetcode.tag_string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 https://leetcode.cn/problems/repeated-dna-sequences/description/?envType=daily-question&envId=2023-11-05
 DNA序列 由一系列核苷酸组成，缩写为 'A', 'C', 'G' 和 'T'.。
 例如，"ACGAATTCCG" 是一个 DNA序列 。
 在研究 DNA 时，识别 DNA 中的重复序列非常有用。
 给定一个表示 DNA序列 的字符串 s ，返回所有在 DNA 分子中出现不止一次的 长度为 10 的序列(子字符串)。你可以按 任意顺序 返回答案。
 示例 1：
 输入：s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
 输出：["AAAAACCCCC","CCCCCAAAAA"]
 示例 2：
 输入：s = "AAAAAAAAAAAAA"
 输出：["AAAAAAAAAA"]
 提示：
 0 <= s.length <= 105
 s[i]=='A'、'C'、'G' or 'T'
 */
public class LeetCode187 {

    public List<String> findRepeatedDnaSequences(String s) {
        if (s.length() <= 10) {
            return new ArrayList<>();
        }
        Set<String> result = new HashSet<>();
        // 之前出现过的10位字符串
        Set<String> appearedString = new HashSet<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String sub = s.substring(i, i + 10);
            if (appearedString.contains(sub)) {
                result.add(sub);
            }
            else {
                appearedString.add(sub);
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        LeetCode187 object = new LeetCode187();
        List<String> result = object.findRepeatedDnaSequences("AAAAAAAAAAA");
        for (String s : result) {
            System.out.println(s);
        }
    }
}
