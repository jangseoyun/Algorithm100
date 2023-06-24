package inflearn.algorithm.dfs;

import java.util.*;

public class Algorithm7N12 {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;

    public void dfs(int v) {//현재 지점.
        if (v == n) {
            answer++;
        } else {//출발지점에서 다른 노드를 도는 것.
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    dfs(i);//i로 이동해야한다
                    ch[i] = 0; //백트레킹하면서 체크 풀어주기
                }
            }
        }
    }

    public static void main(String[] args) {
        Algorithm7N12 T = new Algorithm7N12();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        graph = new int[n + 1][n + 1];
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }

        ch[1] = 1;
        T.dfs(1);
        System.out.println(answer);
    }
}
