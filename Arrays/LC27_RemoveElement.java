/*
 * LeetCode 27 - Remove Element
 *
 * Difficulty: Easy
 * Topic: Arrays, Two Pointers
 *
 * Approach:
 * - Copy all elements not equal to val.
 * - Return the new length.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int removeElement(int[] nums, int val) {

        int index = 0;

        for (int num : nums) {

            if (num != val) {

                nums[index] = num;
                index++;
            }
        }

        return index;
    }
}