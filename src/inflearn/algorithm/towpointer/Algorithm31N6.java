package inflearn.algorithm.towpointer;

import java.util.Scanner;

public class Algorithm31N6 {
    public int solution(int n, int k, int[] arr){
        int answer = 0;
        //1. cnt 번호를 변경한 횟수(k)
        int cnt = 0;
        //2. lt, rt 생성
        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            //3. rt는 0을 1로 변경해준다 치는것!! 실제 값을 변경해주는 것은 아니다
            if (arr[rt] == 0) {
                cnt++;
            }
            //4. 횟수가 k를 초과할 경우 lt가 0이면 cnt 차감
            while (cnt > k) {
                if (arr[lt] == 0){
                    cnt--; //차감하고 lt 이동
                    System.out.println("lt: "+arr[lt]);
                }
                lt++;
                System.out.println("while: "+answer);
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }
    public static void main(String[] args){
        Algorithm31N6 T = new Algorithm31N6();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }
}
