class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0;
        int res = 0;

        Set<Character> st = new HashSet<>();
        for (r = 0 ; r<s.length();r++) {
            while(st.contains(s.charAt(r))) {
                st.remove(s.charAt(l));
                l++;
            }
            st.add(s.charAt(r));
            res = Math.max(res, r-l +1);
        }
        return res;
    }
}
