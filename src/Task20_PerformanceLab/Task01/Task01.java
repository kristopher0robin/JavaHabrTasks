package Task20_PerformanceLab.Task01;

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

            System.out.print(arr);

            int max = arr.get(arr.size() - 1);
            int min = arr.get(0);
            int sum = 0;
            int avg = 0;

            for (int i = 0; i < arr.size(); i++) {
                if (max < arr.get(i)) {
                    max = arr.get(i);
                }
                if (min > arr.get(i)) {
                    min = arr.get(i);
                }
                sum += arr.get(i);
                avg = sum / arr.size();
            }

            int mid = arr.size() / 2;
            mid = mid > 0 && mid % 2 == 0 ? mid - 1 : mid;

            double percInd = arr.size() * 0.9;
            int perc = arr.get((int)percInd);

            System.out.println();
            System.out.println("Максимальное число: " + max);
            System.out.println("Минимальное число: " + min);
            System.out.println("Среднее арифметическое: " + avg);
            System.out.println("Медиана: " + mid);
            System.out.println("Перцентиль 90% " + perc);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

