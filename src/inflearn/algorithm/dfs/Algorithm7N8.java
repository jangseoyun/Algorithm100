package inflearn.algorithm.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Algorithm7N8 {
    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] ch; // 한번 방문한 것은 check 배열에 넣기.
    Queue<Integer> Q = new LinkedList<>();

    public int bfs(int s, int e) {
        ch = new int[100001];
        ch[s] = 1; // 시작 root에 1 넣기
        Q.offer(s); // root 번호 넣기
        int L = 0; // 레벨
        while (!Q.isEmpty()) {
            int len = Q.size(); // 레벨의 원소 사이즈
            for (int i = 0; i < len; i++) {
                int x = Q.poll();

                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if (x == e) {
                        return L;
                    }
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Algorithm7N8 T = new Algorithm7N8();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(T.bfs(s, e));
    }
}
