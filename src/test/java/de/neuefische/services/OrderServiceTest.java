package de.neuefische.services;

import de.neuefische.entities.Order;
import de.neuefische.entities.Product;
import de.neuefische.repositories.OrderDB;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    @Test
    public void addOrder() {
        // GIVEN

        // WHEN
        // THEN

    }

    @Test
    public void listOrders() {
        // GIVEN
        Product product = new Product(1, "bier");
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        Order order = new Order(1, productList);
        List<Order> orderList = new ArrayList<>();
        orderList.add(order);
        OrderDB orderDB = new OrderDB(orderList);
        // WHEN
        List <Order> actual = OrderService.listOrders();
        // THEN
        assertEquals(orderList, actual);
    }

}