package inflearn.algorithm.stack;
import java.util.*;

public class Algorithm37N1 {
    public String solution(String input){
        String answer = "NO";
        Stack<Character> stack = new Stack<>();
        stack.push(input.charAt(0));

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push(input.charAt(i));
                System.out.println(stack.size());
            }else {
                if (stack.isEmpty()) {
                    return answer;
                }
                stack.pop();
            }
            System.out.println(stack);
        }

        if (stack.isEmpty()) {
            answer = "YES";
        }

        return answer;
    }
    public static void main(String[] args) {
        Algorithm37N1 T = new Algorithm37N1();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(T.solution(input));
    }
}
