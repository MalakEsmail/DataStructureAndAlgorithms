package HashTable;

public class HashTableArrayDemo {

    public static void main(String[] args) {
        HashTableArray<String> ht = new HashTableArray<String>(10);
        ht.put(10, "malak");
        ht.put(12, "aya");
        ht.put(11, "menna");
        System.out.println(ht.get(10));
    }
}
