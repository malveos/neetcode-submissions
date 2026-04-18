class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put(']', '[');
        mapping.put('}', '{');

        for (char c : s.toCharArray()) {
            if (st.isEmpty() || st.peek() != mapping.get(c)) {
                st.push(c);
            } else {
                if (st.peek() == mapping.get(c)) {
                    st.pop();
                }
            }
        }

        return st.isEmpty();
    }
}
