import java.util.Stack;

public class prefixtoinfix {
    public static boolean operator(char ch) {
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
            return true;
        }
        return false;
    }

    public static String convert(String prefix) {
        Stack<String> st = new Stack<String>();
        int len = prefix.length();
        for (int i = (len - 1); i >= 0; i--) {
            char ch = prefix.charAt(i);
            if (operator(ch)) {
                String op1 = st.pop();
                String op2 = st.pop();
                String exp = "(" + op1 + ch + op2 + ")";
                st.push(exp);
            } else {
                st.push(ch + "");
            }
        }
    String infix = st.pop();
        return infix;
    }
    public static void main(String[] args) {
            String prefix = "*+ab-cd";
            String infix = convert(prefix);
            System.out.println("Infix is = " + infix);
    }
}
