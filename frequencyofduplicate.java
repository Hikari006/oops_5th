import java.util.HashMap;
import java.util.Scanner;

public class Duplicates1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count the frequency of each element
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Iterate through the keys and print duplicates along with their frequency
        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (frequency > 1) {
                System.out.println("Duplicate element: " + key + ", Frequency: " + frequency);
            }
        }
    }
}
