package inflearn.algorithm.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithm48N4 {
    public int[] solution(int s, int[] arr) {
        int[] cache = new int[s];
        System.out.println(Arrays.toString(cache));
        //전체 arr
        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < cache.length; i++) {
                if (x == cache[i]) {
                    pos = i;
                }
            }
            if (pos == -1) {//miss
                for (int j = cache.length - 1; j >= 1; j--) {
                    cache[j] = cache[j - 1];
                }
                cache[0] = x;
            } else {
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            }
        }

        return cache;
    }
    public static void main(String[] args) {
        Algorithm48N4 T = new Algorithm48N4();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : T.solution(s, arr)) {
            System.out.print(x + " ");
        }
    }
}
