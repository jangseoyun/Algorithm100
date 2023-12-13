package inflearn.algorithm.dfs;

import java.util.Scanner;

public class Algorithm8N2 {
    public static int answer = Integer.MIN_VALUE, kg, n;

    public void solution(int level, int sum, int[] arr) {

        if (sum > kg) {
            return ;
        }

        if (level == n) {

            answer = Math.max(answer, sum);
        } else {

            solution(level + 1, sum + arr[level], arr);
            solution(level + 1, sum, arr);
        }

    }

    public static void main(String[] args) {
        Algorithm8N2 T = new Algorithm8N2();
        Scanner sc = new Scanner(System.in);
        kg = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        T.solution(0, 0, arr);
        System.out.println( answer );
    }
}
