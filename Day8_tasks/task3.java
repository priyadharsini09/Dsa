package Day8;
public class task3 {
    public static int search(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[left] <= arr[mid]) {
                if (key >= arr[left] && key < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            else {
                if (key > arr[mid] && key <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;  
    }
    public static void main(String[] args) {
        int[] arr = { 13, 18, 25, 2, 8, 10 };
        int key = 8;
        int result = search(arr, key);
        if (result == -1) {
            System.out.println("Element " + key + " not found.");
        } else {
            System.out.println("Element " + key + " found at index: " + result);
        }
    }
}
