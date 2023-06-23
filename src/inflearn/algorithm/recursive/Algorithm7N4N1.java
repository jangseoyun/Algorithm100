package inflearn.algorithm.recursive;

import java.util.Scanner;

public class Algorithm7N4N1 {
    static int[] fibo;
    public int DFS(int n) {
        if (fibo[n] > 0) {//0보다 크면 이미 값이 구해진 상황
            return fibo[n];
        }

        if (n == 1) {
            return fibo[n];
        } else if (n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = DFS(n - 2) + DFS(n - 1);
        }
    }
    public static void main(String[] args) {
        Algorithm7N4N1 T = new Algorithm7N4N1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo = new int[n + 1]; // 0 인덱스는 제외하기 때문에
        T.DFS(n);
        for (int i = 0; i < n; i++) {
            //System.out.println(T.DFS(n));
            System.out.println(fibo[i] + " ");
        }
    }
}
