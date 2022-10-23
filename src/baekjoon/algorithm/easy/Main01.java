package baekjoon.algorithm.easy;

import java.io.*;

public class Main01 {

    private int[] arr;
    private int top;

    public Main01(int setSize) {
        this.arr = new int[setSize];
        this.top = 0;
    }

    public void push(int setNum) {

    }

    public int pop() {
        return 0;
    }

    public int size() {
        return 0;
    }

    public int peek() {
        return 0;
    }

    public int empty() {
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int setSize = Integer.parseInt(br.readLine());
        Main01 T = new Main01(setSize);

        for (int i = 0; i < setSize; i++) {
            String input = br.readLine();
            String[] split = input.split(" ");
            String order = split[0];

            if (order.equals("push")) {
                T.push(Integer.parseInt(split[1]));
            }

        }
    }
}
