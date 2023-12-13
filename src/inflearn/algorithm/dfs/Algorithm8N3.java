package inflearn.algorithm.dfs;

import java.util.Scanner;

public class Algorithm8N3 {
    static int answer = Integer.MIN_VALUE, m, n;

    //D(level, sum, time)
    public void solution(int level, int sum, int time, int[] pointArray, int[] timeArray) {
        if (time > m) {
            return ;
        }

        if (level == n) {//부분집합 완성
            answer = Math.max(answer, sum);

        } else {
            //level 문제를 푼다
            solution(level + 1, sum +  pointArray[level], time + timeArray[level], pointArray, timeArray);
            //level 문제를 풀지 않는다
            solution(level + 1, sum, time, pointArray, timeArray);
        }
    }

    public static void main(String[] args) {
        Algorithm8N3 T = new Algorithm8N3();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] pointArray = new int[n];
        int[] timeArray = new int[n];

        for (int i = 0; i < n; i++) {
            pointArray[i] = sc.nextInt();
            timeArray[i] = sc.nextInt();
        }

        T.solution(0,0, 0, pointArray, timeArray);
        System.out.println(answer);
    }
}
