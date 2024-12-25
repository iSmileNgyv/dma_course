package GenericQueue;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        var queue = new GenericQueue<Integer>();
        try {
            queue.enqueue(1);
            queue.enqueue(2);
            queue.dequeue();
            System.out.println(queue);
            queue.dequeue();
            System.out.println(queue);
            queue.dequeue();
        }catch(Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
