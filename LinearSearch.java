import java.util.Scanner;

public class LinearSearch {

    static int linearSearch(int array[], int n, int key) {
        for (int i = 0; i < n; i++) {
            if (array[i] == key) {
                return i;
            }
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
        System.out.println("The element is present at : " + linearSearch(array, n, key));
        sc.close();
    }

}
