class Solution {
    public boolean isHappy(int n) {
        Set<Integer> unq = new HashSet<>();

        while (n!=1) {
            int s = sum(n);
            if (!unq.add(s)) {
                return false;
            }
            unq.add(s);
            n = s;
        }
        return true;
    }

    public int sum(int n) {
        int s = 0;
        while(n!=0) {
            int x = n%10;
            s += Math.pow(x, 2);
            n = n/10;
        }
        return s;
    }
}
