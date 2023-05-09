package playground.leetcode;

import playground.core.ProblemInfo;

import java.util.Arrays;

@ProblemInfo(
        Number = 16,
        Title = "3Sum Closest",
        Url = "https://leetcode.com/problems/3sum-closest/"
)
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        final int MAX = nums.length;
        int closestSum = Integer.MAX_VALUE;
        int closestSumDistance = distanceOf(closestSum, target);
        for(int i=0; i<MAX-2; i++){
            int j = i+1, k=MAX-1;

            while (j<k){
                int nowSum = nums[i] + nums[j] + nums[k];
                int nowDistance = distanceOf(nowSum, target);
                if(nowSum == target) { return target; }
                if(nowDistance < closestSumDistance){
                    closestSum = nowSum;
                    closestSumDistance = nowDistance;
                }
                if(nowSum < target){
                    j++;
                }else {
                    k--;
                }
            }
        }
        return closestSum;
    }
    int distanceOf(int a, int b){
        return Math.abs(a-b);
    }
}
