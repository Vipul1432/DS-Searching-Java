import java.util.Scanner;

public class BinarySearch {

    static int binarySearch(int array[], int n, int key) {
        int start = 0;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == key)
                return mid;

            if (array[mid] < key)
                start = mid + 1;

            else
                end = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the element of array : ");
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            // Reading array elements from the user
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the number that you want to search : ");
        int key = sc.nextInt();
        System.out.println("The element is present at : " + binarySearch(array, n, key));
        sc.close();
    }
}
