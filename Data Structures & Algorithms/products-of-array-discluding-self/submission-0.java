class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre = 1;
        int[] res = new int[nums.length];
        res[0] = 1;
        for (int i=1;i<nums.length;i++)
            res[i] = res[i-1] * nums[i-1];
        
        for (int i = 0;i<nums.length;i++)
            System.out.print(" " + res[i]);

        int post = 1;
        for (int i=nums.length-1; i>=0 ;i--) {
            res[i] *= post;
            post *= nums[i]; 
        }

        return res;
    }
}  
