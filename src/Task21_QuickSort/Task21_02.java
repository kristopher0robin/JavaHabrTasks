package Task21_QuickSort;

import java.util.Arrays;

public class Task21_02 {

    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i=0; i<arr.length; i++) {
            arr[i] = ((int)(Math.random() * 50));
        }
        System.out.println("Было");
        System.out.println(Arrays.toString(arr));

        int low = 0;
        int high = arr.length - 1;

        quickSort(arr, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {

        if (arr.length == 0) {
            return;
        }

        if (low >= high) {
            return;
            // завершить выполнение, если уже нечего делить
        }

        int middle = low + (high - low) / 2;
        int opor = arr[middle];

        // разделить на подмассивы, которые больше и меньше опорного элемента
        int i=low;
        int j=high;

        while (i <= j) {
            while (arr[i] < opor) {
                i++;
            }
            while (arr[j] > opor) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);
    }
}
