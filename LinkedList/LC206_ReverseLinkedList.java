/*
 * LeetCode 206 - Reverse Linked List
 *
 * Difficulty: Easy
 * Topic: Linked List
 *
 * Approach:
 * - Use three pointers:
 *   - previous
 *   - current
 *   - next
 * - Reverse one link at a time.
 * - Return the new head.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {

    public ListNode reverseList(ListNode head) {

        ListNode previous = null;
        ListNode current = head;

        while (current != null) {

            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
}