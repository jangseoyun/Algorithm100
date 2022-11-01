package inflearn.algorithm.towpointer;

import java.util.ArrayList;
import java.util.Scanner;

public class Algorithm25B {
    public ArrayList<Integer> solution(int[] arrN, int[] arrM, int n, int m) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while (p1 < n && p2 < m) {
            if (arrN[p1] < arrM[p2]) {
                answer.add(arrN[p1++]);//p1의 값을 먼저 add하고 p1++ 증가
                //p1++;
            } else {
                answer.add(arrM[p2++]);
            }
        }

        while (p1 < n) {
            answer.add(arrN[p1++]);
        }

        while (p2 < m) {
            answer.add(arrM[p2++]);
        }

        return answer;

    }
    public static void main(String[] args) {
        Algorithm25B T = new Algorithm25B();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrN = new int[n];
        for (int i = 0; i < n; i++) {
            arrN[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arrM = new int[m];
        for (int i = 0; i < m; i++) {
            arrM[i] = sc.nextInt();
        }

        for (int num : T.solution(arrN, arrM, n, m)) {
            System.out.print(num + " ");
        }
    }
}
