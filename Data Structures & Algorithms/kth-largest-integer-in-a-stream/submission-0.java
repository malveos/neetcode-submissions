class KthLargest {
    PriorityQueue<Integer> que =new PriorityQueue<>();
    int k;
    //constructor
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for (int i = 0; i < nums.length; i++) {
            que.offer(nums[i]);
            if (que.size()>k)
                que.poll();
        }
    }
    
    public int add(int val) {
         que.offer(val);
            if (que.size()>k)
                que.poll();
         return que.peek();
    }
}
