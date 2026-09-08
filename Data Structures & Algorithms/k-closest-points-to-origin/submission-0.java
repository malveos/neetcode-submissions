class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> que = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[0] *b[0] + b[1] * b[1],a[0] *a[0] + a[1] * a[1])
        );

        for (int[] pt:points) {
            que.offer(pt);
            if (que.size()>k)
                que.poll();
        }

        int[][] res = new int[k][2];
        int  i= 0;
        while(!que.isEmpty()) {
            res[i++] =que.poll();
        }

        return res;

    }
}
