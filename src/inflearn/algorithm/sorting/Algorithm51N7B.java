package inflearn.algorithm.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //정렬 기준
    @Override
    public int compareTo(Point point) {
        if (this.x == point.x) {
            return this.y - point.y;//오름차순이기 때문에 음수 값이 리턴되게 하라
        } else {
            return this.x - point.x;
        }
    }
}

public class Algorithm51N7B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr);//Comparable 인터페이스 오버라이딩을 통해서 정렬
        for (Point point : arr) {
            System.out.println(point.x + " " + point.y);
        }
    }
}
