package Misc.Locks;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value value = new Value();
        value.setVal(0);

        Lock lock = new ReentrantLock();

        Adder adder = new Adder(value, lock);
        Subtractor subtractor = new Subtractor(value, lock);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Void> adderFuture = executorService.submit(adder);
        Future<Void> subtractorFuture = executorService.submit(subtractor);

        adderFuture.get();
        subtractorFuture.get();

        System.out.println("Final value: " + value.getVal());
        executorService.shutdown();
    }
}
