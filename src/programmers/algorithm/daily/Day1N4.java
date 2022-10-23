package programmers.algorithm.daily;

public class Day1N4 {
    int solution(int num1, int num2) {
        int answer = 0;
        int FINAL = 1000;
        float div = (float) num1 / num2;

        if (num1 > 0 && num1 <= 100 && num2 > 0 && num2 <= 100) {
            answer = (int)(div * FINAL);
        }

        //answer = 1000 * num1 / num2;

        return answer;
    }

    public static void main(String[] args) {
        Day1N4 T = new Day1N4();
        System.out.println(T.solution(3, 2));
    }
}
