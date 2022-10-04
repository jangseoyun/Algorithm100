package java.algorithm.string;

import java.util.Scanner;

public class Algorithm01 {
    public int solution(String input) {
        String answer = "";

        for (int i = 0; i < input.length(); i++) {//숫자 true, 문자 false
            if (Character.isDigit(input.charAt(i))) {
                answer += input.charAt(i);
            }
        }

        int answer2 = new Integer(answer).intValue();
        return answer2;
    }

    public static void main(String[] args) {
        Algorithm01 T = new Algorithm01();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(T.solution(input));
    }
}
