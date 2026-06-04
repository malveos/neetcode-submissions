class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0;
        int res = 0;

        Map<Character, Integer> st = new HashMap<>();
        
        for (r = 0 ; r<s.length();r++) {
            if(st.containsKey(s.charAt(r))) {
                l = Math.max(st.get(s.charAt(r)) + 1, l);
            }
            st.put(s.charAt(r), r);
            res = Math.max(res, r-l +1);
        }
        return res;
    }
}
