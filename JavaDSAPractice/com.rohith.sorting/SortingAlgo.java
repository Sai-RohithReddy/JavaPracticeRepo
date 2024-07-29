import java.util.Arrays;

public class SortingAlgo {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        // bubbleSort(arr);
        // insertionSort(arr);
        // selectionSort(arr);
        // mergeSort(arr);
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }   
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void mergeSort(int[] arr) {
        int s = 0;
        int n = arr.length;
        int e = n - 1;
        int[] temp = new int[n];

        mergeSortUtil(arr, temp, s, e);
    }
    private static void mergeSortUtil(int[] arr, int[] temp, int s, int e) {
        if (s < e) {
            int mid = s + (e - s) / 2;
            mergeSortUtil(arr, temp, s, mid);
            mergeSortUtil(arr, temp, mid + 1, e);
            merge(arr, temp, s, mid, e);
        }
    }
    private static void merge(int[] arr, int[] temp, int s, int m, int e) {
        for (int i = s; i <= e; i++) {
            temp[i] = arr[i];
        }
        int i = s, j = m + 1, k = s;

        while (i <= m && j <= e) {
            if (temp[i] < temp[j]) {
                arr[k++] = temp[i++];
            } else {
                arr[k++] = temp[j++];
            }
        }
        while (i <= m) {
            arr[k++] = temp[i++];
        }
    }

    public static void quickSort(int[] arr) {
        quickSortUtil(arr, 0, arr.length - 1);
    }
    private static void quickSortUtil(int[] arr, int s, int e) {
        if (s < e) {
            int p = pivot (arr, s, e);
            quickSortUtil(arr, s, p - 1);
            quickSortUtil(arr, p + 1, e);
        }
    }
    private static int pivot(int[] arr, int s, int e) {
        int pivot = arr[e];
        int i = s;
        int j = s;

        while (i <= e) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        return j - 1;
    }
}
