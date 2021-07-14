package week7.day4;

import java.util.LinkedList;
import java.util.List;

public class Bucket {
    private List<Entry> entries;

    public Bucket() {
        entries = new LinkedList<>();
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void addEntry(Entry entry) {
        entries.add(entry);
    }

    public void removeEntry(Entry entry) {
        entries.remove(entry);
    }

    @Override
    public String toString() {
        return "{" +
                entries +
                '}';
    }
}
