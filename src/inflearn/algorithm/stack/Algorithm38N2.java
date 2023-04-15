package inflearn.algorithm.stack;

import java.util.*;

public class Algorithm38N2 {
    public String solution(String input){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c == ')') {
                //여는 괄호 꺼내고 멈춤
                while (stack.pop() != '(') {
                }
            } else {
                //알파벳과 여는 괄호는 다 stack에 넣는다
                stack.push(c);
            }
        }

        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Algorithm38N2 T = new Algorithm38N2();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(T.solution(input));
    }
}
