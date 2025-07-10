// Q9_CustomHashMap.java
// Implement a custom HashMap with separate chaining
class Q9_CustomHashMap<K, V> {
    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;
        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 16;
    private Node<K, V>[] table;

    @SuppressWarnings("unchecked")
    public Q9_CustomHashMap() {
        table = new Node[SIZE];
    }

    private int hash(K key) {
        return (key.hashCode() & 0x7fffffff) % SIZE;
    }

    public void put(K key, V value) {
        int idx = hash(key);
        Node<K, V> node = table[idx];
        while (node != null) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
            node = node.next;
        }
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = table[idx];
        table[idx] = newNode;
    }

    public V get(K key) {
        int idx = hash(key);
        Node<K, V> node = table[idx];
        while (node != null) {
            if (node.key.equals(key)) return node.value;
            node = node.next;
        }
        return null;
    }

    public void remove(K key) {
        int idx = hash(key);
        Node<K, V> node = table[idx], prev = null;
        while (node != null) {
            if (node.key.equals(key)) {
                if (prev == null) table[idx] = node.next;
                else prev.next = node.next;
                return;
            }
            prev = node;
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Q9_CustomHashMap<String, Integer> map = new Q9_CustomHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println(map.get("two")); // 2
        map.remove("two");
        System.out.println(map.get("two")); // null
    }
}
