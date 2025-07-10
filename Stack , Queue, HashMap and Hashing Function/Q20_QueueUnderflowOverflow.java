// Q20_QueueUnderflowOverflow.java
// Queue with underflow and overflow checks
public class Q20_QueueUnderflowOverflow {
    private int[] arr;
    private int head, tail, size, capacity;

    public Q20_QueueUnderflowOverflow(int k) {
        arr = new int[k];
        capacity = k;
        head = 0;
        tail = 0;
        size = 0;
    }

    public boolean enqueue(int x) {
        if (size == capacity) throw new RuntimeException("Queue Overflow");
        arr[tail] = x;
        tail = (tail + 1) % capacity;
        size++;
        return true;
    }

    public int dequeue() {
        if (size == 0) throw new RuntimeException("Queue Underflow");
        int val = arr[head];
        head = (head + 1) % capacity;
        size--;
        return val;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        Q20_QueueUnderflowOverflow queue = new Q20_QueueUnderflowOverflow(2);
        queue.enqueue(10);
        queue.enqueue(20);
        // queue.enqueue(30); // Uncomment to see overflow
        System.out.println(queue.dequeue()); // 10
        System.out.println(queue.dequeue()); // 20
        // System.out.println(queue.dequeue()); // Uncomment to see underflow
    }
}
