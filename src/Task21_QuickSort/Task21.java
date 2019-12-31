package Task21_QuickSort;

/**
 * def quicksort(array):
 *  if len(array) < 2:                                  // базовый случай: массивы с 0 и 1 элементом уже отсортированы
 *      return array;
 *  else:
 *      pivot = array[0]                                // рекурсивный случай
 *      less = [i for i in array[1:] if i <= pivot]     // подмассив всех элементов меньше опорного
 *      greater = [i for i in array[1:] if i > pivot]   // подмассив всех элементов больше опорного
 *
 *      return quicksort(less) + [pivot] + quicksort(greater)
 *
 * print quicksort([10, 5, 2, 3])
 */

/**
public class Task21 {

    public static void main(String[] args) {

        Integer[] integers = new Integer[10];
        Random r = new Random();
        for (int i=0; i < integers.length; i++) {
            integers[i] = r.nextInt(100);
        }
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(integers));


        System.out.println(arr);
        quickSort(arr);
    }

    public static ArrayList<Integer> quickSort(ArrayList<Integer> arr) {

        ArrayList<Integer> array = new ArrayList();
        if (arr.size() < 2) {
            System.out.println(arr);
            return array;
        } else {

            int pivot = arr.get(0);

            for (int i=0; i < arr.size(); i++) {
                if (array.get(i) < pivot) {
                    array.add(i);
                }
            }

            for (int i=0; i < arr.size(); i++) {
                if (array.get(i) > pivot) {
                    array.add(i);
                }
            }
        }
        return array;
    }
}

*/