package inflearn.algorithm.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithm10 {//teachermode e
    public String solution(String inputStr, char target) {
        String answer = "";
        int p = 1000;
        char[] chars = inputStr.toLowerCase().toCharArray();
        int[] result1 = new int[chars.length];
        int[] result2 = new int[chars.length];

        //좌 -> 우
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == target) {
                p = 0;
            } else {
                p++;
            }
            result1[i] = p;
        }
        System.out.println(Arrays.toString(result1));//[1, 0, 1, 2, 3, 0, 1, 2, 3, 4, 0]

        //우->좌
        for (int i = chars.length-1; i >= 0; i--) {
            p = 0; //p 초기화
            if (chars[i] == target) {
                p = 0;
            } else {
                p++;
            }
            result2[i] = p;
        }
        System.out.println(Arrays.toString(result2));

        for (int i = 0; i < result1.length; i++) {
            for (int j = result1.length; j < 1; j--) {
                if (result1[i] > result2[j]) {
                    result1[i] = result2[j];
                }
            }
            answer += result1[i] + " ";
        }

        System.out.println(answer);


        return answer;
    }
    public static void main(String[] args) {
        Algorithm10 T = new Algorithm10();
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        char inputChr = sc.next().charAt(0);

        System.out.println(T.solution(inputStr, inputChr));
    }
}
