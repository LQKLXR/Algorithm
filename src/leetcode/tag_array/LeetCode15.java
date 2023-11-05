package leetcode.tag_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * https://leetcode.cn/problems/3sum/description/
 * 15. 三数之和
 * @see LeetCode01 两数之和
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
