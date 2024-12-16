package Misc.Semaphores;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private final Store store;
    private final Semaphore producerSemaphore;
    private final Semaphore consumerSemaphore;

    public Consumer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        while (true) {
            //consumer should always keep consuming items
            try {
                consumerSemaphore.acquire();
                store.removeItem();
                producerSemaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
