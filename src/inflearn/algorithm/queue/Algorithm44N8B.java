package inflearn.algorithm.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
    int id;//순서 대기 목록
    int priority;//위험도

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}
public class Algorithm44N8B {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(new Person(i, arr[i]));//객체 생성
        }

        while (!queue.isEmpty()) {
            Person tmp = queue.poll();//확인한 환자
            for (Person person : queue) {//진료 여부 확인
                if (person.priority > tmp.priority) {
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }

            if (tmp != null) {
                answer++;
                if (tmp.id == m) {
                    return answer;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Algorithm44N8B T = new Algorithm44N8B();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
