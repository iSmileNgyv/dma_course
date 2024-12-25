package GenericQueue;

import GenericQueue.Exceptions.QueueNotFoundError;

import java.util.ArrayList;

public class GenericQueue<T> {
    private final ArrayList<T> list;

    public GenericQueue() {
        list = new ArrayList<>();
    }

    public void enqueue(T item) {
        list.add(item);
    }

    public void dequeue() {
        if (this.isEmpty()) {
            throw new QueueNotFoundError("Queue is empty");
        }
        list.removeFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
