class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int j=0;j<nums.length;j++) {
             int v = nums[j];
             if(mp.containsKey(target-v)) {
                return new int[] {mp.get(target-v), j};
             } else {
                mp.put(v, j);
             }
        }
         return new int[] {0,1};
    }
}
