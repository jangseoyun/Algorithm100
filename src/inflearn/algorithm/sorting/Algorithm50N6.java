package inflearn.algorithm.sorting;

import java.util.*;

public class Algorithm50N6 {
    public List<Integer> solution(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for (int i = 0; i < n; i++) {
            if (arr[i] != tmp[i]) {
                answer.add(i + 1);
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        Algorithm50N6 T = new Algorithm50N6();
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
