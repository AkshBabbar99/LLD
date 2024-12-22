package GenericsLab;

import java.util.*;

class Inventory<T extends Item> {

    private final HashMap<String, T> items;

    public Inventory() {
        items = new HashMap<>();
    }

    public void addItem(T item) {
        if(items.containsKey(item.getId())){
            System.out.println("Item with ID " + item.getId() + " already exists in the inventory.");
            return;
        }
        items.put(item.getId(), item);
    }

    public T getItem(String id) {
        return items.get(id);
    }

    public void removeItem(T item) {
        items.remove(item.getId());
    }

    public List<T> getAllItems(){
        return new ArrayList<>(items.values());
    }

    public List<T> filterByPrice(double minPrice, double maxPrice){
        List<T> filteredItems = new ArrayList<>();
        for(T item : items.values()){
            if(item.getPrice() >= minPrice && item.getPrice() <= maxPrice){
                filteredItems.add(item);
            }
        }
        return filteredItems;
    }

    public List<T> filterByAvailability(){
        List<T> filteredItems = new ArrayList<>();
        for(T item : items.values()){
            if(item.getQuantity() > 0){
                filteredItems.add(item);
            }
        }
        return filteredItems;
    }

    public List<T> sortItems(Comparator<T> comparator){
        List<T> sortedItems = new ArrayList<>(items.values());
        sortedItems.sort(comparator);
        return sortedItems;
    }
}
