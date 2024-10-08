import java.util.Stack;

public class MinimumParen {
    public static void main(String[] args) {

        String s = "(()()()()))";
        int ans = minAddToMakeValid(s);
        System.out.println(ans);

    }

    public static int minAddToMakeValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                stack.push(ch);
            } else if(ch == ')'){
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    }
                    else{
                        stack.push(ch);
                    }

            }else{
                stack.push(ch);
            }

        }
        return stack.size();
    }
}
