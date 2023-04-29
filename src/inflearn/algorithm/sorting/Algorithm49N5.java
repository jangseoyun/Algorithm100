package inflearn.algorithm.sorting;

import java.util.*;
public class Algorithm49N5 {
    public char solution(int n, int[] arr){
        //HashMap 사용할 수 있음
        char answer = 'D';
        HashSet<Integer> hashSet = new HashSet<>();
        for (int x : arr) {
            hashSet.add(x);
        }

        if (hashSet.size() == arr.length) {
            return 'U';
        }

        return answer;
    }
    public static void main(String[] args) {
        Algorithm49N5 T = new Algorithm49N5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
