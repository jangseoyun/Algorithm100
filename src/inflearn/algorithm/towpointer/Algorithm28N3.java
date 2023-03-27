package inflearn.algorithm.towpointer;

import java.util.Scanner;

public class Algorithm28N3 {
    public int solution(int days, int[] sales) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < (sales.length - days); i++) {
            for (int j = i; j < (i + days); j++) {
                sum += sales[j];
            }
            if (sum > max) {
                max = sum;
            }
            sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        Algorithm28N3 T = new Algorithm28N3();
        Scanner sc = new Scanner(System.in);
        int totalDate = sc.nextInt();
        int days = sc.nextInt();
        int[] sales = new int[totalDate];
        for (int i = 0; i < totalDate; i++) {
            sales[i] = sc.nextInt();
        }
        System.out.println(T.solution(days, sales));
    }
}
