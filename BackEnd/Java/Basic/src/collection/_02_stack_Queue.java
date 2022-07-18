package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _02_stack_Queue {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Queue q = new LinkedList();

        stack.push("0"); //스택에 추가
        stack.push("1");
        stack.push("2");
        System.out.println(stack);
        stack.pop(); //스택에서 요소 하나를 꺼냄
        System.out.println(stack);

        q.offer("0"); // 큐에 추가
        q.offer("1");
        q.offer("2");
        System.out.println(q);
        q.poll(); // 큐에서 요소 하나를 꺼냄
        System.out.println(q);
    }
}
