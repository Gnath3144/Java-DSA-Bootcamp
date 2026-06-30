import java.util.Stack;

public class Main {

    public static boolean isBalanced(String expression)
    {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<expression.length();i++)
        {
            char current = expression.charAt(i);

            if(current=='(' || current=='{' || current=='[')
            {
                stack.push(current);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }

                char top = stack.pop();

                if(current==')' && top!='(')
                {
                    return false;
                }

                if(current=='}' && top!='{')
                {
                    return false;
                }

                if(current==']' && top!='[')
                {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args)
    {
        String expression = "({[]})";

        System.out.println(isBalanced(expression));
    }
}