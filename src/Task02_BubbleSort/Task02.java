package Task02_BubbleSort;

/**
 * Created by juta on 12/5/2019.
 */

public class Task02 {

    public static void main (String[] args) {
        int arr[];
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 50));
            System.out.print(arr[i] + " ");
        }

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println();

        for (int v : arr)
            System.out.print(v + " ");

    }
}