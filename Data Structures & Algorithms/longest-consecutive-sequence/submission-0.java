class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set<Integer> st =new HashSet<>();
        for (int n:nums)
            st.add(n);

        for (int n:nums){
            int cur = 0, start= n;
            while(st.contains(start)){
                start++;
                cur++;
            }
            res= Math.max(cur, res);
        }
        return res;
    }
}
