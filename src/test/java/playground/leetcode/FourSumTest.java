package playground.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FourSumTest {

    @Test
    void case1() {
        //Input: nums = [1,0,-1,0,-2,2], target = 0
        //Output: List<List<Integer>> [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
        FourSum solution = new FourSum();
        assertEquals(List.of(List.of(-2,-1,1,2),List.of(-2,0,0,2), List.of(-1,0,0,1)), solution.fourSum(new int[]{1,0,-1,0,-2,2}, 0));
    }
    @Test
    void case2() {
        //Input: nums = [], target = 0
        //Output: List<List<Integer>> []
        FourSum solution = new FourSum();
        assertEquals(List.of(), solution.fourSum(new int[]{}, 0));
    }
    @Test
    void case3() {
        // Input: nums = [2,2,2,2,2], target = 8
        // Output: List<List<Integer>> [[2,2,2,2]]
        FourSum solution = new FourSum();
        assertEquals(List.of(List.of(2,2,2,2)), solution.fourSum(new int[]{2,2,2,2,2}, 8));
    }
    @Test
    void case4() {
        // Input: nums = [1000000000,1000000000,1000000000,1000000000], target = -294967296
        // Output: List<List<Integer>> []
        FourSum solution = new FourSum();
        assertEquals(List.of(), solution.fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296));
    }
    @Test
    void case5() {
        // Input: nums = [0,0,0,1000000000,1000000000,1000000000,1000000000], target = 1000000000
        // Output: List<List<Integer>> [[0,0,0,1000000000]]
        FourSum solution = new FourSum();
        assertEquals(List.of(List.of(0,0,0,1000000000)), solution.fourSum(new int[]{0,0,0,1000000000,1000000000,1000000000,1000000000}, 1000000000));
    }
}