import java.util.Arrays;
import java.util.Stack;

public class balanced_java_misha {
    
    boolean balancedBrackets(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if  (c == '[' || c == '(' || c == '{') {
                stack.push (c);
            } else if (c == ']'){
                if (stack.isEmty() || stack.pop() != '['){
                    return false;
                }
            } else if (c == ')'){
                if (stack.isEmty() || stack.pop() != '('){
                    return false;
                }
            } else if (c == '}') {
                if (stack.isEmty() || stack.pop() != '{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    // Driver code
    public void main(String[] args)
    {
        String expr = "([{}])";
 
        // Function call
        if (balancedBrackets(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }

}
