package inflearn.algorithm.array;

import java.util.Scanner;

public class Algorithm14 {
    public int solution(int[] arr) {
        int answer = 1;
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm14 T = new Algorithm14();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(arr));
    }
}
