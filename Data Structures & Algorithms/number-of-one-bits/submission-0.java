class Solution {
    public int hammingWeight(int n) {
        int s = 0;
        while (n>0) {
            s += (n&1) == 1 ?1 :0;
            n = n>>1;
        }
        return s;
    }
}
