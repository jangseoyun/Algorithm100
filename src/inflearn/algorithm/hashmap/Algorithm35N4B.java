package inflearn.algorithm.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Algorithm35N4B {
    public int solution(String s, String t){
        int answer = 0;
        //1. 문자열 담기
        HashMap<Character, Integer> sm = new HashMap<>();
        HashMap<Character, Integer> tm = new HashMap<>();

        //2. s 창문 만들기
        for (int i = 0; i < t.length() - 1; i++) {
            sm.put(s.charAt(i), sm.getOrDefault(s.charAt(i), 0) + 1);
        }

        //2-2. 비교 문자 t 세팅
        for (char c : t.toCharArray()) {
            //카운팅 하는 것으로 getOrDefault 사용
            tm.put(c, tm.getOrDefault(c, 0) + 1);
        }

        //3. lt, rt
        int lt = 0;
        for (int rt = t.length() - 1; rt < s.length(); rt++) {
            //rt 넣고: (창문 - 1) 조건으로 해야 처음부터 비교가 가능하다
            sm.put(s.charAt(rt), sm.getOrDefault(s.charAt(rt), 0) + 1);
            //비교
            if (sm.equals(tm)) {
                answer++;
            }
            //lt 빼고
            sm.put(s.charAt(lt), sm.get(s.charAt(lt)) - 1);
            //0이면 지우기 (존재하지 않다는 것)
            if (sm.get(s.charAt(lt)) == 0) {
                sm.remove(s.charAt(lt));
            }
            //lt, rt 이동
            lt++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Algorithm35N4B T = new Algorithm35N4B();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(T.solution(s, t));
    }
}
