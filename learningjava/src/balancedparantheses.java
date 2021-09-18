import java.util.Stack;

public class balancedparantheses {
    public static boolean check(String brackets){
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i< brackets.length();i++){
            char braket = brackets.charAt(i);
            if(braket == '(' || braket == '{' || braket == '['){
                st.push(braket);
            }
            else if(braket == '(' || braket == '{' || braket == '['){
                if(st.isEmpty()){
                    return false;
                }
                char stbraket = st.pop();
                switch(braket) {
                    case ')':
                        if(stbraket == '{' || stbraket == '['){
                            return false;
                        }
                        break;
                    case '}':
                        if(stbraket == '(' || stbraket == '['){
                            return false;
                        }
                        break;
                    case ']':
                        if(stbraket == '{' || stbraket == '('){
                            return false;
                        }
                        break;
                }
            }

        }
        return  st.isEmpty();
    }

    public static void main(String[] args) {
        String brackets = "[{14(ABC)qwe}]";
        if(check(brackets)){
            System.out.println("Yes it is balanced");
        }
        else {
            System.out.println("No it is not balanced");
        }
    }
}
