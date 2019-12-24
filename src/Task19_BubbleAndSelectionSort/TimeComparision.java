package Task19_BubbleAndSelectionSort;

public class TimeComparision {

    public static void main(String[] args) {
        /** 1) Создание массива случайных чисел */
        int arr[] = new int[10];
        for (int i=0; i<arr.length; i++) {
            arr[i] = ((int)(Math.random() * 50));
        }

        long time = System.currentTimeMillis(); // текущее время, unix-time
        BubbleSort(arr);
        System.out.println("Пузырьковая сортировка:");
        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
        System.out.println("Время выполнения пузырьковой сортировки:");
        System.out.println((double)((System.currentTimeMillis() - time)/(1000)) + " cек.");

        time = System.currentTimeMillis(); // текущее время, unix-time
        SelectionSort(arr);
        System.out.println("Сортировка обменомы:");
        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
        System.out.println("Время выполнения сортировкой выбором:");
        System.out.println((double)((System.currentTimeMillis() - time)/(1000)) + " сек.");

    }

    public static void BubbleSort (int arr[]) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void SelectionSort (int arr[]) {
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
