package Task20_PerformanceLab.Task01;

/**
 * 24.12
 * Недостатки: не рассчитывает медиану и перцентиль, нет ввода имени файла со строки, файл захардкожен, говнокод в считывании строки
 */

import java.io.*;
import java.util.ArrayList;

public class Task01 {

    public static void main(String[] args) throws IOException {

        try {
            File file = new File("C:\\Users\\juta\\Desktop\\Java [HabrTasks]\\Projects\\JavaHabrTasks\\src\\Task20_PerformanceLab\\Task01\\file.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            ArrayList<Integer> arr = new ArrayList();
            arr.add(Integer.parseInt(line));
            while (line != null) {
                line = reader.readLine();
                if (line != null) {
                    arr.add(Integer.parseInt(line));
                }
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

            System.out.println();
            System.out.println("Максимальное число: " + max);
            System.out.println("Минимальное число: " + min);
            System.out.println("Среднее арифметическое: " + avg);
            System.out.println("Медиана: ");
            System.out.println("Перцентиль: ");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

