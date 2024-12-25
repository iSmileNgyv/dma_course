package GenericQueue;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String errMessage = null;
        var queue = new GenericQueue<Integer>();
        try {
            queue.enqueue(1);
            queue.enqueue(2);
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
        }catch(Exception e) {
            errMessage = e.getMessage();
        } finally {
            System.out.println(queue);
            System.err.println(errMessage != null ? errMessage : "");
        }

    }
}
