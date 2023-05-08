package inflearn.algorithm.sorting;

import java.util.*;

public class Algorithm54N10 {
    public int count(int[] arr, int dist){
        int count = 1;//말의 마리 수
        int ep = arr[0];//가장 왼쪽에 배치하기 위해서 (마구간의 좌표)
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= dist) {
                count++;
                ep = arr[i];
            }
        }
        return count;
    }
    public int solution(int n, int c, int[] arr){
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n - 1];//전체 거리 (n - 1)

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Algorithm54N10 T = new Algorithm54N10();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, c, arr));
    }
}
