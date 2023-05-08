package playground.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @Test
    void case1() {
        //Input: nums = [-1,0,1,2,-1,-4]
        //Output: List<List<Integer>> [[-1,-1,2],[-1,0,1]]
        ThreeSum solution = new ThreeSum();
        assertEquals(List.of(List.of(-1,-1,2), List.of(-1,0,1)), solution.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
    @Test
    void case2() {
        //Input: nums = [0,1,1]
        //Output: []
        ThreeSum solution = new ThreeSum();
        assertEquals(List.of(), solution.threeSum(new int[]{0,1,1}));
    }
    @Test
    void case3() {
        //Input: nums = [0,0,0]
        //Output: [[0,0,0]]
        ThreeSum solution = new ThreeSum();
        assertEquals(List.of(List.of(0,0,0)), solution.threeSum(new int[]{0,0,0}));
    }
}