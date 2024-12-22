package GenericsLab;

class Clothing extends Item {

    private String size;

    public Clothing(String id, String name, double price, int quantity, String size) {
        super(id, name, price, quantity);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Item: Clothing\n" +
                "ID: " + getId() + "\n" +
                "Name: " + getName() + "\n" +
                "Price: " + getPrice() + "\n" +
                "Quantity: " + getQuantity() + "\n" +
                "Size: " + size + "\n";
    }
}
