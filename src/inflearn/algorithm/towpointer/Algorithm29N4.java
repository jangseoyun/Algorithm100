package inflearn.algorithm.towpointer;

import java.util.Scanner;

public class Algorithm29N4 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int sum = arr[0];
        for (int i = 0; i < n - 1; i++) {
            sum = arr[i];
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum == m) {
                    answer++;
                    break;
                }
                if (sum > m) {
                    sum = 0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algorithm29N4 T = new Algorithm29N4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
