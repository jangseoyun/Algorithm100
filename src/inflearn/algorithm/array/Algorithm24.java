package inflearn.algorithm.array;

import java.util.Scanner;

public class Algorithm24 {
    public int solution(int[][] arr, int n) {//공유할 문제
        int answer = Integer.MIN_VALUE;
        //1. 모든 경우의 수

        //2. 가능한 경우의 수

        return answer;
    }

    public static void main(String[] args) {
        Algorithm24 T = new Algorithm24();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//학생수
        int m = sc.nextInt();//수학테스트수

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.solution(arr, n));
    }
}
