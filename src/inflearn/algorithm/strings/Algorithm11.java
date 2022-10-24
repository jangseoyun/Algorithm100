package inflearn.algorithm.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm11 {//정답 확인 했습니다.

    public String solution(String str) {
        String answer = "";
        str = str + " ";
        char[] chars = str.toCharArray();
        int count = 1;

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                count++;
            } else {
                answer += chars[i];
                if (count > 1) {
                    answer += count;
                }
                count = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Algorithm11 T = new Algorithm11();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(T.solution(input));
    }
}
