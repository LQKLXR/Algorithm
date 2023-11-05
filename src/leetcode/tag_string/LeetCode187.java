package leetcode.tag_string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * https://leetcode.cn/problems/repeated-dna-sequences/description/?envType=daily-question&envId=2023-11-05
 * 重复的DNA序列
 *
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
