public class MaxHeap {
    public int[] heap;
    public int n;

    public MaxHeap(int n) {
        this.heap = new int[n + 1];
        this.n = 0;
    }

    public void insert(int x) {
        if (n == heap.length - 1) {
            System.out.println("Heap size exceded");
        }
        n++;
        heap[n] = x;
        swim(n);
    }

    public void swim(int k) {
        while (k > 1 && heap[k / 2] < heap[k]) {
            swap(k / 2, k);
            k = k / 2;
        }
    }

    public int delete() {
        int max = heap[1];
        swap(1, n);
        n--;
        sink(1);
        heap[n + 1] = 0;
        return max;
    }

    public void sink(int k) {
        while (k <= n) {
            int j = 2 * k;
            if (n < n && heap[j] < heap[j + 1]) {
                j++;
            }
            if (heap[k] >= heap[j]) {
                break;
            }
            swap(k, j);
            k = j;
        }
    } 

    public void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }
}
