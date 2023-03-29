package inflearn.algorithm.towpointer;

import java.util.Scanner;

public class Algorithm30N5 {
    public int solution(int n) {
        int sum = 0;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += j;
                if (sum == n) {
                    answer++;
                    i++;
                    break;
                }
                if (sum > n) {
                    sum = 0;
                    break;
                }
                System.out.println("sum: "+sum);
                System.out.println(answer);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algorithm30N5 T = new Algorithm30N5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
