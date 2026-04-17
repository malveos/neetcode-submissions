class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder rev = new StringBuilder();
        StringBuilder ori = new StringBuilder();
        for (char c: s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                rev.insert(0,Character.toLowerCase(c));
                ori.append(Character.toLowerCase(c));
            }
        }
        System.out.println(rev);
        System.out.println(ori);
        return rev.toString().equals(ori.toString());
    }
}
