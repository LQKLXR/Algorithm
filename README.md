# Algorithm


## [leetcode](src/leetcode)

[leetcode-array](src/leetcode/tag_array) contains some problems about array;

[leetcode-string](src/leetcode/tag_string) contains some problems about string;

### leetcode-array
#### [LeetCode01.java](src/leetcode/tag_array/LeetCode01.java) 两数之和
>
> https://leetcode.cn/problems/two-sum/description/
> 
> 两数之和
> 
> 简单
> 
>    给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
> 
> 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
> 
> 你可以按任意顺序返回答案。
> 
> 
> 
> 示例 1：
> 
> 输入：nums = [2,7,11,15], target = 9
> 输出：[0,1]
> 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
> 示例 2：
> 
> 输入：nums = [3,2,4], target = 6
> 输出：[1,2]
> 示例 3：
> 
> 输入：nums = [3,3], target = 6
> 输出：[0,1]
> 
> 
> 提示：
> 
> 2 <= nums.length <= 104
> -109 <= nums[i] <= 109
> -109 <= target <= 109
> 只会存在一个有效答案
> 
> @see LeetCode15 三数之和

#### [LeetCode15.java](src/leetcode/tag_array/LeetCode15.java) 三数之和
>
> https://leetcode.cn/problems/3sum/description/
> <p>
> 15. 三数之和
> 中等
> 相关标签
> 相关企业
> 提示
> 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
> <p>
> 你返回所有和为 0 且不重复的三元组。
> <p>
> 注意：答案中不可以包含重复的三元组。
> <p>
> <p>
> 示例 1：
> <p>
> 输入：nums = [-1,0,1,2,-1,-4]
> 输出：[[-1,-1,2],[-1,0,1]]
> 解释：
> nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
> nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
> nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
> 不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
> 注意，输出的顺序和三元组的顺序并不重要。
> 示例 2：
> <p>
> 输入：nums = [0,1,1]
> 输出：[]
> 解释：唯一可能的三元组和不为 0 。
> 示例 3：
> <p>
> 输入：nums = [0,0,0]
> 输出：[[0,0,0]]
> 解释：唯一可能的三元组和为 0 。
> <p>
> <p>
> 提示：
> <p>
> 3 <= nums.length <= 3000
> -105 <= nums[i] <= 105
> 
> @see LeetCode01 两数之和

### leetcode-string
#### [LeetCode03.java](src/leetcode/tag_string/LeetCode03.java) 无重复的最长子串
> https://leetcode.cn/problems/longest-substring-without-repeating-characters/
> 
>  给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
> 
> 
> 
>  示例 1:
> 
>  输入: s = "abcabcbb"
>  输出: 3
>  解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
>  示例 2:
> 
>  输入: s = "bbbbb"
>  输出: 1
>  解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
>  示例 3:
> 
>  输入: s = "pwwkew"
>  输出: 3
>  解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
>       请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
> 
> 
>  提示：
> 
>  0 <= s.length <= 5 * 104
>  s 由英文字母、数字、符号和空格组成

#### [LeetCode14.java](src/leetcode/tag_string/LeetCode14.java) 最长公共前缀
> 14. 最长公共前缀
> 
> https://leetcode.cn/problems/longest-common-prefix/description/
>  编写一个函数来查找字符串数组中的最长公共前缀。
> 
>  如果不存在公共前缀，返回空字符串 ""。
> 
> 
> 
>  示例 1：
> 
>  输入：strs = ["flower","flow","flight"]
>  输出："fl"
>  示例 2：
> 
>  输入：strs = ["dog","racecar","car"]
>  输出：""
>  解释：输入不存在公共前缀。
> 
> 
>  提示：
> 
>  1 <= strs.length <= 200
>  0 <= strs[i].length <= 200
>  strs[i] 仅由小写英文字母组成


#### [LeetCode139.java](src/leetcode/tag_string/LeetCode139.java) 单词拆分
>  https://leetcode.cn/problems/word-break/description/
>
> 139. 单词拆分
>
> 给你一个字符串 s 和一个字符串列表 wordDict 作为字典。请你判断是否可以利用字典中出现的单词拼接出 s 。
>
> 注意：不要求字典中出现的单词全部都使用，并且字典中的单词可以重复使用。
>
>
>
> 示例 1：
>
> 输入: s = "leetcode", wordDict = ["leet", "code"]
> 输出: true
> 解释: 返回 true 因为 "leetcode" 可以由 "leet" 和 "code" 拼接成。
> 示例 2：
>
> 输入: s = "applepenapple", wordDict = ["apple", "pen"]
> 输出: true
> 解释: 返回 true 因为 "applepenapple" 可以由 "apple" "pen" "apple" 拼接成。
>      注意，你可以重复使用字典中的单词。
> 示例 3：
>
> 输入: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
> 输出: false
>
>
> 提示：
>
> 1 <= s.length <= 300
> 1 <= wordDict.length <= 1000
> 1 <= wordDict[i].length <= 20
> s 和 wordDict[i] 仅由小写英文字母组成
> wordDict 中的所有字符串 互不相同

#### [LeetCode187.java](src/leetcode/tag_string/LeetCode187.java) 重复的DNA序列
>
> https://leetcode.cn/problems/repeated-dna-sequences/description/
> 
> DNA序列 由一系列核苷酸组成，缩写为 'A', 'C', 'G' 和 'T'.。
> 
> 例如，"ACGAATTCCG" 是一个 DNA序列 。
> 在研究 DNA 时，识别 DNA 中的重复序列非常有用。
> 
> 给定一个表示 DNA序列 的字符串 s ，返回所有在 DNA 分子中出现不止一次的 长度为 10 的序列(子字符串)。你可以按 任意顺序 返回答案。
> 
> 
> 
> 示例 1：
> 
> 输入：s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
> 输出：["AAAAACCCCC","CCCCCAAAAA"]
> 示例 2：
> 
> 输入：s = "AAAAAAAAAAAAA"
> 输出：["AAAAAAAAAA"]
> 
> 
> 提示：
> 
> 0 <= s.length <= 105
> s[i]=='A'、'C'、'G' or 'T'