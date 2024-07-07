package JAVA_OOP_IT3100.HOME_WORK.LESSON_9.TASK_3;

import java.util.EmptyStackException;

public class Stack<T> {
    private Object[] elements;
    private int size;
    private int capacity;

    public Stack() {
        this.capacity = 10; // Default capacity
        elements = new Object[capacity];
        size = 0;
    }

    public Stack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        this.capacity = capacity;
        elements = new Object[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) elements[size - 1];
    }

    public void push(T value) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        elements[size] = value;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T top = (T) elements[size - 1];
        elements[size - 1] = null; // Clear the reference
        size--;
        return top;
    }

    public int getSize() {
        return size;
    }
}
