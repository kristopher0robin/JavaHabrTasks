package Task14_Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {

    public static void main(String[] args) {
        compare2Lists();
    }

    public static void compare2Lists () {
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        final int N = 1000000;
        final int M = 1000;
        /** 1) Добавление элементов в ArrayList и LinkedList */
        for (int i=0; i<N; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }

        /** 2) Засечение времени извлечения элементов в ArrayList */
        long startTime = System.currentTimeMillis();
        for(int i=0; i<M; i++) {
            arrayList.get((int) (Math.random() * (N-1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);

        /** 3) Засечение времени извлечения элементов в LinkedList */
        startTime = System.currentTimeMillis();
        for (int i=0; i<M; i++) {
            linkedList.get((int) (Math.random() * (N-1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
