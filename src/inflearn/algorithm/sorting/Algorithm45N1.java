package inflearn.algorithm.sorting;

import java.util.*;

public class Algorithm45N1 {
    public int[] solution(int n, int[] arr){
        int[] answer = arr;
        int tmp = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        return answer;
    }
    public static void main(String[] args) {
        Algorithm45N1 T = new Algorithm45N1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int x : T.solution(n, arr)){
            System.out.print(x + " ");
        }
    }
}
