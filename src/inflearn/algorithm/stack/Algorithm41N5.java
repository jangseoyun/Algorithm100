package inflearn.algorithm.stack;
import java.util.*;

public class Algorithm41N5 {
    public int solution(String input){
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < input.length(); i++){
            if (input.charAt(i) == '(') {
                stack.push(input.charAt(i));
            }else {
                stack.pop();
                if (input.charAt(i - 1) == ')') {
                    answer++;
                } else {
                    answer += stack.size();
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Algorithm41N5 T = new Algorithm41N5();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(T.solution(input));
    }
}
