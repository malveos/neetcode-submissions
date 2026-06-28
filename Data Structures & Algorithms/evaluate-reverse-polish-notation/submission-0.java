class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();

        for (String s : tokens) {
            if (isOP(s)) {
                int b = Integer.valueOf(st.pop());
                int a = Integer.valueOf(st.pop());
                if (s.equals("+"))
                    st.push(String.valueOf(a+b));
                if (s.equals("-"))
                    st.push(String.valueOf(a-b));
                if (s.equals("*"))
                    st.push(String.valueOf(a*b));
                if (s.equals("/"))
                    st.push(String.valueOf(a/b));
            } else {
                st.push(s);
            }
        }
        return Integer.valueOf(st.pop());
    }

    private boolean isOP(String s) {
        return s.equals("-") ||s.equals("+") ||s.equals("*") ||s.equals("/");
    }
}
