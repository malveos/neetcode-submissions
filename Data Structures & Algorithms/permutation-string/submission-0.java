class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1 == null && s2 == null) return true;
        if (s1==null) return true;
        if (s2==null) return false;

        if (s1.length()> s2.length())
            return false;

        int w = s1.length();
        int []a = new int[26];
        int []b = new int[26];
        for (int i =0 ;i<w;i++) {
            a[s1.charAt(i) - 'a']++;
            b[s2.charAt(i) - 'a']++;
        }

        int mt = 0;
        for (int i =0; i<26; i++)
            if (a[i] == b[i])
                mt++;

        int left = 0;

        for (int r= w; r<s2.length();r++) {
            if (mt == 26)
                return true;

            // Adding to right
            int cur = s2.charAt(r) - 'a';
            b[cur]++;
            if (a[cur] == b[cur]) {
                mt++;
            } else if (a[cur] + 1 == b[cur]) { //means it was match before addding it
                mt--;
            }

            // removing from left
            cur = s2.charAt(left) - 'a';
            b[cur]--;
            if (a[cur] == b[cur]) {
                mt++;
            } else if (a[cur] - 1 == b[cur]) { //means it was match before removing it
                mt--;
            }
            left++;
        }
        return mt == 26;
    }
}
