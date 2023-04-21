package inflearn.algorithm.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Algorithm43N7B {
    public String solution(String set, String n){
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();
        for (char c : set.toCharArray()) {
            queue.offer(c);
        }

        for (char x : n.toCharArray()) {
            if (queue.contains(x)) {
                if (x != queue.poll()) {
                    return "NO";
                }
            }
        }

        if (!queue.isEmpty()) {
            answer = "NO";
        }

        return answer;
    }
    public static void main(String[] args){
        Algorithm43N7B T = new Algorithm43N7B();
        Scanner sc = new Scanner(System.in);
        String set = sc.nextLine();
        String n = sc.nextLine();
        System.out.println(T.solution(set, n));
    }
}
