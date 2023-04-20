package inflearn.algorithm.queue;

import java.util.*;

public class Algorithm42N6 {
    public int solution(int n, int k) {
        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        System.out.println(queue);

        while (queue.size() > 1) {
            for (int i = 1; i <= k - 1; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        System.out.println(queue);

        return queue.peek();
    }

    public static void main(String[] args) {
        Algorithm42N6 T = new Algorithm42N6();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(T.solution(n, k));
    }
}
