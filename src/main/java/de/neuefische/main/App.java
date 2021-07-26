package de.neuefische.main;

import de.neuefische.entities.Order;
import de.neuefische.entities.Product;
import de.neuefische.services.OrderService;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Product product1 = new Product(1, "bier");
        Product product2 = new Product(2, "wein");
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        Order order1 = new Order(1, productList);
        OrderService orderService = new OrderService();
        orderService.addOrder(order1);
        System.out.println("OrderList: " + orderService.listOrders());
    }
}
