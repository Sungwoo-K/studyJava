package ch09.generic;

import java.util.LinkedList;

// 큐(Queue): FIFO(First In First Out)
// ex) 메세지 처리 시스템
public class GnenricQueue<T> {
    private LinkedList<T> queue = new LinkedList<>();

    public void enqueue(T item) {
        queue.addLast(item);
    }

    public T dequeue() {
        return queue.pollFirst();
    }
}
