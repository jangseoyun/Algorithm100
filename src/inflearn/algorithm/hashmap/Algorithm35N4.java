package inflearn.algorithm.hashmap;

import java.util.*;

public class Algorithm35N4 {
    public int solution(String s, String t){
        int answer = 0;
        HashMap<Character, Integer> hashmap = new HashMap<>();
        //1. s 창문을 만든다
        for(int i = 0; i < t.length() - 1; i++){
            hashmap.put(s.charAt(i), 1);
        }

        //2. lt, rt 생성
        int lt = 0;
        for (int rt = t.length() - 1; rt < s.length() - t.length(); rt++) {
            for (char c : t.toCharArray()) {
                if (!hashmap.containsKey(c)) {
                    hashmap.put(c, hashmap.get(c) - 1);
                }
            }
            if (!hashmap.containsValue(0)) {
                answer++;
            }
            hashmap.remove(s.charAt(lt));
            hashmap.put(s.charAt(rt), 1);
            lt++;
            System.out.println(s.charAt(rt));
            System.out.println(answer);
            System.out.println(hashmap);
        }


        return answer;
    }
    public static void main(String[] args){
        Algorithm35N4 T = new Algorithm35N4();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(T.solution(s, t));
    }
}
