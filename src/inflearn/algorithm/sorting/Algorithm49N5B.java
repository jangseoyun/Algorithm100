package inflearn.algorithm.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithm49N5B {
    public char solution(int n, int[] arr){
        //정렬로 nlogn 풀이
        char answer = 'U';
        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return 'D';
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Algorithm49N5B T = new Algorithm49N5B();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
