package inflearn.algorithm.array;

import java.util.Scanner;

public class Algorithm17 {//정답 확인 했습니다. 값을 제거할 생각만 했음.. 1을 넣어주어 확인하는 방법

    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1]; //배열은 n + 1로 해줘야한다.
        for (int i = 2; i <= n; i++) {//2의 배수부터
            if (ch[i] == 0) {//만약 0이면 소수에 해당된다는 것
                answer++;
                for (int j = i; j <= n; j = j + i) {//** i의 배수인 경우 값 1을 넣어줌!!!
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algorithm17 T = new Algorithm17();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(T.solution(input));
    }
}
