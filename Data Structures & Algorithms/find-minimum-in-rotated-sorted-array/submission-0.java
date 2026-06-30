class Solution {
    public int findMin(int[] nums) {
        int l =0, r= nums.length-1;
        int min = nums[0];
        while (l<=r) {
            if (nums[l] < nums[r])
                min = Math.min(min, nums[l]);

            int mid = (l + r)/2;
            if (nums[mid] < min)
                min = nums[mid];

            if (nums[l] <= nums[mid])
                l = mid + 1;
            else if (nums[mid] < nums[r])
                r= mid-1;
        }
        return min;
    }
}
