package Task08_BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Task08_03 {

    public static void main(String[] args) {

        System.out.println(binarySearch());

    }

    public static String binarySearch() {

        /** 1) Создание массива случайных чисел */
        int arr[] = new int[10];
        for (int i=0; i<arr.length; i++) {
            arr[i] = ((int)(Math.random() * 50));
        }

        /** 2) Сортировка массива и вывод его элементов */
        Arrays.sort(arr);
        for (int v : arr)
            System.out.print(v + " ");

        int low = 0;
        int high = arr.length - 1;

        /** 3) Ввод искомого значения */
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите число: ");
        int key = in.nextInt();

        /** 4) Логика перебора массива двоичным поиском (переделать возвращаемое значение из метода) */
        while (low <= high) {
            int mid = ( low + high ) / 2;
            int guess = arr[mid];
            if (guess == key) {
                System.out.print("Номер элемента: " + mid + " ");
                break;
            }
            if (guess > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return "Число не найдено";
    }
}
