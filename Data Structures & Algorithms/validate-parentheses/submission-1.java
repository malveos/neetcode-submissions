class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put(']', '[');
        mapping.put('}', '{');

        for (char c : s.toCharArray()) {
            if (mapping.containsKey(c))  {//closing bracket
                 if (!st.isEmpty() && st.peek() == mapping.get(c)) {
                     st.pop();
                 }
                 else return false;
            } else {//opening bracket
                st.push(c);
            }
            
        }

        return st.isEmpty();
    }
}
