package inflearn.algorithm.queue;

import java.util.*;

public class Algorithm43N7 {
    public String solution(String set, String n){
        String answer = "YES";
        char[] setArray = set.toCharArray();
        Queue<Character> queue = new LinkedList<>();

        for (char c : n.toCharArray()) {
            queue.offer(c);
        }
        System.out.println(queue);

        for (int i = 0; i < setArray.length; i++) {
            if (!queue.contains(setArray[i])) {
                answer = "NO";
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args){
        Algorithm43N7 T = new Algorithm43N7();
        Scanner sc = new Scanner(System.in);
        String set = sc.nextLine();
        String n = sc.nextLine();
        System.out.println(T.solution(set, n));
    }
}
