package inflearn.algorithm.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Algorithm33N2 {
    public String solution(String input1, String input2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        // map에 담기
        for (char c : input1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : input2.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // 모든 char의 수를 나누기 2 했을 때 나머지가 0이면 yes
        for (Character key : map.keySet()) {
            if ((map.get(key) % 2) != 0) {
                answer = "NO";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Algorithm33N2 T = new Algorithm33N2();
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        System.out.println(T.solution(input1, input2));
    }
}
