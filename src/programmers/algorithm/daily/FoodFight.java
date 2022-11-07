package programmers.algorithm.daily;

public class FoodFight {
    public String solution(int[] food) {
        String answer = "";
        int div = 0;
        for (int i = 1; i < food.length; i++) {
            div = food[i] / 2;
            for (int j = 1; j <= div; j++) {
                answer += i;
            }
        }

        StringBuffer sb = new StringBuffer();
        sb.append(answer);
        answer += 0;
        answer += sb.reverse();

        return answer;
    }
    public static void main(String[] args) {
        FoodFight T = new FoodFight();
        int[] food = {1, 7, 1, 2};
        System.out.println(T.solution(food));
    }
}
