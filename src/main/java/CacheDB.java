import java.util.LinkedHashMap;

public class CacheDB {
    int maxNumOfElements;
    private LinkedHashMap<Integer, Integer> dictionary = new LinkedHashMap<>();

    public CacheDB(int maxNumOfElements) {
        this.maxNumOfElements = maxNumOfElements;
    }

    public void put(int key, int value) {
        System.out.println("put key:" + key + " value:" + value);
        Integer existingKey = dictionary.get(key);
        if (existingKey != null) {
            dictionary.remove(key);
        }
        dictionary.put(key, value);

        if (dictionary.size() > maxNumOfElements) {
            dictionary.remove(dictionary.entrySet().iterator().next().getKey());
        }
        print();
    }

    public int get(int key) {
        System.out.println("get key:" + key);
        Integer existingKey = dictionary.getOrDefault(key, -1);
        if (existingKey != -1) {
            dictionary.remove(key);
            dictionary.put(key, existingKey);
        }
        print();
        return existingKey;
    }

    public void print() {
        System.out.println(dictionary);
    }
}
