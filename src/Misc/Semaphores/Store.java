package Misc.Semaphores;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
    private int maxSize;
    private ConcurrentLinkedQueue<Object> items;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedQueue<>();
    }

    public void addItem(Object item){
        System.out.println("Producer is producing the item:" + items.size());
        items.add(item);
    }

    public void removeItem(){
        System.out.println("Consumer is consuming the item:" + items.size());
        items.poll();
    }

    public ConcurrentLinkedQueue<Object> getItems() {
        return items;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
}
