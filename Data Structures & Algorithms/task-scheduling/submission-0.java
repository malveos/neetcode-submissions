class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for (char c: tasks) {
            count[c - 'A']++;
        }


        PriorityQueue<Integer> mxh = new PriorityQueue<>(Collections.reverseOrder());
        for (int c:count) {
            if (c>0) mxh.add(c);
        }

        int ans = 0;
        Queue<int[]> q = new LinkedList<>();
        while(!mxh.isEmpty() || !q.isEmpty()) {
            ans++;

            if (mxh.isEmpty()) {
                ans = q.peek()[1]; // final from cooldown queue
            } else {
                int ct = mxh.poll()- 1;
                if (ct > 0) {
                    q.add(new int[] {ct, ans + n});
                }
            }

            if (!q.isEmpty() && q.peek()[1] == ans) {
                mxh.offer(q.poll()[0]);
            }
        }
        return ans;
    }
}
