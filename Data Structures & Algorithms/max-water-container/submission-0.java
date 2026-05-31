class Solution {
    public int maxArea(int[] heights) {
        int l=0, r= heights.length -1, mx = 0;
        while (l<r) {
            mx=Math.max(mx, Math.min(heights[l], heights[r])* (r-l));
            if (heights[l]<= heights[r])
                l++;
            else 
                r--;
        }
        return mx;
    }
}
