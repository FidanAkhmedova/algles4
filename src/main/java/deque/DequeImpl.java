package deque;

import lesson3.TwoSideLinkedList;
import lesson3.TwoSideLinkedListImpl;

import java.util.Arrays;

public class DequeImpl<E> implements Deque<E> {
    private final E[] data;
    private int size;
    private int tail;
    private int head;
    public DequeImpl(int maxSize) {
        this.data = (E[]) new Object[maxSize];
        tail = -1;
        head = 0;
    }

    @Override
    public boolean insertLeft(E value) {
        return false;
    }

    @Override
    public boolean insertRight(E value) {
        data[++tail] = value;
        size++;
        return true;    }

    @Override
    public E removeLeft() {
        if (isEmpty()) {
            return null;
        }
        E value = data[head];
        data[head++] = null;
        size--;
        return value;
    }

    @Override
    public E removeRight() {
        return null;
    }

    @Override
    public boolean insert(E value) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E peekFront() {
        return data[head];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = head; i <= tail; i++) {
            sb.append(data[i]);
            if (i != tail) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString();
    }
}
