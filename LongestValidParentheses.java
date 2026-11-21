import java.util.Stack;

public class LongestValidParentheses {

    public static int findLongest(String str) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int ans = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                st.push(i);
            } else {
                st.pop();
                if (st.isEmpty()) {
                    st.push(i);
                } else {
                    int len = i - st.peek();
                    if (len > ans) {
                        ans = len;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findLongest("(()"));
        System.out.println(findLongest(")()())"));
        System.out.println(findLongest(""));
    }
}