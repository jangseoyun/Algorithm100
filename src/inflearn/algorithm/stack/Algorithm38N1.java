package inflearn.algorithm.stack;

import java.util.*;

public class Algorithm38N1 {
    public String solution(String input) {
        //stack에 넣고 사이즈가 0이고 문자이면 담기
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push(input.charAt(i));
            } else if (input.charAt(i) == ')') {
                stack.pop();
            }
            System.out.println(stack);
            if (stack.size() == 0) {
                answer += String.valueOf(input.charAt(i));
            }
            System.out.println("answer:" + answer);
        }

        return answer.replaceAll("[^a-zA-Z]", "");
    }

    public static void main(String[] args) {
        Algorithm38N1 T = new Algorithm38N1();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(T.solution(input));
    }
}
