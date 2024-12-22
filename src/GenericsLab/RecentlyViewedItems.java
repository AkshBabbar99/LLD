package GenericsLab;

import java.util.*;

class RecentlyViewedItems {

    private LinkedList<Item> items;
    private int MAX_SIZE = 10;

    public RecentlyViewedItems() {
        items = new LinkedList<>();
    }

    public void addRecentlyViewedItem(Item item){
        items.remove(item);
        if(items.size() == MAX_SIZE){
            items.removeLast();
        }
        items.addFirst(item);
    }

    public List<Item> getRecentlyViewedItems(){
        return new ArrayList<>(items);
    }

}
