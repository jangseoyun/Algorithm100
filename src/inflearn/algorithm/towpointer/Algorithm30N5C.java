package inflearn.algorithm.towpointer;

import java.util.Scanner;

public class Algorithm30N5C {
    public int solution(int n) {
        int answer = 0;
        int cnt = 1;
        n--;//-1

        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algorithm30N5C T = new Algorithm30N5C();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
