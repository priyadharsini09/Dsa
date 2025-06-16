package Day8;
public class task2 {
    public static int binarySearch(int[] arr, int left, int right, int key) {
        if (left > right) {
            return -1; 
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == key) {
            return mid; 
        } else if (arr[mid] > key) {
            return binarySearch(arr, left, mid - 1, key);  
        } else {
            return binarySearch(arr, mid + 1, right, key); 
        }
    }
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14};  
        int key = 10;
        int result = binarySearch(array, 0, array.length - 1, key);
        if (result == -1) {
            System.out.println("Element " + key + " not found.");
        } else {
            System.out.println("Element " + key + " found at index: " + result);
        }
    }
}
