package inflearn.algorithm.dfs;
import java.util.*;

public class Algorithm7N13 {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph; //ArrayList<Integer>
    static int[] ch;

    public void dfs(int v){
        if(v == n){
            answer++;
        }else{
            for(int nv : graph.get(v)){//v번의 ArrayList
                if(ch[nv] == 0){
                    ch[nv] = 1;
                    dfs(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Algorithm7N13 T = new Algorithm7N13();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();// 객체 생성
        for(int i = 0; i <= n; i++){// 0~5번까지 객체 생성해서 넣어주기
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n + 1];
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);//a번에 가능한 정점 넣기(시작시 주어지는 값)
        }
        ch[1] = 1;
        T.dfs(1);
        System.out.println(answer);
    }
}
