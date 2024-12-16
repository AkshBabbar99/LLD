package Misc.SynchronizedMethods;

import java.util.concurrent.Callable;

class Subtractor implements Callable<Void> {
    private Value value;

    Subtractor(Value value) {
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 1; i <= 10000; i++) {
            value.incrementBy(-i);
        }
        return null;
    }
}