package inflearn.algorithm.recursion;

public class Algorithm55 {
    public void dfs(int n){
        if (n == 0) {//탈출 조건
            return;
        }
        dfs(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Algorithm55 T = new Algorithm55();
        T.dfs(3);
    }
}
