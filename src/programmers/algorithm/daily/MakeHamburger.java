package programmers.algorithm.daily;

public class MakeHamburger {
    public int solution(int[] ingredient) {
        int answer = 0;
        int[] burger = {1, 2, 3, 1};
        int pointerIngre = 0;
        int pointerBur = 0;

        int tmp = 0;

        for (int i = 0; i < ingredient.length; i++) {
            if (tmp == 4) {
                answer++;
            }

            if (ingredient[i] == burger[pointerBur]) {
                pointerBur++;
                continue;
            } else {
                tmp = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        MakeHamburger T = new MakeHamburger();
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(T.solution(ingredient));
    }
}
