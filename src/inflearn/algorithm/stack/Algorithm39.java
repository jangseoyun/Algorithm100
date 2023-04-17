package inflearn.algorithm.stack;
import java.util.*;

public class Algorithm39 {
    public int solution(int[][] arr, int[] moves){
        int answer = 0;
        //1. 바구니에 담기
        Stack<Integer> basket = new Stack<>();

        //2. 이차원 배열에서 moves 뽑기
        for(int pos: moves){//열
            for(int i = 0; i < arr.length; i++){//행
                if (arr[i][pos - 1] != 0) {
                    int tmp = arr[i][pos - 1]; //인형 임시 보관
                    arr[i][pos - 1] = 0; //인형 빼주기
                    if (!basket.isEmpty() && basket.peek() == tmp) {//인형이 일치할 경우
                        answer += 2;
                        basket.pop();
                    } else {
                        basket.push(tmp); // 중복이 아니면 바구니에 담기
                    }
                    break;//⭐️
                }
            }
        }

        return answer;
    }
    public static void main(String[] args){
        Algorithm39 T = new Algorithm39();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(T.solution(arr, moves));
    }
}
