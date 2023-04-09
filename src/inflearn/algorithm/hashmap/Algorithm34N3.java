package inflearn.algorithm.hashmap;
import java.util.*;
public class Algorithm34N3 {
    public List solution(int n, int k, int[] arr){
        HashSet hashset = new HashSet<>();
        List answer = new ArrayList<>();
        for(int i = 0; i <= (n - k); i++){
            //hashSet에 담고 사이즈 answer 배열에 넣기
            for(int j = i; j < (i + k); j++){
                hashset.add(arr[j]);
            }
            answer.add(hashset.size());
            hashset.clear();
        }

        return answer;
    }
    public static void main(String[] args) {
        Algorithm34N3 T = new Algorithm34N3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (Object o : T.solution(n, k, arr)) {
            System.out.print(o + " ");
        }
    }
}
