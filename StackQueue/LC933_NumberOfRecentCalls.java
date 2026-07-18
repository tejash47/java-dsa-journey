/*
 * LeetCode 933 - Number of Recent Calls
 *
 * Difficulty: Easy
 * Topic: Queue
 *
 * Approach:
 * - Maintain a queue of request timestamps.
 * - Add the current timestamp.
 * - Remove timestamps that are older than t - 3000.
 * - The remaining queue size is the answer.
 *
 * Time Complexity: O(1) Amortized
 * Space Complexity: O(n)
 */

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    private Queue<Integer> queue;

    public RecentCounter() {

        queue = new LinkedList<>();
    }

    public int ping(int t) {

        queue.offer(t);

        while (queue.peek() < t - 3000) {
            queue.poll();
        }

        return queue.size();
    }
}