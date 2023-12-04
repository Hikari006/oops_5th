import java.util.*;

public class Duplicates {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        try {
            checkDuplicates(arr);
        } catch (MyException e) {
            System.out.println("Error: Duplicate elements found" + e.getMessage());
        }
    }

     public static void checkDuplicates(int arr[]) throws MyException {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (!set.add(i)) {
                throw new MyException("Duplicate element: " + i);
            }
        }
        System.out.println("No Duplicates");
    }
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
