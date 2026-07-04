/*
 * LeetCode 26 - Remove Duplicates from Sorted Array
 *
 * Difficulty: Easy
 * Topic: Arrays, Two Pointers
 *
 * Approach:
 * - Use two pointers.
 * - Keep unique elements at the beginning of the array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int index = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {

                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}