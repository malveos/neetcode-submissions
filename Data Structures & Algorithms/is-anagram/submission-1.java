
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] v1 = s.toCharArray();
        Arrays.sort(v1);
        char[] v2 = t.toCharArray();
        Arrays.sort(v2);

        // System.out.println(v1);
        // System.out.println(v2);

        return Arrays.equals(v1, v2);
    }
}
