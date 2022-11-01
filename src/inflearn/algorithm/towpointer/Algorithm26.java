package inflearn.algorithm.towpointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Algorithm26 {
    public List<Integer> solution(int[] arrN, int[] arrM, int n, int m) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        //1. 정렬해주기
        Arrays.sort(arrN);
        Arrays.sort(arrM);

        while (p1 < n && p2 < m) {
            if (arrN[p1] < arrM[p2]) {
                p1++;
            } else if (arrN[p1] == arrM[p2]) {
                answer.add(arrN[p1++]);
                p2++;
            } else {
                p2++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm26 T = new Algorithm26();
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
