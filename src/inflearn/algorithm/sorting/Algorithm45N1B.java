package inflearn.algorithm.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithm45N1B {
    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;

            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public static void main(String[] args) {
        Algorithm45N1B T = new Algorithm45N1B();
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
