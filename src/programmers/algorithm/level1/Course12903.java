package programmers.algorithm.level1;

import java.util.Scanner;

public class Course12903 {
    public static String solution(String input){
        int number = input.length();
        String answer = "";
        answer += input.charAt(number / 2);

        if ((number % 2) == 0) {
            answer += input.charAt((number / 2) - 1);
            return new StringBuffer(answer).reverse().toString();
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(solution(input));
    }

}
