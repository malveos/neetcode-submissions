class Solution {
    public int findDuplicate(int[] nums) {
        // mark in the number aray itself if it is present
        for (int n : nums) {
            int idx = Math.abs(n) - 1;
            if (nums[idx] < 0) {
                return Math.abs(n);
            }
            nums[idx] *= -1;
        }
        return -1;
    }
}
