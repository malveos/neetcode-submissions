class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int st = 0, ed = len -1;
        while(st<=ed) {
            if (numbers[st] + numbers[ed] == target) {
                return new int[] {st+1, ed+1};
            }
            if (numbers[st] + numbers[ed] < target)
                st++;
            else 
                ed--;
        }
        return new int[]{};
    }
}
