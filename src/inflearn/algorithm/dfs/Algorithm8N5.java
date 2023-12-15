package inflearn.algorithm.dfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Algorithm8N5 {//동전 교환
    static int m, n, answer = Integer.MAX_VALUE;

    public void solution(int level, int sum, Integer[] coinArray) {//level을 동전의 개수로 생각

        if (sum > m) {
            return ;
        }

        if (level >= answer) {
            return;
        }

        if (sum == m) {

            answer = Math.min(answer, level);

        } else {

            for (int i = 0; i < n; i++) {
                solution(level + 1, sum + coinArray[i], coinArray);
            }
        }
    }

    public static void main(String[] args) {
        Algorithm8N5 T = new Algorithm8N5();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Integer[] coinArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            coinArray[i] = sc.nextInt();
        }
        Arrays.sort(coinArray, Collections.reverseOrder());//reverseOrder의 경우 객체형으로 선언한것만 사용 가능하다
        m = sc.nextInt();
        T.solution(0, 0, coinArray);
        System.out.println(answer);
    }
}
