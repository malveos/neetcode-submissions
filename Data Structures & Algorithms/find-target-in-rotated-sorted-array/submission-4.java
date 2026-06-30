class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r= nums.length-1;
        while (l<=r) {
            int mid = l + (r -l)/2;
            if (nums[mid] == target)
                return mid;

            if (nums[l] <= nums[mid]) { //sorted left
                if (target>nums[mid] || target < nums[l]) { // not in left
                    l = mid + 1;
                }
                else
                    r = mid - 1 ;
            } else {//soerted right
                if (target < nums[mid] || target > nums[r]) {  // not in right
                    r = mid - 1;
                } else 
                    l = mid + 1;

            }
            
        }
        return -1;
    }
}
