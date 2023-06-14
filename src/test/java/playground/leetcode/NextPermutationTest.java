package playground.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextPermutationTest {

    @Test
    void case1(){
        // Input: nums = [1,2,3]
        // Output: [1,3,2]
        int[] nums = {1,2,3};
        new NextPermutation().nextPermutation(nums);
        assertArrayEquals(new int[]{1,3,2}, nums);
    }
    @Test
    void case2(){
        // Input: nums = [3,2,1]
        // Output: [1,2,3]
        int[] nums = {3,2,1};
        new NextPermutation().nextPermutation(nums);
        assertArrayEquals(new int[]{1,2,3}, nums);
    }
    @Test
    void case3(){
        // Input: nums = [1,1,5]
        // Output: [1,5,1]
        int[] nums = {1,1,5};
        new NextPermutation().nextPermutation(nums);
        assertArrayEquals(new int[]{1,5,1}, nums);
    }
}