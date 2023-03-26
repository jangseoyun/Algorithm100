package programmers.algorithm.daily;

import java.util.Arrays;

public class Babbling {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] speak = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i < speak.length; i++) {
            if (Arrays.asList(babbling).contains(speak[i])) {

            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Babbling T = new Babbling();
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(T.solution(babbling));
    }
}
