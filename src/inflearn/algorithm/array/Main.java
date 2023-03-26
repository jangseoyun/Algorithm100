package inflearn.algorithm.array;

import java.util.Scanner;

public class Main {

    public int solution(int[][] arr, int n) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.solution(arr, n));
    }
}
