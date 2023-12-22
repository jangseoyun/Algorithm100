package inflearn.algorithm.dfs;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithm8N6 {
    //1. 아이디어 : DFS, 재귀함수를 통해 백트래킹 / 체크 배열(사용 여부 체크), 출력 배열
    //2. 시간복잡도 : N!
    static int n, m;
    static int[] check, arr, answer;

    public void solution(int level) {
        if (level == m) {
            System.out.println(Arrays.toString(answer));
        } else {
            for (int i = 0; i < n; i++) {
                if (check[i] == 0) {//0이 사용되지 않았을 때 1이 사용 됐을 때
                    check[i] = 1;
                    answer[level] = arr[i];
                    solution(level + 1);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Algorithm8N6 T = new Algorithm8N6();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        check = new int[n];
        answer = new int[m];

        T.solution(0);
    }
}
