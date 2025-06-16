package Day8;
import java.util.Arrays;
public class postassignment8 {
    public static int firstOccurrence(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    public static int lastOccurrence(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        while (left <= right) {
           int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                result = mid;
                left = mid + 1;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    public static int frequencyCount(int[] arr, int key) {
        int first = firstOccurrence(arr, key);
        if (first == -1) return 0; 
        int last = lastOccurrence(arr, key);
        return last - first + 1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 6, 6, 7, 8, 8, 10};
        int key = 4;
        Arrays.sort(arr);
        int freq = frequencyCount(arr, key);
        System.out.println("Frequency of " + key + " is: " + freq);
    }
}
