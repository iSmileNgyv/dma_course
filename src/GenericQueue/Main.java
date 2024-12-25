package GenericQueue;

public class Main {
    public static void main(String[] args) {
        var queue = new GenericQueue<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
    }
}
