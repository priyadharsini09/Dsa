package Day8;
public class task1 {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 6, 1, 9, 2};
        int key = 6;

        int result = linearSearch(array, key);

        if (result == -1) {
            System.out.println("Element " + key + " not found in the array.");
        } else {
            System.out.println("Element " + key + " found at index: " + result);
        }
    }
}
