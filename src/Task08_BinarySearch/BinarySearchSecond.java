package Task08_BinarySearch;
import java.util.Scanner;

public class BinarySearchSecond {

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9};
        int low = 0;
        int high = arr.length - 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int item = in.nextInt();

        while (low <= high) {
            int mid = low + high;
            int guess = arr[mid];

            if (guess == item) {
                int midActual = mid+1;
                System.out.println("Номер элемента: " + midActual);
            }
            if (guess > item) {
                high = mid-1;
            } else {
                low = mid+1;
            }
            System.out.println("Нет числа в массиве");
        }
    }
}
