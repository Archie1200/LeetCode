import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean check(String s) {
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='(')
                st.push(')');
            else if(c=='{')
                st.push('}');
            else if(c=='[')
                st.push(']');
            else if(st.isEmpty() || st.pop()!=c)
                return false;
        }
        return st.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println(check("()[]{}"));
    }
}
