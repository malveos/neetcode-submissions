class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        HashMap<Character, Integer> count = new HashMap<>();
        int l = 0, max = 0; 
        for (int r =0;r< s.length(); r++) {
             count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);
             max = Math.max(max, count.get(s.charAt(r)));

            while ((r - l +1) - max > k) {// decrease left till it become valid
                count.put(s.charAt(l), count.get(s.charAt(l)) -1);
                l++;
            }
            res = Math.max(res, r - l +1);
        }
        return res;
    }
}
