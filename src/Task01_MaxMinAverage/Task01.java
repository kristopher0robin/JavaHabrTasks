package Task01_MaxMinAverage;

/**
 * Created by juta on 12/5/2019.
 */

public class Task01 {

    public static void main(String[] args) {
        int arr[];
        arr = new int[10];
        for(int i=0; i<arr.length; i++) {
            arr[i] = ((int)(Math.random() * 50));
            System.out.print(arr[i] + " ");
        }

        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        int avg = 0;

        for(int i=0; i<arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            sum += arr[i];
            avg = sum / arr.length;
            }

        System.out.println();
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
        System.out.println("Среднее арифметическое: " + avg);
        // System.out.println(sum);

    }
}
