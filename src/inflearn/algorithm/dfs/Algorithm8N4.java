package inflearn.algorithm.dfs;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithm8N4 {
    //중복 순열
    static int[] pm;
    static int n, m;

    public void dfs(int level) {
        if (level == m) {
            System.out.println(Arrays.toString(pm));
        } else {
            for (int i = 1; i <= n; i++) {
                pm[level] = i;
                dfs(level + 1);
            }
        }
    }

    public static void main(String[] args) {
        Algorithm8N4 T = new Algorithm8N4();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();//3
        m = sc.nextInt();//2
        pm = new int[m];

        T.dfs(0);
    }
}
