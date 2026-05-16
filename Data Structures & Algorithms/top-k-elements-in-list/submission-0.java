class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> cm = new HashMap<>();
        for (int x: nums)
            cm.put(x, cm.getOrDefault(x, 0) + 1);

        List<Integer>[] freq = new List[nums.length + 1];
        for (int i =0; i<freq.length; i++)
            freq[i] = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry: cm.entrySet())
            freq[entry.getValue()].add(entry.getKey());

        int [] res = new int[k];
        int cur =0;
        for (int i= freq.length - 1; i>0 && cur<k; i--) {
            // Put from freq arry to res to fill it
            for (int j : freq[i]) {
                res[cur++] = j;
                if (cur==k) return res;
            }
        }
        return res;
    }
}
