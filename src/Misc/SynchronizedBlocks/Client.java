package Misc.SynchronizedBlocks;

import java.util.concurrent.*;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value value = new Value();
        value.setVal(0);

        Adder adder = new Adder(value);
        Subtractor subtractor = new Subtractor(value);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Void> adderFuture = executorService.submit(adder);
        Future<Void> subtractorFuture = executorService.submit(subtractor);

        adderFuture.get();
        subtractorFuture.get();

        System.out.println("Final value: " + value.getVal());
        executorService.shutdown();
    }
}

