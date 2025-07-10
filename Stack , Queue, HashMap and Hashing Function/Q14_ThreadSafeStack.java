// Q14_ThreadSafeStack.java
// Thread-safe stack using ConcurrentLinkedDeque
import java.util.concurrent.ConcurrentLinkedDeque;

public class Q14_ThreadSafeStack<T> {
    private ConcurrentLinkedDeque<T> stack = new ConcurrentLinkedDeque<>();

    public void push(T x) {
        stack.push(x);
    }

    public T pop() {
        return stack.poll();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Q14_ThreadSafeStack<Integer> stack = new Q14_ThreadSafeStack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop()); // 2
        System.out.println(stack.pop()); // 1
    }
}
