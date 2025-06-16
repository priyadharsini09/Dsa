package Day8;
import java.util.Scanner;
public class Main {
    public static int linearSearch(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
    public static String detectTypeAndConvert(String input) {
        try {
            Integer.parseInt(input);
            return input; 
        } catch (NumberFormatException e1) {
            try {
                Double.parseDouble(input);
                return input;
            } catch (NumberFormatException e2) {
                return input;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array elements separated by space:");
        String[] arr = scanner.nextLine().split(" ");
        System.out.println("Enter key to search:");
        String key = scanner.nextLine();
        int index = linearSearch(arr, detectTypeAndConvert(key));
        if (index == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + index);
        }

        scanner.close();
    }
}
