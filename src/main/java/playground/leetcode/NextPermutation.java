package playground.leetcode;

import playground.core.ProblemInfo;

@ProblemInfo(
    Number = 31,
    Title = "Next Permutation",
    Url = "https://leetcode.com/problems/next-permutation/"
)
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        // 첫번째로 작아지는 요소 찾기
        while (i >= 0 && nums[i] >= nums[i + 1]) i--;

        // 첫번째로 작아지는 요소가 있으면
        // 두번째로 작은 요소를 찾아서 바꾸기
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }

        // 첫번째로 작아지는 요소가 없으면 역순
        reverse(nums, i + 1);
    }

    private void reverse(int[] nums, int i) {
        int j = nums.length - 1;
        while (i < j) swap(nums, i++, j--);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j]  = nums[i];
        nums[i]  = temp;
    }
}
