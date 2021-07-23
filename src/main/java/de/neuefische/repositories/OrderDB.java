package de.neuefische.repositories;

import de.neuefische.entities.Order;
import de.neuefische.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class OrderDB {
    private List<Order> orderList = new ArrayList<>();

    public OrderDB(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<Order> list(){
        return orderList;
    }
    public Order get(int id) {
        Product  product = new Product(1, "p");
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        Order finalOrder = new Order(1, productList);
        for (Order order : orderList) {
            if (order.getId() == id) {
                finalOrder = order;
            }
        }
        return finalOrder;
    }
}
