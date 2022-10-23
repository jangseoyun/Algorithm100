package programmers.algorithm.daily;

public class Day1N1 {//22년도 기준 출생 연도 계산
    int solution(int age) {
        int now = 2022;
        int answer = 0;

        if (age >= 0 && age <= 120) {
            answer = (now - age) + 1;
        }

        return answer;
    }
}
