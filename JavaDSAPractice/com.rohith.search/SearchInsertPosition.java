public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7};
        System.out.println(search(arr, 5));
        System.out.println(search(arr, 2));
        System.out.println(search(arr, 8));
        System.out.println(search(arr, 0));
    }
    public static int search(int[] arr, int t) {
        int s = 0; 
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == t) return mid;
            if (arr[mid] > t) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return s;
    }
}
