import java.util.Stack;

public class RemoveConsecutive {
    public static String removeConsecutiveSame(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (stack.isEmpty() || stack.peek()!= c) {
                stack.push(c);
            } else {
                int count = 0;
                while (!stack.isEmpty() && stack.peek() == c) {
                    stack.pop();
                    count++;
                }
                if (count < 3) {
                    for (int i = 0; i < count; i++) {
                        stack.push(c);
                    }
                }
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String input = "aabcccbbad";
        System.out.println(removeConsecutiveSame(input));
    }
}

