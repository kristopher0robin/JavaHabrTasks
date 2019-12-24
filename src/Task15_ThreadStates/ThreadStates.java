package Task15_ThreadStates;

public class ThreadStates {

    public static void main(String[] args) {

        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println(getState());
            }
        };
        System.out.println(thread.getState());
        thread.start();
        try {
            // Тут сложность есть только для вывода состояния TERMINATED
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getState());

        /**
         * Вывод состояния WAITING
         *
         * @param strings
         * @throws InterruptedException
         */

        /**
        public static void main(String[] strings) throws InterruptedException {

        Object lock = new Object();

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    synchronized(lock) {
                        lock.notifyAll();
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        synchronized (lock) {
            thread.start(); // запустим поток
            lock.wait(); // будем ждать, пока поток не запустится
            System.out.println(thread.getState()); // WAITING
            lock.notifyAll();
            System.out.println(thread.getState()); // BLOCKED
        }
    }
         */

        /**
         * Вывод состояния TIMED_WAITING
         *
         * @params strings
         * @throws InterruptedException
         */

        /**
        public static void main(String[] strings) throws InterruptedException {

            Object lock = new Object();

            Thread thread = new Thread() {
                @Override
                public void run() {
                    try {
                        synchronized(lock) {
                            lock.notifyAll();
                            lock.wait(3000);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

            synchronized(lock) {
                thread.start(); // запустим поток
                lock.wait(); // будем ждать, пока поток не запустится
                System.out.println(thread.getState()); // TIMED_WAITING
            }
        }
         */
    }
}
