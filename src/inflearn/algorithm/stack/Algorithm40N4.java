package inflearn.algorithm.stack;

import java.util.Scanner;
import java.util.Stack;

public class Algorithm40N4 {
    public int solution(String input){
        Stack<Integer> stack = new Stack<>();

        for(char c : input.toCharArray()){
            //숫자를 만나면 stack에 담아줌
            if (Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            } else {
                //숫자가 아니면 연산하기
                int second = stack.pop();
                int first = stack.pop();

                if (c == '+') {
                    stack.push(first + second);
                } else if (c == '-') {
                    stack.push(first - second);
                } else if (c == '*') {
                    stack.push(first * second);
                } else {
                    stack.push(first / second);
                }
            }
        }

        return stack.get(0);
    }

    public static void main(String[] args){
        Algorithm40N4 T = new Algorithm40N4();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(T.solution(input));
    }
}
