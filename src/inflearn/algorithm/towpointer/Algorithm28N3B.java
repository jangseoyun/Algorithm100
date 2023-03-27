package inflearn.algorithm.towpointer;

import java.util.Scanner;

public class Algorithm28N3B {
    public int solution(int totalDate,int days, int[] sales) {
        int sum = 0;
        int answer = 0;

        for (int i = 0; i < days; i++) {
            sum += sales[i];
        }

        answer = sum;

        //창문 만들기
        for (int i = days; i < totalDate; i++) {
            sum += sales[i];
            sum -= sales[i - days];
            //sum += (sales[i] - sales[i - days]);
            answer = Math.max(sum, answer);
        }
        return answer;
    }
    public static void main(String[] args) {
        Algorithm28N3B T = new Algorithm28N3B();
        Scanner sc = new Scanner(System.in);
        int totalDate = sc.nextInt();
        int days = sc.nextInt();
        int[] sales = new int[totalDate];
        for (int i = 0; i < totalDate; i++) {
            sales[i] = sc.nextInt();
        }
        System.out.println(T.solution(totalDate, days, sales));
    }
}
