package question2;

import java.util.Arrays;

public class questionTwo {
    private int TOP;
    private int capacity;
    int[] list;
    int number;
    public questionTwo(int capacity) {
        this.capacity = capacity;
        list = new int[capacity];
        TOP = -1;
    } public boolean isFull() {
        return capacity == TOP+1;
    } public boolean isEmpty() {
        return capacity == 0;

    }

    public void push(int number) {
        this.number = number;
        if (isFull()) {
            System.out.println("The stack is Full");
            return;
        }
        list[++TOP] = number;

    } public int pop() {
        if (isEmpty()) {
            return -1;
        }
        return list[TOP--];
    } int peek() {

        return list[TOP];
    }

    public static void main(String[] args) {

            questionTwo stack1 = new questionTwo(3);
            stack1.push(1);
            stack1.push(2);
            stack1.push(3);
            System.out.println(Arrays.toString(stack1.list));
            questionTwo stack2 = new questionTwo(3);
            stack2.push(4);
            stack2.push(5);
            stack2.push(6);
            System.out.println(Arrays.toString(stack1.list));





    }
}
