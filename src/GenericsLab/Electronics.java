package GenericsLab;

class Electronics extends Item {

    private int warranty;

    public Electronics(String id, String name, double price, int quantity, int warranty) {
        super(id, name, price, quantity);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Item: Electronics\n" +
                "ID: " + getId() + "\n" +
                "Name: " + getName() + "\n" +
                "Price: " + getPrice() + "\n" +
                "Quantity: " + getQuantity() + "\n" +
                "Warranty: " + warranty + "\n";
    }
}
