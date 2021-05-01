public class Main {
    public static void main(String[] args) {
        System.out.println("main");
        CacheDB cacheDB = new CacheDB(3);
        cacheDB.put(1, 11);
        cacheDB.put(2, 22);
        cacheDB.put(3, 33);
        int i1 = cacheDB.get(1);
        System.out.println("i1: "+i1);
        cacheDB.put(4, 44);
        int i2= cacheDB.get(2);
        System.out.println("i2: "+i2);

    }
}
