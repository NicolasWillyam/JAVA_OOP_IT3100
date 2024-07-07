package JAVA_OOP_IT3100.HOME_WORK.LESSON_9.TASK_3;

import java.util.EmptyStackException;

public class TestStack {

    public static void main(String[] args) {
        testStackOfChars();
        testStackOfIntegers();
    }

    public static void testStackOfChars() {
        System.out.println("Testing StackOfChars:");
        StackOfChars stack = new StackOfChars(5);

        // Pushing elements
        stack.push('A');
        stack.push('B');
        stack.push('C');
        stack.push('D');
        stack.push('E');

        // Popping elements
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        // Trying to pop from empty stack (should throw EmptyStackException)
        try {
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void testStackOfIntegers() {
        System.out.println("\nTesting StackOfIntegers:");
        StackOfIntegers stack = new StackOfIntegers();

        // Pushing elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Popping elements
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        // Trying to pop from empty stack (should throw EmptyStackException)
        try {
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
