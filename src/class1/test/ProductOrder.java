package class1.test;

public class ProductOrder {
    String productName;
    int price;
    int quantity;
    
    public ProductOrder(String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    
    public int sum() {
        return this.price * this.quantity;
    }
}
