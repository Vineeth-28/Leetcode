class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
         for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        // Process elimination until one remains
        while (queue.size() > 1) {
            // Move k-1 elements to the back of the queue
            for (int i = 1; i <= k - 1; i++) {
                queue.add(queue.remove());
            }
            // Remove the k-th element
            queue.remove();
        }

        // Print the winner
       return queue.peek();
    }
}