package inflearn.algorithm.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Algorithm32N1 {
    public char solution(int n, char[] arr) {
        int cnt = Integer.MIN_VALUE;
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : arr) {//count 할 때 getOrDefault 사용한다.
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char key : map.keySet()){
            if (map.get(key) > cnt) {
                cnt = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm32N1 T = new Algorithm32N1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        System.out.println(T.solution(n, arr));
    }
}
