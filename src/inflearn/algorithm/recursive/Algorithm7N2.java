package inflearn.algorithm.recursive;

import java.util.Scanner;

public class Algorithm7N2 {
    public void solution(int n) {
        int answer = 0;
        if (n == 0) {
            return;
        } else {
            solution(n / 2);
            System.out.println(n % 2 + " ");
        }
    }

    public static void main(String[] args) {
        Algorithm7N2 T = new Algorithm7N2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T.solution(n);
    }
}
