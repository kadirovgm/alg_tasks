package balanced_brackets;

import java.util.*;
 
public class balanced_java_2_stack {
 
    static boolean areBracketsBalanced(String example)
    {
        Stack<Character> stack
            = new Stack<Character>();
 
        // Traversing the Expression
        for (int i = 0; i < example.length(); i++)
        {
            char x = example.charAt(i);
            if (x == '(' || x == '[' || x == '{')
            {
                stack.push(x);
                continue;
            }
            // Checking that first element is closing
            if (stack.isEmpty())
                return false;

            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
        // Check Empty Stack
        return (stack.isEmpty());
    }
 
    // Driver code
    public static void main(String[] args)
    {
        String example = "([{}])";
 
        // Function call
        if (areBracketsBalanced(example))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
// complexity O(n)