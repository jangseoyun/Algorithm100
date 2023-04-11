package inflearn.algorithm.hashmap;
import java.util.*;

public class Algorithm36N5 {
    public int solution(int n, int k, int[] arr){
        int answer = -1;
        TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
        //1. 경우의 수 for문
        for(int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++) {
                for(int l = j + 1; l < n; l++){
                    //2. set에 합산 값 넣기
                    ts.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        //3. k번째 수 answer에 넣고 출력
        int cnt = 0;
        for(int x : ts){
            cnt++;
            if (cnt == k) {
                answer = x;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Algorithm36N5 T = new Algorithm36N5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }
}
