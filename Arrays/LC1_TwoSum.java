/*
 * LeetCode 1 - Two Sum
 *
 * Difficulty: Easy
 * Topic: Arrays, HashMap
 *
 * Approach:
 * - Traverse the array once.
 * - Store each number and its index in a HashMap.
 * - Check whether the complement (target - current number) already exists.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.HashMap;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}