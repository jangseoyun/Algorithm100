package inflearn.algorithm.array;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Algorithm22 {
    public int solution(int[][] arr) {
        int answer = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i][j - 1] &&
                    arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i - 1][j]) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Instant start = Instant.now();
        Algorithm22 T = new Algorithm22();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 2][n + 2];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        /*for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }*/

        System.out.println(T.solution(arr));
        Instant finish = Instant.now();
        System.out.println("duration (ms): " + Duration.between(start, finish).toMillis());
    }
}
