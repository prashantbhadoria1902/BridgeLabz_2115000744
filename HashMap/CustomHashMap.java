import java.util.*;

class CustomHashMap<K, V> {
    private static final int SIZE = 16 ;
    private List<Entry<K, V>>[] map;

    static class Entry<K, V> {
        K key;
        V value;
        Entry(K key, V value) { this.key = key; this.value = value; }
    }

    public CustomHashMap() {
        map = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) map[i] = new LinkedList<>();
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    public void put(K key, V value) {
        int idx = hash(key);
        for (Entry<K, V> entry : map[idx]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        map[idx].add(new Entry<>(key, value));
    }

    public V get(K key) {
        int idx = hash(key);
        for (Entry<K, V> entry : map[idx]) {
            if (entry.key.equals(key)) return entry.value;
        }
        return null;
    }

    public void remove(K key) {
        int idx = hash(key);
        map[idx].removeIf(entry -> entry.key.equals(key));
    }

    public static void main(String[] args) {
        CustomHashMap<Integer, String> hashMap = new CustomHashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        System.out.println(hashMap.get(1));
        hashMap.remove(1);
        System.out.println(hashMap.get(1));
    }
}
