/*
 * LeetCode 14 - Longest Common Prefix
 *
 * Difficulty: Easy
 * Topic: Strings
 *
 * Approach:
 * - Assume the first string is the prefix.
 * - Compare it with every other string.
 * - Keep shortening the prefix until every string starts with it.
 *
 * Time Complexity: O(n × m)
 * Space Complexity: O(1)
 *
 * where:
 * n = number of strings
 * m = length of the shortest prefix
 */

class Solution {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(prefix)) {

                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}