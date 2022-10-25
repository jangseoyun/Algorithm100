package inflearn.algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Algorithm18 {
    public boolean check(int n) {//약수 찾는 로직은 강의 참고했습니다
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> solution(String str) {
        StringBuffer sb = new StringBuffer(str);
        String revs = sb.reverse().toString().replace("0", "");
        String[] split = revs.split(" ");

        int[] ints = Stream.of(split).mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 2; i < ints.length; i++) {
            if (check(ints[i])) {
                result.add(ints[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        Algorithm18 T = new Algorithm18();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String str = br.readLine();

        T.solution(str);
    }
}
