package inflearn.algorithm.array;

import java.util.Scanner;

public class Algorithm23 {//정답 확인 했습니다
    public int solution(int[][] arr, int n) {
        int answer = 0, max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {//n명
            int cnt = 0;
            for (int j = 1; j <= n; j++) {//n명
                for (int k = 1; k <= 5; k++) {//학년
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;//i번 학생
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Algorithm23 T = new Algorithm23();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.solution(arr, n));
    }
}
