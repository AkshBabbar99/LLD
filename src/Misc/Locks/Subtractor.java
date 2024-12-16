package Misc.Locks;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.*;

class Subtractor implements Callable<Void> {
    private Value value;
    private Lock lock;

    Subtractor(Value value, Lock lock) {
        this.value = value;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 1; i <= 10000; i++) {
            lock.lock();
            value.setVal(value.getVal() - i);
            lock.unlock();
        }
        return null;
    }
}