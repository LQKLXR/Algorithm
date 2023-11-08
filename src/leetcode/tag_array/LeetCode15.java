package leetcode.tag_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * https://leetcode.cn/problems/3sum/description/
 * 15. 三数之和

 <p>
 15. 三数之和
 中等
 相关标签
 相关企业
 提示
 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。
 请你返回所有和为 0 且不重复的三元组。
 <p>
 注意：答案中不可以包含重复的三元组。
 <p>
 <p>
 示例 1：
 <p>
 输入：nums = [-1,0,1,2,-1,-4]
 输出：[[-1,-1,2],[-1,0,1]]
 解释：
 nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
 nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
 nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
 不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
 注意，输出的顺序和三元组的顺序并不重要。
 示例 2：
 <p>
 输入：nums = [0,1,1]
 输出：[]
 解释：唯一可能的三元组和不为 0 。
 示例 3：
 <p>
 输入：nums = [0,0,0]
 输出：[[0,0,0]]
 解释：唯一可能的三元组和为 0 。
 <p>
 <p>
 提示：
 <p>
 3 <= nums.length <= 3000
 -105 <= nums[i] <= 105
 @see LeetCode01 两数之和

 */
public class LeetCode15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // 三元组不可重复，为降低处理复杂度，先将数组进行排序
        Arrays.sort(nums);
        // 对第一层数字进行循环
        for (int firstIndex = 0; firstIndex < nums.length - 2; firstIndex++) {
            if (firstIndex != 0 && nums[firstIndex] == nums[firstIndex - 1]) {
                continue;
            }
            // 现在要从 [firstIndex + 1, nums.length-1] 的区间里面取出来另外两个数字
            // 采用双指针的方法，secondIndex 从最左边开始处理, thirdIndex 从最右边开始处理
            int secondIndex = firstIndex + 1;
            int thirdIndex = nums.length - 1;
            // 只要两者没有相遇，就继续循环
            while (secondIndex < thirdIndex) {
                // 保证初始化指针后的第一次必须要执行
                // 如果左指针不是初始化的指针，而且跟上一个处理过的数据相同
                if (secondIndex != firstIndex + 1 && nums[secondIndex] == nums[secondIndex - 1]) {
                    secondIndex++;
                    continue;
                }
                // 保证初始化指针后的第一次必须要执行
                // 如果右指针不是初始化的指针，而且跟上一个处理过的数据相同
                if (thirdIndex != nums.length - 1 && nums[thirdIndex] == nums[thirdIndex + 1]) {
                    thirdIndex--;
                    continue;
                }
                // 计算数字和
                int curSum = nums[firstIndex] + nums[secondIndex] + nums[thirdIndex];
                if (curSum == 0) {
                    result.add(Arrays.asList(nums[firstIndex], nums[secondIndex], nums[thirdIndex]));
                    secondIndex++;
                    thirdIndex--;
                }
                // 如果结果过大，说明右指针太大了，需要往左移动
                // 切记此时右指针不能往右移动，因为前面已经算过了，保证每种情况只算一次
                else if (curSum > 0) {
                    thirdIndex--;
                }
                // 如果结果过小，说明左指针太小了，需要往左移动
                else {
                    secondIndex++;
                }

            }
        }
        return result;
    }

    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int firstIndex = 0; firstIndex < nums.length - 2; firstIndex++) {
            if (firstIndex != 0 && nums[firstIndex] == nums[firstIndex - 1]) {
                continue;
            }
            for (int secondIndex = firstIndex + 1; secondIndex < nums.length - 1; secondIndex++) {
                if (secondIndex != firstIndex + 1 && nums[secondIndex] == nums[secondIndex - 1]) {
                    continue;
                }
                for (int thirdIndex = secondIndex + 1; thirdIndex < nums.length; thirdIndex++) {
                    if (thirdIndex != secondIndex + 1 && nums[thirdIndex] == nums[thirdIndex - 1]) {
                        continue;
                    }
                    if (nums[firstIndex] + nums[secondIndex] + nums[thirdIndex] == 0) {
                        result.add(Arrays.asList(nums[firstIndex], nums[secondIndex], nums[thirdIndex]));
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LeetCode15 object = new LeetCode15();
        List<List<Integer>> result = object.threeSum(new int[]{-2, 0, 1, 1, 2});
        for (List<Integer> integers : result) {
            System.out.println();
            for (Integer integer : integers) {
                System.out.print(integer + "  ");
            }
        }
    }
}
