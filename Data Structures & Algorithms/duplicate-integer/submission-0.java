class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> x = new HashSet();
        for (int a:nums){
            if(!x.add(a))
                return true;
        }
        return false;
    }
}