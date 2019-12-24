package Task18_SelectionSort;

/**
public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = new int[10];
    }

    public static int findSmallest (int arr[]) {
        int smallest = arr[0];
        int smallestIndex = 0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int selectionSort (int arr[]) {
        int newArr[] = new int[10];

        for (int i=0; i<arr.length; i++) {
            int smallest = findSmallest(arr);
            // newArr.insert() // Добавление наименьшего элемента в новый массив
        }
    }

}
*/