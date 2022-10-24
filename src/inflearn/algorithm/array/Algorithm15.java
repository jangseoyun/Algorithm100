package inflearn.algorithm.array;

import java.util.Scanner;

public class Algorithm15 {
    public void solution(int[][] arr, int count) {

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < count; j++) {
                if (arr[i][j] == arr[i + 1][j]) {
                    System.out.println('D');
                } else if (arr[i][j] == 1 && arr[i + 1][j] == 3
                        || arr[i][j] == 2 && arr[i + 1][j] == 1
                        || arr[i][j] == 3 && arr[i + 1][j] == 2) {
                    System.out.println('A');
                } else {
                    System.out.println('B');
                }
            }

        }

    }

    public static void main(String[] args) {
        Algorithm15 T = new Algorithm15();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[][] arr = new int[2][count];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < count; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        T.solution(arr, count);
    }

}
