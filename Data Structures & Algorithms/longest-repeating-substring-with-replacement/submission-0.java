class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        for (int i =0;i< s.length(); i++) {
             HashMap<Character, Integer> count = new HashMap<>();
            int max = 0;
            for (int j = i ; j<s.length();j++) {
                count.put(s.charAt(j), count.getOrDefault(s.charAt(j), 0) + 1);
                max = Math.max(max, count.get(s.charAt(j)));
                if ((j - i +1) - max <=k)
                    res = Math.max(res, j -i +1);
            }
        }
        return res;
    }
}
