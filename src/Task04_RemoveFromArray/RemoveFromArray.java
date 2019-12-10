package Task04_RemoveFromArray;

import java.util.Arrays;

public class RemoveFromArray {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int number = 5;
        Arrays.toString(removeElement(arr, number));
        System.out.println(Arrays.toString(removeElement(arr, number)));
    }

    public static int[] removeElement(int arr[], int number) {

        int offset = 0;

        // Главная логика удаления элемента
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == number) {
                offset++;
            } else {
                arr[i-offset] = arr[i];
            }
        }

        return Arrays.copyOf(arr, arr.length - offset);

    }

}
