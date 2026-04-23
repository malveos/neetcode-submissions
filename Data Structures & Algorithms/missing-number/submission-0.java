class Solution {
    public int missingNumber(int[] nums) {
        int re= nums.length;
        for (int i =0; i<nums.length; i++) {
            re ^=nums[i];
            re ^= i;
        }
        return re;
    }
}
