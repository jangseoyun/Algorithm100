package inflearn.algorithm.strings;

import java.util.Scanner;

public class Algorithm12 {

    public String solution(String str, int size) {
        String answer = "";
        String tmp = "";
        for (int i = 0; i < str.length(); i += 7) {
            tmp = str.substring(i, i + 7)
                    .replace("#", "1")
                    .replace("*", "0");
            answer += (char) Integer.parseInt(tmp, 2);
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm12 T = new Algorithm12();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(str, size));
    }
}
