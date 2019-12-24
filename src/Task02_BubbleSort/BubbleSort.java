package Task02_BubbleSort;

public class BubbleSort {

    public static void main (String[] args) {
        int arr[];
        arr = new int[10];
        System.out.println("Неотсортированный массив: ");
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
        System.out.println("Отсортированный массив: ");
        for (int v : arr) {
            System.out.print(v + " ");
        }

    }
}
