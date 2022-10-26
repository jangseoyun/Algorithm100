package inflearn.algorithm.array;

import java.util.Scanner;

public class Algorithm21 {//정답 확인했습니다
    public int solution(int[][] arr) {
        int answer = Integer.MIN_VALUE;//가장 큰값을 answer에 저장할 것이기 때문에 최소값으로 초기화
        int sum1, sum2;
        for (int i = 0; i < arr.length; i++) {
            sum1 = sum2 = 0;//sum1에는 i행에 있는 값의 합, sum2에는 i열의 합
            for (int j = 0; j < arr.length; j++) {
                sum1 += arr[i][j];//행의 합
                sum2 += arr[j][i];//열의 합
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = sum2 = 0;

        //대각선
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][arr.length - i - 1];
        }

        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Algorithm21 T = new Algorithm21();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(arr));
    }
}
