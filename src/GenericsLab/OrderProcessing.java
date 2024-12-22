package GenericsLab;

import java.util.*;

class OrderProcessing {

    private final Queue<Order> orders;

    public OrderProcessing() {
        orders = new PriorityQueue<>();
    }

    public void addOrder(Order order){
        orders.offer(order);
    }

    public Order processOrder(){
        return orders.poll();
    }

    public int getOrderSize(){
        return orders.size();
    }
}
