package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@Slf4j
class SolutionTest {

    @Test
    void successfulSolution() {

        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        var result = Solution.twoSum(nums, target);

        assertArrayEquals(new int[]{0,1}, result);

    }

    @Test
    void emptySolution() {

        int[] nums = new int[]{};
        int target = 9;

        var result = Solution.twoSum(nums, target);

        assertArrayEquals(new int[0], result);

    }

    @Test
    void onlyOneValueOnNumsSolution() {

        int[] nums = new int[]{2};
        int target = 9;

        var result = Solution.twoSum(nums, target);

        assertArrayEquals(new int[0], result);

    }

    @Test
    void invalidTargetNumberSolution() {

        int[] nums = new int[]{2, 7, 11, 15};
        int target = -1223;

        var result = Solution.twoSum(nums, target);

        assertArrayEquals(new int[0], result);

    }

    @Test
    void invalidFirstNumberOnNumsSolution() {

        int[] nums = new int[]{-1122, 7, 11, 15};
        int target = 9;

        var result = Solution.twoSum(nums, target);

        assertArrayEquals(new int[0], result);

    }

    @Test
    void invalidNumberOnNumsSolution() {

        int[] nums = new int[]{2, 7, -2323, 15};
        int target = 9;

        var result = Solution.twoSum(nums, target);

        assertArrayEquals(new int[0], result);

    }

    @Test
    void moreThanOneValidSolution() {

        int[] nums = new int[]{3, 7, 4, 6};
        int target = 10;

        var result = Solution.twoSum(nums, target);

        assertArrayEquals(new int[0], result);

    }




}