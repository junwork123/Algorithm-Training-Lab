package playground.leetcode;

import playground.core.ProblemInfo;

@ProblemInfo(
        Number = 11,
        Title = "Container With Most Water",
        Url = "https://leetcode.com/problems/container-with-most-water/"
)
public class ContainerWithMostWater {
    int[] height;
    public int maxArea(int[] height) {
        this.height = height;
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int area = calculateArea(left, right);
            maxArea = Math.max(maxArea, area);
            
            if (this.height[left] < this.height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
    int calculateArea(int left, int right) {
        int height = Math.min(this.height[left], this.height[right]);
        int width = right - left;
        return height * width;
    }
}
