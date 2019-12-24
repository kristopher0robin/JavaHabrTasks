package Task08_BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Task08_01 {

    public static void main(String[] args) {

        int arr[] = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int item = in.nextInt();

        for(int i=0; i<arr.length; i++) {
            arr[i] = ((int)(Math.random() * 2));
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);

        System.out.println(arr);
        System.out.println(bruteForce(arr, item));

        int high = arr[arr.length-1];
        int low = arr[0];
        System.out.println(binarySearch(arr, item, low, high));

    }

    public static int bruteForce(int arr[], int item) {

        for(int i=0; i<arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int arr[], int item, int low, int high) {

        int mid = (low + high) / 2; // середина
        if (high < low) { // больше делить нечего
            return -1;
        }
        if (item == arr[mid]) { // если нашёлся
            return mid;
        } else if (item < arr[mid]) { // ищем в левой половине
            return binarySearch(arr, item, low, mid - 1);
        } else {
            return binarySearch( // ищем в правой половине
                    arr, item, mid + 1, high);
        }
    }
}
