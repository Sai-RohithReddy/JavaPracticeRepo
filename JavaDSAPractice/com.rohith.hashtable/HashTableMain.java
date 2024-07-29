public class HashTableMain {
    public static void main(String[] args) {
        HashTable ht = new HashTable(10);

        ht.put(3, "Hello");

        System.out.println(ht.get(1));
        System.out.println(ht.get(3));

        ht.remove(3);

        System.out.println(ht.get(3));
    }
}
