package Task20_PerformanceLab.Task01_ver02;

/**
 * 24.12
 * Недостатки: нет ввода имени файла со строки, файл захардкожен
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) throws IOException {

        try {
            File file = new File("C:\\Users\\juta\\Desktop\\Java [HabrTasks]\\Projects\\JavaHabrTasks\\src\\Task20_PerformanceLab\\Task01\\file.txt");
            Scanner sc = new Scanner(file);

            ArrayList<Integer> arr = new ArrayList<>();

            while(sc.hasNext()) {
                String line = sc.next();
                arr.add(Integer.parseInt(line));
            }

            System.out.println("Числа в файле: " + arr);

            System.out.println("Максимальное число: " + maxNumber(arr));
            System.out.println("Минимальное число: " + minNumber(arr));
            System.out.println("Среднее арифметическое: " + averageNumber(arr));
            System.out.println("Медиана (перцентиль 50%): " + mediana(arr));
            System.out.println("Перцентиль 90%: " + percentile(arr));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int maxNumber(ArrayList<Integer> arr) {
        int max = arr.get(arr.size() - 1);
        for(int i=0; i<arr.size(); i++) {
            if (max < arr.get(i)) {
                max = arr.get(i);
            }
        }
        return max;
    }

    public static int minNumber(ArrayList<Integer> arr) {
        int min = arr.get(0);
        for(int i=0; i<arr.size(); i++) {
            if (min > arr.get(i)) {
                min = arr.get(i);
            }
        }
        return min;
    }

    public static int averageNumber(ArrayList<Integer> arr) {
        int sum = 0;
        int avg = 0;
        for(int i=0; i<arr.size(); i++) {
            sum +=arr.get(i);
            avg = sum / arr.size();
        }
        return avg;
    }

    public static int mediana(ArrayList<Integer> arr) {
        int mid = arr.size() / 2;
        mid = mid > 0 && mid % 2 == 0 ? mid - 1 : mid;
        return mid;
    }

    public static int percentile(ArrayList<Integer> arr) {
        double percInd = arr.size() * 0.9;
        int perc = arr.get((int) percInd);
        return perc;
    }
}

