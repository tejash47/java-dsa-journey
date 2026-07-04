/*
 * LeetCode 53 - Maximum Subarray
 *
 * Difficulty: Medium
 * Topic: Arrays, Dynamic Programming
 *
 * Approach:
 * - Use Kadane's Algorithm.
 * - Keep track of the maximum subarray ending at each position.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i], currentSum + nums[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}