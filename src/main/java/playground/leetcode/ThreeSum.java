package playground.leetcode;

import playground.core.ProblemInfo;

import java.util.*;

@ProblemInfo(
        Number = 15,
        Title = "3Sum",
        Url = "https://leetcode.com/problems/3sum/"
)
public class ThreeSum {
    int[] nums;
    public List<List<Integer>> threeSum(int[] nums) {
        this.nums = nums;
        Arrays.sort(this.nums);

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < this.nums.length - 2; i++) {
            if (i == 0 || this.nums[i] != this.nums[i - 1]) {
                twoSum(result, i);
            }
        }
        return result;
    }

    void twoSum(List<List<Integer>> result, int i) {
        int lo = i + 1, hi = this.nums.length - 1, sum = -this.nums[i];
        while (lo < hi) {
            if (this.nums[lo] + this.nums[hi] == sum) {
                result.add(List.of(this.nums[i], this.nums[lo], this.nums[hi]));
                while (lo < hi && this.nums[lo] == this.nums[lo + 1]) { lo++; }
                while (lo < hi && this.nums[hi] == this.nums[hi - 1]) { hi--; }
                lo++; hi--;
            } else if (this.nums[lo] + this.nums[hi] < sum) {
                lo++;
            } else {
                hi--;
            }
        }
    }
}
