package inflearn.algorithm.dfs;

import java.util.Scanner;

public class Algorithm7N6 {
    static int n; //집합 원소의 갯수
    static int[] ch; //체크를 하고 안하고 부분집합 체크

    public void dfs(int L) {
        if (L == n + 1) {
            String tmp = "";
            for(int i = 1; i <= n; i++){
                if (ch[i] == 1) {
                    tmp += (i + " ");
                }
            }
            if (tmp.length() > 0){//공집합이 아니면 출력한다
                System.out.println(tmp);
            }
        } else {
            ch[L] = 1;//사용한다
            dfs(L + 1);// 왼쪽
            ch[L] = 0; //사용하지 않는다
            dfs(L + 1);// 오른쪽
        }
    }
    public static void main(String[] args) {
        Algorithm7N6 T = new Algorithm7N6();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ch = new int[n + 1]; // 인덱스 번호를 1~n
        T.dfs(1);
    }
}
