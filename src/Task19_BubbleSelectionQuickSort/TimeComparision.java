package Task19_BubbleSelectionQuickSort;

public class TimeComparision {

    public static void main(String[] args) {
        int arr[] = new int[100000];
        for (int i=0; i<arr.length; i++) {
            arr[i] = ((int)(Math.random() * 50));
        }

        long time = System.currentTimeMillis();                     // текущее время, unix-time
        BubbleSort(arr);
        System.out.println();
        System.out.println("Время выполнения пузырьковой сортировки:");
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();                          // текущее время, unix-time
        SelectionSort(arr);
        System.out.println();
        System.out.println("Время выполнения сортировкой выбором:");
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();                          // текущее время, unix-time
        int low = 0;
        int high = arr.length-1;
        quickSort(arr, low, high);
        System.out.println();
        System.out.println("Время выполнения быстрой сортировки:");
        System.out.println(System.currentTimeMillis() - time);
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
