package inflearn.algorithm.array;

import java.util.Scanner;

public class Algorithm19 {
    public int solution(int[] arr) {
        int answer = (arr[0] == 1) ? 1 : 0;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == 1 && arr[i] == 1) {
                count++;
                answer += count;
            } else if (arr[i] == 1) {
                answer += arr[i];
            } else {
                count = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algorithm19 T = new Algorithm19();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(arr));
    }
}
