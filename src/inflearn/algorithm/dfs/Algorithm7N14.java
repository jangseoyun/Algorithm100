package inflearn.algorithm.dfs;

import java.util.*;

public class Algorithm7N14 {
    static int n, m, answer;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;

    public void bfs(int v) {
        Queue<Integer> Q = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;//출발 지점
        Q.offer(v);

        while(!Q.isEmpty()){
           int cv = Q.poll(); //현재 지점
           for(int nv : graph.get(cv)){//nv: 인접 리스트
                if(ch[nv] == 0){
                    ch[nv] = 1;
                     Q.offer(nv);
                     dis[nv] = dis[cv] + 1; //인접은 현재 위치에서 + 1에서 온것
                }
           }
        }
    }

    public static void main(String[] args) {
        Algorithm7N14 T = new Algorithm7N14();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 정점의 수
        m = sc.nextInt(); // 간선의 수
        graph = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch = new int[n + 1];
        dis = new int[n + 1];
        T.bfs(1);

        for (int i = 2; i <= n; i++) {
            System.out.println(i + " " + dis[i]);
        }
    }
}
