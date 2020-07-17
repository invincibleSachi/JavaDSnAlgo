package com.stacks;

import com.exceptions.StackException;

import java.lang.reflect.Array;

public class StackArrayImpl<E> {
    E[] arr;
    int size;
    int top = 0;

    StackArrayImpl(int size, Class<E> c) {
        arr = (E[]) Array.newInstance(c, size);
        this.size = size;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isfull() {
        return top == size - 1;
    }

    public E peek() {
        return arr[top];
    }

    public void push(E element) throws StackException {
        if (!isfull()) {
            arr[top++] = element;
        } else {
            throw new StackException("stack is full");
        }
    }

    public E pop() throws StackException {
        if (!isEmpty()) {
            return arr[top--];
        } else {
            throw new StackException("stack is empty");
        }
    }
}
