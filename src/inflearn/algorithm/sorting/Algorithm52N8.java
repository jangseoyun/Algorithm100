package inflearn.algorithm.sorting;

import java.util.*;

public class Algorithm52N8 {
    public int solution(int n, int m, int[] arr){
        int answer = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (m == arr[i]) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Algorithm52N8 T = new Algorithm52N8();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
