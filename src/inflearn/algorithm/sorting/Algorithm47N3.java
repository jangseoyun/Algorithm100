package inflearn.algorithm.sorting;

import java.util.Scanner;

public class Algorithm47N3 {
    public int[] solution(int n, int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > min) {
                    arr[j + 1] = arr[j];
                    arr[j] = min;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Algorithm47N3 T = new Algorithm47N3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
