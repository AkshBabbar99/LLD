package Misc.SynchronizedMethods;

import java.util.concurrent.Callable;

class Adder implements Callable<Void> {

    private Value value;

    Adder(Value value) {
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 1; i <= 10000; i++) {
            value.incrementBy(i);
        }
        return null;
    }
}