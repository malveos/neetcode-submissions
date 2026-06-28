class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int [] temp = new int[len];

        for (int i =0; i<len;i++) {
            int ct = 1;
            int j;
            for (j = i + 1; j<len; j++) {
                if (temperatures[j]> temperatures[i])
                    break;
                ct++;
            }
            temp[i] = j == len ? 0: ct;
        }
        return temp;
    }
}
