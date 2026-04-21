class Solution {
    public int lastStoneWeight(int[] stones) {
         PriorityQueue<Integer> minH = new PriorityQueue<>(Collections.reverseOrder());
         for (int n : stones)
            minH.offer(n);

         while (minH.size()>1) {
            int x = minH.poll();
            int y = minH.poll();
            System.out.println("Smashing " + x + ", " + y);
            if (x!=y) {
                minH.offer(x>y ?x-y : y-x);
            }
         }
         if (minH.size() == 1) {
            return minH.peek();
         } else 
            return 0;
    }
}
