package inflearn.algorithm.array;

import java.util.Scanner;

public class Algorithm16 {
    public int[] solution(int[] arr) {
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 0; i < arr.length - 2; i++) {
            arr[i + 2] = arr[i] + arr[i + 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Algorithm16 T = new Algorithm16();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        int[] solution = T.solution(arr);
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }
}
