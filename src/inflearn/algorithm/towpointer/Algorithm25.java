package inflearn.algorithm.towpointer;

import java.util.Scanner;

public class Algorithm25 {
    public int[] solution(int[] arrN, int[] arrM, int n, int m) {
        int[] answer = new int[n + m];

        //1. 두 배열을 한 배열에 넣는다
        for (int i = 0; i < answer.length; i++) {
            for (int j = i; j < arrN.length; j++) {
                answer[i] = arrN[j];
                i++;
            }
            for (int j = 0; j < arrM.length; j++) {
                answer[i] = arrM[j];
                i++;
            }
        }

        //2. 오름차순으로 정렬
        int tmp = 0;
        for (int i = 0; i < answer.length; i++) {
            for (int j = i + 1; j < answer.length - 1; j++) {
                if (answer[i] > answer[j]) {
                    tmp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tmp;
                }
            }
            //System.out.println(Arrays.toString(answer));
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Algorithm25 T = new Algorithm25();
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
