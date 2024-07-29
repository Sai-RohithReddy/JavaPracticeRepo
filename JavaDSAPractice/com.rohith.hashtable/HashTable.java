public class HashTable {
    public HashNode[] buckets;
    public int numberOfBuckets;
    public int size;

    public HashTable(int capacity) {
        this.buckets = new HashNode[capacity];
        this.numberOfBuckets = capacity;
    }

    private int getBucketIndex(int key) {
        return key % this.numberOfBuckets;
    }

    public void put(int key, String val) {
        int bucketIndex = getBucketIndex(key);
        HashNode head = this.buckets[bucketIndex];
        
        while (head != null) {
            if (head.key == key) {
                head.val = val;
                return;
            }
            head = head.next;
        }
        size++;
        head = buckets[bucketIndex];
        HashNode node = new HashNode(key, val);
        node.next = head;
        buckets[bucketIndex] = node;
    }

    public String get(int key) {
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];

        while (head != null) {
            if (head.key == key) {
                return head.val;
            }
            head = head.next;
        }
        return null;
    }
    public String remove(int key) {
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        HashNode prev = null;

        while (head != null) {
            if (head.key == key) {
                break;
            }
            prev = head;
            head = head.next;
        }
        if (head == null) return null;
        size--;
        if (prev != null) {
            prev.next = head.next;
        } else {
            buckets[bucketIndex] = head.next;
        }
        return head.val;
    }
}
