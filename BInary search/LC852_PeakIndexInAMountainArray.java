/*
 * LeetCode 852 - Peak Index in a Mountain Array
 *
 * Difficulty: Medium
 * Topic: Binary Search
 *
 * Approach:
 * - Use Binary Search to locate the peak.
 * - If arr[mid] < arr[mid + 1], the peak lies on the right.
 * - Otherwise, the peak is on the left (including mid).
 * - Continue until left == right.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {

    public int peakIndexInMountainArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
