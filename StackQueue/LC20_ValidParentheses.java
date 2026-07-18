/*
 * LeetCode 20 - Valid Parentheses
 *
 * Difficulty: Easy
 * Topic: Stack
 *
 * Approach:
 * - Use a stack to store opening brackets.
 * - For every closing bracket, check if it matches
 *   the top element of the stack.
 * - If all brackets match and the stack is empty,
 *   the string is valid.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.Stack;

class Solution {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {

                stack.push(ch);

            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {

                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}