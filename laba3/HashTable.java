public class HashTable<K, V> {
    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;
        
        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    
    private Node<K, V>[] table;
    private int size;
    
    @SuppressWarnings("unchecked")
    public HashTable() {
        table = new Node[16];
        size = 0;
    }
    
    private int hash(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }
    
    public void put(K key, V value) {
        int index = hash(key);
        Node<K, V> current = table[index];
        
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }
        
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = table[index];
        table[index] = newNode;
        size++;
    }
    
    public V get(K key) {
        int index = hash(key);
        Node<K, V> current = table[index];
        
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }
    
    public V remove(K key) {
        int index = hash(key);
        Node<K, V> current = table[index];
        Node<K, V> prev = null;
        
        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return current.value;
            }
            prev = current;
            current = current.next;
        }
        return null;
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean containsKey(K key) {
        return get(key) != null;
    }
    
    public static void main(String[] args) {
        HashTable<String, Integer> table = new HashTable<>();
        
        table.put("a", 1);
        table.put("b", 2);
        table.put("c", 3);
        
        System.out.println("Размер: " + table.size());
        System.out.println("a = " + table.get("a"));
        System.out.println("b = " + table.get("b"));
        
        table.remove("b");
        System.out.println("После удаления b: " + table.get("b"));
        System.out.println("Новый размер: " + table.size());
    }
}