package GenericsLab;

class Order implements Comparable<Order> {

    private String id;
    private boolean isExpress;

    public Order(String id, boolean isExpress) {
        this.id = id;
        this.isExpress = isExpress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    @Override
    public int compareTo(Order o) {
        if(this.isExpress() && o.isExpress()){
            return this.getId().compareTo(o.getId());
        }else if (this.isExpress()){
            return -1;
        }else{
            return 1;
        }
    }
}