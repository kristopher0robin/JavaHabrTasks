package Task18_SelectionSort;

public class SelectionSort2 {

    public static void main(String[] args) {
        int arr[] = new int[10];
        /** Заполнение массива случайными числами */
        for (int i=0; i<arr.length; i++) {
            arr[i] = ((int)(Math.random() * 50));
        }
        System.out.println("Массив случайных чисел:");
        for (int v : arr) {
            System.out.print(v + " ");
        }
        sort(arr);
        System.out.println();
        System.out.println("Отсортированный массив:");
        for (int v : arr) {
            System.out.print(v + " ");
        }
    }

    /** Метод сортировки слиянием, неустойчивая реализация */
    public static void sort(int[] arr) {
        for (int min=0; min < arr.length-1; min++) {
            int least = min;
            for (int j=min+1; j<arr.length; j++) {
                if (arr[j] < arr[least]) {
                    least = j;
                }
            }

            int tmp = arr[min];
            arr[min] = arr[least];
            arr[least] = tmp;
        }
    }

}
