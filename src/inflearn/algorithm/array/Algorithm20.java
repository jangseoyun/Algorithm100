package inflearn.algorithm.array;

import java.util.Scanner;

public class Algorithm20 {
    public int[] solution(int[] arr, int n) {
        int[] point = new int[n];
        int cnt = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    cnt++;
                }
            }
            point[i] = cnt;
            cnt = 1;
        }
        return point;
    }

    public static void main(String[] args) {
        Algorithm20 T = new Algorithm20();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i : T.solution(arr, n)) {
            System.out.print(i + " ");
        }
    }
}
