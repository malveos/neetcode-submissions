class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> qu = new PriorityQueue<>(
            (x,y)-> x-y
        );

        for (int  i= 0; i< nums.length; i++) {
            qu.offer(nums[i]);
            if (qu.size() > k) {
                qu.poll();
            }
        }

        return qu.poll();
    }
}
