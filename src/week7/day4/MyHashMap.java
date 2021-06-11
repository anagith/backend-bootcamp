package week7.day4;

public class MyHashMap<K, V> {

    private Bucket[] buckets;
    private int CAPACITY = 16;

    public MyHashMap() {
        buckets = new Bucket[CAPACITY];
    }

    public void put(K key, V value) {
        if (countOfFreeBuckets() < CAPACITY / 3) {
            Expand(CAPACITY);
        }
        if (contains(key)) {
            update(key, value);
        } else {
            int hashCode = getHash(key);
            if (buckets[hashCode] == null) {
                buckets[hashCode] = new Bucket();
            }
            buckets[hashCode].addEntry(new Entry<>(key, value));
        }
    }


    @SuppressWarnings("unchecked")
    public V get(K key) {
        if (contains(key)) {
            return (V) getEntry(key).getValue();
        }
        return null;
    }

    public void delete(K key) {
        if (contains(key)) {
            int hashCode = getHash(key);
            buckets[hashCode].removeEntry(getEntry(key));
        }
    }


    private void update(K key, V value) {
        Entry entry = getEntry(key);
        entry.setValue(value);
    }


    private int getHash(K key) {
        return key.hashCode() % CAPACITY;
    }

    private Entry getEntry(K key) {
        int hashCode = getHash(key);
        Bucket bucket = buckets[hashCode];

        for (int i = 0; i < bucket.getEntries().size(); i++) {
            Entry entry = bucket.getEntries().get(i);
            if (entry.getKey().equals(key)) {
                return entry;
            }
        }
        return null;
    }

    private boolean contains(K key) {
        int hashCode = getHash(key);
        Bucket bucket = buckets[hashCode];
        for (int i = 0; bucket != null && i < bucket.getEntries().size(); i++) {
            if (bucket.getEntries().get(i).getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    private int countOfFreeBuckets() {
        int count = 0;
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] == null || buckets[i].getEntries().isEmpty()) {
                count++;
            }
        }
        return count;
    }

    private void Expand(int capacity) {
        CAPACITY = capacity * 2;
        Bucket[] newBuckets = new Bucket[CAPACITY];
        for (int i = 0; i < buckets.length; i++) {
            for (int j = 0; j < buckets[i].getEntries().size(); j++) {
                int hashCode = getHash((K) buckets[i].getEntries().get(i).getKey()) % CAPACITY;
                if (newBuckets[hashCode] == null) {
                    newBuckets[hashCode] = new Bucket();
                }
                newBuckets[hashCode].addEntry(buckets[i].getEntries().get(i));
            }
        }
        buckets = newBuckets;
    }

    public String arrayToString(Bucket[] buckets) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] == null || buckets[i].getEntries().isEmpty()) {
                b.append("");
            } else {
                b.append(String.valueOf(buckets[i]));
            }
        }
        return b.toString();
    }

    @Override
    public String toString() {
        return "MyHashMap{" +
                arrayToString(buckets) +
                '}';
    }
}
