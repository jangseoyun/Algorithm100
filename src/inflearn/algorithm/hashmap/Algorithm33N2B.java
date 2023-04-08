package inflearn.algorithm.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Algorithm33N2B {
    public String solution(String input1, String input2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : input1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c: input2.toCharArray()){
            if(!map.containsKey(c) || map.get(c) == 0){
                return "NO";
            }

            map.put(c, map.get(c) - 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Algorithm33N2B T = new Algorithm33N2B();
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        System.out.println(T.solution(input1, input2));
    }
}
