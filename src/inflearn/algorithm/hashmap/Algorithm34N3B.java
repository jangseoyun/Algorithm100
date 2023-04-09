package inflearn.algorithm.hashmap;
import java.util.*;

public class Algorithm34N3B {
    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hashmap = new HashMap<>();

        //1. k 창문 만들기
        for (int i = 0; i < k - 1; i++) {
            hashmap.put(arr[i], hashmap.getOrDefault(arr[i], 0) + 1);
        }

        //2. lt, rt 준비
        // rt는 창문 마지막 숫자에서 시작
        int lt = 0;
        for (int rt = k - 1; rt < arr.length; rt++) {
            //3. hashmap key값에 rt 값 넣기
            hashmap.put(arr[rt], hashmap.getOrDefault(arr[rt], 0) + 1);
            //3-1.answer 값 넣기
            answer.add(hashmap.size());
            //4. hashmap에서 lt값 0으로 변경
            hashmap.put(arr[lt], hashmap.get(arr[lt]) - 1);
            //5. 0인 값 제거 (lt)
            if (hashmap.get(arr[lt]) == 0) {
                hashmap.remove(arr[lt]);
            }
            //6. lt 이동
            lt++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Algorithm34N3B T = new Algorithm34N3B();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (int x : T.solution(n, k, arr)) {
            System.out.print(x + " ");
        }

    }
}
