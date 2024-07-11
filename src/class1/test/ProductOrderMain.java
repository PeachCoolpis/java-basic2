package class1.test;

import java.util.Arrays;

public class ProductOrderMain {
    public static void main(String[] args) {
        
        
        ProductOrder[] productOrders = new ProductOrder[]{
                new ProductOrder("두부", 2000, 2),
                new ProductOrder("김치", 5000, 1),
                new ProductOrder("콜라", 1500, 2)
        };
        for (ProductOrder productOrder : productOrders) {
            String format = String.format("상품명: %s, 가격: %s, 수량: %s", productOrder.productName, productOrder.price, productOrder.quantity);
            System.out.println(format);
        }
        int sum = Arrays.stream(productOrders)
                .mapToInt(ProductOrder::sum)
                .sum();
        System.out.println("총 결제 금액: " + sum);
        
    }
}
