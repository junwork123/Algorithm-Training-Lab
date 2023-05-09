package playground.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumClosestTest {

    @Test
    void case1() {
        //Input: nums = [-1,2,1,-4], target = 1
        //Output: 2
        ThreeSumClosest solution = new ThreeSumClosest();
        assertEquals(2, solution.threeSumClosest(new int[]{-1,2,1,-4}, 1));
    }
    @Test
    void case2() {
        //Input: nums = [0,0,0], target = 1
        //Output: 0
        ThreeSumClosest solution = new ThreeSumClosest();
        assertEquals(0, solution.threeSumClosest(new int[]{0,0,0}, 1));
    }

    @Test
    void case3() {
        //Input: nums = [4,0,5,-5,3,3,0,-4,-5], target = -2
        //Output: 2
        ThreeSumClosest solution = new ThreeSumClosest();
        assertEquals(-2, solution.threeSumClosest(new int[]{4,0,5,-5,3,3,0,-4,-5}, -2));
    }
}