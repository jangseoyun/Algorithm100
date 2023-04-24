package inflearn.algorithm.queue;

import java.util.*;

public class Algorithm44N8 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int tmp = arr[m];
        Arrays.sort(arr);
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int x : arr) {
            queue.offer(x);
        }
        System.out.println(queue);
        System.out.println(tmp);
        for (int i = 0; i < n; i++) {
            if (tmp == queue.poll()) {
                answer = i + 1;
            }
        }
        System.out.println(queue);
        return answer;
    }

    public static void main(String[] args) {
        Algorithm44N8 T = new Algorithm44N8();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
