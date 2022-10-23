package baekjoon.algorithm.easy;

import java.util.EmptyStackException;

public class StackMain {
    private static final int CAPACITY = 10;
    private static final int[] EMPTY_ARRAY = {};

    private int[] arr;
    private int size;

    public StackMain() {
        this.arr = EMPTY_ARRAY;
        this.size = 0;
    }

    public StackMain(int capacity) {
        this.arr = new int[capacity];
        this.size = size;
    }

    public void push(int pushNum) {
        /*if (size == arr.length) {
            resize();
        }*/
        arr[size] = pushNum;
        size++;
        System.out.println(arr[size - 1]);
    }

    public int pop() {
        try {
            int pop = arr[size - 1];
            arr[size - 1] = 0;
            size--;
            return pop;
        } catch (EmptyStackException e) {
            throw new ArrayIndexOutOfBoundsException("스택 범위를 초과했습니다");
        }
    }

    public int peek() {
        int peek = arr[size - 1];
        return peek;
    }

    public int size() {
        return size;
    }

    public void clear() {
        arr = EMPTY_ARRAY;
        size = 0;
    }

    public boolean empty() {
        return size == 0;
    }


}
