package question3;
import question2.questionTwo.*;

public class questionThree {
    private question2.questionTwo stack1;
    private  question2.questionTwo stack2;

    public questionThree(int capacity) {
        stack1 = new question2.questionTwo(capacity);
        stack2 = new question2.questionTwo(capacity);
    }

    public void enqueue(int number) {
        if (stack1.isFull()) {
            System.out.println("Queue is full");
            return;
        }

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack1.push(number);

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return stack1.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public static void main(String[] args) {
        questionThree queue = new questionThree(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
