package Task16_ThreadSynchronization;

class StepThread extends Thread {

    // общий для двух потоков lock
    private Object lock;

    public StepThread(Object object) {
        this.lock = object;
    }

    /** Идея такова: выводим имя потока, потом поток засыпает,
     *  перед этим уведомив другой поток, о том, что теперь его очередь.
     *
     *  После вызова первым потоком lock.notify() второй
     *  поток не просыпается сразу, а ждет,
     *  пока lock не будет освобожден. А когда это происходит,
     *  уже вызван метод lock.wait(), и первый поток ждет своей очереди и
     *  так по кругу.
     */

    @Override
    public void run() {
        while(true) {
            synchronized(lock) {
                try {
                    System.out.println(getName());
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Main {

    public static void main(String[] strings) {
        Object lock = new Object();
        new StepThread(lock).start();
        new StepThread(lock).start();
    }

}