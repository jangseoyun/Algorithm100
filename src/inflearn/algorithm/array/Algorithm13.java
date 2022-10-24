package inflearn.algorithm.array;

import java.util.Scanner;

public class Algorithm13 {
    public String solution(int[] arr) {
        String answer = "";
        answer += arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                answer += " " + arr[i + 1];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algorithm13 T = new Algorithm13();
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(arr));
    }
}
