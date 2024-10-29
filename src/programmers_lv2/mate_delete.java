package programmers_lv2;
import java.util.Scanner;
import java.util.Stack;
public class mate_delete {
    public static void printStack(Stack<Character> stack) {
        for (Character c : stack) {
            System.out.print(c);
        }
        System.out.println();
    }
    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
            printStack(stack);
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(solution(str));
        s.close();
    }
}