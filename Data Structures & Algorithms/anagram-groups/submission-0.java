class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for (String s: strs) {
            char[] v =s.toCharArray();
            Arrays.sort(v);
            String k = String.valueOf(v);
            if(mp.containsKey(k)) {
                mp.get(k).add(s);
            }else{
                List<String> ls = new ArrayList<>();
                mp.put(k, ls);
                ls.add(s);
            }
        }
         return new ArrayList<>(mp.values());
    }
}
