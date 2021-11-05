import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ParenthValidatin {

    public static boolean valid(String str)
    {
        //make Stack
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> map = new HashMap<>();

        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        //convert to Charatcer Array

        //check each character
        // if opening bracket push to stack
        //if closing bracket pop off stack
        // compare closing bracket to bracket off stack

        for(char c: str.toCharArray())
        {
            Character ca =  c;

            if (map.containsValue(c))
            {
                stack.push(c);
            }
            if (map.containsKey(c) && stack.isEmpty() || map.containsKey(c) && !map.get(c).equals(stack.pop())  )
            {
                return false;
            }

        }
        //check if stack is empty
        if (!stack.empty())
            return false;

        return true;
    }

    public static void main(String[] args) {
        String s ="(";
        System.out.println(valid(s));
        s ="(())";
        System.out.println(valid(s));
        s ="({)}";
        System.out.println(valid(s));
        s ="({()})";
        System.out.println(valid(s));

    }
}
