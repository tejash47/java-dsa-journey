/*
 * LeetCode 9 - Palindrome Number
 *
 * Difficulty: Easy
 * Topic: Math
 *
 * Approach:
 * - Reverse the number.
 * - Compare the reversed number with the original.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int original = x;
        int reverse = 0;

        while (x != 0) {

            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

        return original == reverse;
    }
}