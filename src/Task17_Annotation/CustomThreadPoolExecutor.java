package Task17_Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Retention(RetentionPolicy.RUNTIME)
@interface Repeat {
    int value();
}

public class CustomThreadPoolExecutor extends ThreadPoolExecutor {

    public CustomThreadPoolExecutor(int corePoolSize) {
        // why Integer.MAX_VALUE, 0m and TimeUnit.MILLISECONDS?
        // see Executors.newFixedThreadPool(int nThreads)
        super(corePoolSize, Integer.MAX_VALUE, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
    }

    @Override
    public void execute(Runnable command) {
        if (command != null) {
            Class<? extends Runnable> runnableClass = command.getClass();
            Repeat repeat = runnableClass.getAnnotation(Repeat.class);
            for (int i=0; i < (repeat != null ? repeat.value() : 1); i++) {
                super.execute(command);
            }
        }
    }

}
