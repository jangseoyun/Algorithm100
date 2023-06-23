package inflearn.algorithm.recursive;

import java.util.Scanner;

public class Algorithm7N3 {
    public int solution(int n){
        if (n == 1) {
            return 1;
        } else {
            return n * solution(n - 1);
        }
    }
    public static void main(String[] args) {
        Algorithm7N3 T = new Algorithm7N3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
